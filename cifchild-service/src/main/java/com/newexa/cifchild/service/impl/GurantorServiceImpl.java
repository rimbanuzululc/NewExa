/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.newexa.cifchild.service.impl;

import com.newexa.cifchild.model.Gurantor;
import com.newexa.cifchild.repository.GurantorRepository;
import com.newexa.cifchild.service.GurantorService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author hp
 */
@Service
public class GurantorServiceImpl implements GurantorService{
    
    @Autowired
    GurantorRepository gurantorRepository;

    @Override
    public List<Gurantor> listGurantor() {
        
        List<Gurantor> listGurantor = gurantorRepository.findAll();
        
        return listGurantor;
        
    }
    
    
    
}
