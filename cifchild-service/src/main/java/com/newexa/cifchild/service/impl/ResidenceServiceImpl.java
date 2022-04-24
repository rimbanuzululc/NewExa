/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.newexa.cifchild.service.impl;

import com.newexa.cifchild.model.Residence;
import com.newexa.cifchild.repository.ResidenceRepository;
import com.newexa.cifchild.service.ResidenceService;
import java.util.Collection;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author hp
 */
@Service
public class ResidenceServiceImpl implements ResidenceService {
    
    @Autowired
    ResidenceRepository repository;
    
    @Override
    public List<Residence> all() {
        
        List<Residence> listRes = repository.findAll();
       
       return listRes;
    }
    
}
