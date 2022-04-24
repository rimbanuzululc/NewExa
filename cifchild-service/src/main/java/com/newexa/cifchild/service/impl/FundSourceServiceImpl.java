/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.newexa.cifchild.service.impl;

import com.newexa.cifchild.model.FundSource;
import com.newexa.cifchild.repository.FundSourceRepository;
import com.newexa.cifchild.service.FundSourceService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author hp
 */
@Service
public class FundSourceServiceImpl implements FundSourceService{
    
    @Autowired
    FundSourceRepository fundSourceRepository;

    @Override
    public List<FundSource> listFund() {
        
        List<FundSource> listFund = fundSourceRepository.findAll();
        
        return listFund;
    }
    
}
