/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.newexa.cifchild.service.impl;

import com.newexa.cifchild.model.Province;
import com.newexa.cifchild.repository.ProvinceRepository;
import com.newexa.cifchild.service.ProvinceService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author hp
 */
@Service
public class ProvinceServiceImpl implements ProvinceService{
    
    @Autowired
    ProvinceRepository provinceRepository;
    
    @Override
    public List<Province> listProvince() {
        List<Province> listProvince = provinceRepository.findAll();
        
        return listProvince;
    }
    
}
