/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.newexa.cifchild.service.impl;

import com.newexa.cifchild.model.Relation;
import com.newexa.cifchild.repository.RelationRepository;
import com.newexa.cifchild.service.RelationService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author hp
 */
@Service
public class RelationServiceImpl implements RelationService{

    @Autowired
    RelationRepository relationRepository;
    
    @Override
    public List<Relation> listRelation() {
        List<Relation> listRel = relationRepository.findAll();
        
        return listRel;
    }
    
}
