/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.newexa.cifchild.service.impl;

import com.newexa.cifchild.model.SIDRelationBank;
import com.newexa.cifchild.repository.SIDRelationRepository;
import com.newexa.cifchild.service.SIDRelationService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author hp
 */
@Service
public class SIDRelationServiceImpl implements SIDRelationService{

    @Autowired
    SIDRelationRepository dRelationRepository;
    
    @Override
    public List<SIDRelationBank> listSID() {
        
        List<SIDRelationBank> listSID = dRelationRepository.findAll();
        
        return listSID;
        
    }
    
}
