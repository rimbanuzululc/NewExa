/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.newexa.cifchild.service.impl;

import com.newexa.cifchild.model.JobTitle;
import com.newexa.cifchild.repository.JobTitleRepository;
import com.newexa.cifchild.service.JobTitleService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author hp
 */
@Service
public class JobTitleServiceImpl implements JobTitleService{

    @Autowired
    JobTitleRepository jobTitleRepository;
    
    @Override
    public List<JobTitle> listJob() {
        List<JobTitle> listJob = jobTitleRepository.findAll();
        
        return listJob;
    }
    
}
