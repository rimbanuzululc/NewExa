/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.newexa.cifchild.service;

import com.newexa.cifchild.model.Legal;
import java.util.List;

/**
 *
 * @author hp
 */
public interface LegalService {
    
    List<Legal> listLegal (String legal);
    
}
