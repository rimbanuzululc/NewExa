/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.newexa.cifchild.controller;

import com.newexa.cifchild.model.Residence;
import com.newexa.cifchild.repository.ResidenceRepository;
import com.newexa.cifchild.response.ResponseHandler;
import com.newexa.cifchild.service.ResidenceService;
import java.util.Collection;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author hp
 */
@RestController
@RequestMapping("/residence")
public class ResidenceController {
    
    @Autowired
    ResidenceService residenceService; 
    
    @Autowired
    ResidenceRepository residenceRepository;
    
    @GetMapping(value = "")
    public ResponseEntity<Object> findAll (){
        
        List<Residence> listAll = residenceRepository.findAll();
        
        return ResponseHandler.generateResponse("Berhasil", HttpStatus.OK, true, listAll);
    }
    
}
