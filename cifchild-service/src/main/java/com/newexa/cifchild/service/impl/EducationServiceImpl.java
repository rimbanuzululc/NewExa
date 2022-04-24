/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.newexa.cifchild.service.impl;

import com.newexa.cifchild.model.Education;
import com.newexa.cifchild.repository.EducationRepository;
import com.newexa.cifchild.service.EducationService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author hp
 */
@Service
public class EducationServiceImpl implements EducationService{
    
    @Autowired
    EducationRepository educationRepository;
    
    @Override
    public List<Education> listEducation() {
        List<Education> listEducation = educationRepository.findAll();
        
        return listEducation;
    }
    
}
