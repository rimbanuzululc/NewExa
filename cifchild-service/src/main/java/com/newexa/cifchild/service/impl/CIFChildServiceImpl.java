/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.newexa.cifchild.service.impl;

import com.newexa.cifchild.model.CIFChild;
import com.newexa.cifchild.model.ParentCifChild;
import com.newexa.cifchild.model.SubmitCIF;
import com.newexa.cifchild.repository.CIFChildRepository;
import com.newexa.cifchild.repository.ParentCIFRepository;
import com.newexa.cifchild.service.CIFChildService;
import java.util.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author hp
 */
@Service
public class CIFChildServiceImpl implements CIFChildService{
    
    @Autowired
    CIFChildRepository childRepository;
    
    @Autowired
    ParentCIFRepository parentCIFRepository;

    @Override
    public Boolean submit(CIFChild child, ParentCifChild parent) {
        
        Boolean sukses = false;
        ParentCifChild parent2 = parentCIFRepository.save(parent);
        if (parent2.getIdParentCifChild() > 0) {
            
            child.setStatus("WAITING APPROVAL");
            child.setSubmitTime(new Date());
            child.setIdParentCifChild(parent.getIdParentCifChild());
            childRepository.save(child);
            sukses = true;
        }
        
        return sukses;
    }

    @Override
    public Integer update(CIFChild cifChild) {
        
        String status = cifChild.getStatus();
        String cif = cifChild.getCif();
        int id = cifChild.getIdCifChild();
        
        System.out.println("Status = " + status + " cif = " + cif + " id" +id);
        Integer update1 = childRepository.updateStatus(status, cif, id);
        return update1;
    }

    @Override
    public List<CIFChild> listSubmit() {
        
        List<CIFChild> list = childRepository.listToday();
        
        return list;
    }

    @Override
    public int approval(CIFChild cIFChild) {
        
        String status = cIFChild.getStatus();
        int id = cIFChild.getIdCifChild();
        Date apprv = new Date();
        System.out.println("Status = " + status + " Date = " + apprv + " id" +id);
        int approval1 = childRepository.updateApproval(status, apprv, id);
        return approval1;
    }
    
    
}
