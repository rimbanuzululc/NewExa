/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.newexa.cifchild.service.impl;

import com.newexa.cifchild.model.AccountCustomer;
import com.newexa.cifchild.model.CIFChild;
import com.newexa.cifchild.model.CIFChildTWS;
import com.newexa.cifchild.model.ParentCifChild;
import com.newexa.cifchild.model.SubmitCIF;
import com.newexa.cifchild.repository.CIFChildRepository;
import com.newexa.cifchild.repository.ParentCIFRepository;
import com.newexa.cifchild.service.CIFChildService;
import com.newexa.cifchild.stub.EnquiryGetDataCIFResponse;
import com.newexa.cifchild.stub.OpenAccountWadiahResponse;
import com.newexa.cifchild.stub.OpenAccountWadiahValidateResponse;
import com.newexa.cifchild.stub.OpenCIFChildResponse;
import com.newexa.cifchild.stub.OpenCIFChildValidateResponse;
import java.util.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 *
 * @author hp
 */
@Service
public class CIFChildServiceImpl implements CIFChildService{
    
    @Autowired
    private CIFChildRepository childRepository;
    
    @Autowired
    private RestTemplate restTemplate;
    
    String urlTws = "http://localhost:9191/twsservice/";

    @Override
    public int submit(CIFChildTWS childTWS) {
        
        int sukses;
        CIFChildTWS childTWS1 = new CIFChildTWS();
        
        childTWS1 = childRepository.checkDuplicate(childTWS.getLegalIdNo());
        
        if (childTWS1 == null) {
            
            childTWS.setStatus("WAITING_APPROVAL");
            childTWS.setSubmitTime(new Date());
            childTWS1 = childRepository.save(childTWS);

            if (childTWS1 != null) {
                sukses = 0;
            } else{
                sukses = 2;
            }
        } else {
            
            sukses = 3;
        }
       
        
        return sukses;
    }

    @Override
    public Integer update(CIFChildTWS cifChild) {
        
        String status = cifChild.getStatus();
        String cif = cifChild.getCif();
        int id = cifChild.getIdCifChild();
        Date apprv = new Date();
        
        int hasil;
        
        childRepository.updateStatus(status, cif, apprv,id);
        
        if (status.equalsIgnoreCase("APPROVED")) {
            
            AccountCustomer accountCustomer = new AccountCustomer();
            accountCustomer.setAcOpenPurpose(cifChild.getAcOpenPurpose());
            accountCustomer.setAccountOfficer(cifChild.getAccountOfficer());
            accountCustomer.setCifNo(cif);
            accountCustomer.setCurrency("IDR");
            accountCustomer.setName(cifChild.getName1());

            AccountCustomer accountRespon = new AccountCustomer();

            accountRespon = restTemplate.postForObject("http://localhost:9191/validateAccount", accountCustomer, AccountCustomer.class);

            if (accountRespon != null && accountRespon.getIdAccountCustomer() > 0) {

                AccountCustomer accountRespon1 = new AccountCustomer();
                accountRespon1 = restTemplate.postForObject("http://localhost:9191/authorAccount", accountCustomer, AccountCustomer.class);

                if (accountRespon1 != null && accountRespon1.getCifNo() != null) {

                    hasil = 0;
                } else {
                    hasil = 1;
                }
            } else {
                hasil = 1;
            }
        } else {
            hasil = 0;
        }
       
        
        
        return hasil;
    }

    @Override
    public List<CIFChildTWS> listSubmit() {
        
        List<CIFChildTWS> list = childRepository.listToday();
        
        return list;
    }

//    @Override
//    public int approval(CIFChild cIFChild) {
//        
//        String status = cIFChild.getStatus();
//        int id = cIFChild.getIdCifChild();
//        Date apprv = new Date();
//        System.out.println("Status = " + status + " Date = " + apprv + " id" +id);
//        int approval1 = childRepository.updateApproval(status, apprv, id);
//        return approval1;
//    }

    @Override
    public OpenCIFChildValidateResponse validateCIFChild(CIFChildTWS childTWS) {
        
        OpenCIFChildValidateResponse childValidateResponse = restTemplate.postForObject(urlTws + "validateCifChild", childTWS, OpenCIFChildValidateResponse.class);
        
        return childValidateResponse;
        
    }

    @Override
    public OpenCIFChildResponse authorFChild (CIFChildTWS childTWS) {
        
        OpenCIFChildResponse childResponse = restTemplate.postForObject(urlTws + "authorCIFChild", childTWS, OpenCIFChildResponse.class);
        
        return  childResponse;
    }

    @Override
    public EnquiryGetDataCIFResponse dataCIFResponse(String id) {
        
        EnquiryGetDataCIFResponse childResponse = restTemplate.postForObject(urlTws + "enquiryCIF?ID=", id, EnquiryGetDataCIFResponse.class);
        
        return childResponse;
    }

    
    
}
