/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.newexa.cifchild.service.impl;

import com.newexa.cifchild.model.Marital;
import com.newexa.cifchild.repository.MaritalRepository;
import com.newexa.cifchild.service.MaritalService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author hp
 */
@Service
public class MaritalServiceImpl implements MaritalService{
    
    @Autowired
    MaritalRepository maritalRepository;
    
    @Override
    public List<Marital> findMarital() {
        List<Marital> listMarital = maritalRepository.findAll();
        
        return listMarital;
    }
    
    
}
