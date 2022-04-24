/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.newexa.cifchild.service.impl;

import com.newexa.cifchild.model.CustomerRating;
import com.newexa.cifchild.repository.CustomerRatingRepository;
import com.newexa.cifchild.service.CustomerRatingService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author hp
 */
@Service
public class CustomerRatingServiceImpl implements CustomerRatingService {

    @Autowired
    CustomerRatingRepository ratingRepository;
    
    @Override
    public List<CustomerRating> findAll() {
        List<CustomerRating> cusRat = ratingRepository.findAll();
        
        return cusRat;
    }
    
}
