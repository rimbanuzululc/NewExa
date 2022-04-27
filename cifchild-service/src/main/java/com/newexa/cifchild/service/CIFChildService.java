/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.newexa.cifchild.service;

import com.newexa.cifchild.model.CIFChild;
import com.newexa.cifchild.model.ParentCifChild;
import com.newexa.cifchild.model.SubmitCIF;
import java.util.List;

/**
 *
 * @author hp
 */
public interface CIFChildService {
    
    Boolean submit (CIFChild child, ParentCifChild parent);
    
    Integer update (CIFChild cifChild);
    
    List<CIFChild> listSubmit ();
    
    int approval (CIFChild child);
    
}
