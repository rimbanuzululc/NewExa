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
        
            child.setIdParentCifChild(parent.getIdParentCifChild());
            childRepository.save(child);
            sukses = true;
        }
        
        return sukses;
    }
    
    
}
