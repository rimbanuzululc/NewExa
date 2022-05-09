/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.newexa.cifchild.service;

import com.newexa.cifchild.model.CIFChild;
import com.newexa.cifchild.model.CIFChildTWS;
import com.newexa.cifchild.stub.EnquiryGetDataCIFResponse;
import com.newexa.cifchild.stub.OpenCIFChildResponse;
import com.newexa.cifchild.stub.OpenCIFChildValidateResponse;
import java.util.List;

/**
 *
 * @author hp
 */
public interface CIFChildService {
    
    int submit (CIFChildTWS childTWS);
    
    Integer update (CIFChildTWS cifChild);
    
    List<CIFChildTWS> listSubmit ();
    
//    int approval (CIFChild child);
    
    //Connect to TWS
    OpenCIFChildValidateResponse validateCIFChild (CIFChildTWS childTWS);
    OpenCIFChildResponse authorFChild (CIFChildTWS childTWS);
    EnquiryGetDataCIFResponse dataCIFResponse (String id);
}
