/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.newexa.cifchild.service.impl;

import com.newexa.cifchild.model.AcctOpenPurpose;
import com.newexa.cifchild.repository.AcctOpenPurposeRepository;
import com.newexa.cifchild.service.AcctOpenPurposeService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author hp
 */
@Service
public class AcctOpenPurposeServiceImpl implements AcctOpenPurposeService{
    
    @Autowired
    AcctOpenPurposeRepository acctOpenPurposeRepository;
    
    @Override
    public List<AcctOpenPurpose> listAcct() {
        List<AcctOpenPurpose> list= acctOpenPurposeRepository.findAll();
        
        return list;
    }
    
}
