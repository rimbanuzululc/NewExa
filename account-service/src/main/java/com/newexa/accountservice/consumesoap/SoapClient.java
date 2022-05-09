/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.newexa.accountservice.consumesoap;

/**
 *
 * @author hp
 */

import com.newexa.accountservice.stub.OpenAccountWadiahResponse;
import com.newexa.accountservice.stub.OpenAccountWadiahValidateResponse;
import javax.xml.bind.JAXBElement;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;


public class SoapClient extends WebServiceGatewaySupport {
        
    public OpenAccountWadiahValidateResponse openWadiahValidate (String url, Object String ){
        JAXBElement res = (JAXBElement) getWebServiceTemplate().marshalSendAndReceive(url, String);
        return (OpenAccountWadiahValidateResponse) res.getValue();
    }
    
    public OpenAccountWadiahResponse openWadiahAuthor (String url, Object String ){
        JAXBElement res = (JAXBElement) getWebServiceTemplate().marshalSendAndReceive(url, String);
        return (OpenAccountWadiahResponse) res.getValue();
    }
}