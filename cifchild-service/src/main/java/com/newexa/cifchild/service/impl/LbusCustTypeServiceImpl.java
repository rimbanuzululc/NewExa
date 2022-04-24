package com.newexa.cifchild.service.impl;


import com.newexa.cifchild.model.LBUSCustType;
import com.newexa.cifchild.repository.LbusCustTypeRepository;
import com.newexa.cifchild.service.LbusCustTypeService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hp
 */
@Service
public class LbusCustTypeServiceImpl implements LbusCustTypeService{
    
    @Autowired
    LbusCustTypeRepository custTypeRepository;
    
    @Override
    public List<LBUSCustType> listLbus() {
        
        List<LBUSCustType> listLbus = custTypeRepository.findAll();
        return listLbus;
    }
    
}
