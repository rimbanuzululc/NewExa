/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.newexa.cifchild.service.impl;

import com.newexa.cifchild.model.DistrictCode;
import com.newexa.cifchild.repository.DistrictCodeRepository;
import com.newexa.cifchild.service.DistrictCodeService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author hp
 */
@Service
public class DistrictCodeServiceImpl implements DistrictCodeService {

    @Autowired
    DistrictCodeRepository codeRepository;
    
    @Override
    public List<DistrictCode> listDistrictByProv(String idProvince) {
        
        List<DistrictCode> listDistrict = codeRepository.listDistrictbyProvince(idProvince);
        
        return listDistrict;
        
    }
    
}
