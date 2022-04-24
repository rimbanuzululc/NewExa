/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.newexa.cifchild.service.impl;

import com.newexa.cifchild.model.Legal;
import com.newexa.cifchild.repository.LegalRepository;
import com.newexa.cifchild.service.LegalService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author hp
 */
@Service
public class LegalServiceImpl implements LegalService{

    @Autowired
    LegalRepository legalRepository;
    
    @Override
    public List<Legal> listLegal(String legal) {
        
        List<Legal> listLegeal;
        
        if (legal == "Child" || legal.equals("Child")) {
            listLegeal = legalRepository.findChild();
        } else if (legal == "Parent" || legal.equals("Parent")) {
            listLegeal = legalRepository.findParent();
        } else {
            listLegeal = null;
        }
        
        return listLegeal;
    }
    
    
    
}
