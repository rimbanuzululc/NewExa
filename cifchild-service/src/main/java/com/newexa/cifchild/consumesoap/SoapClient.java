/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.newexa.cifchild.consumesoap;

/**
 *
 * @author hp
 */
import com.newexa.cifchild.stub.OpenAccountWadiahResponse;
import com.newexa.cifchild.stub.OpenAccountWadiahValidateResponse;
import com.newexa.cifchild.stub.OpenCIFChildResponse;
import com.newexa.cifchild.stub.OpenCIFChildValidateResponse;
import com.newexa.cifchild.stub.WEBSERVICECUSTOMERSHORTResponse;
import com.newexa.cifchild.stub.WEBSERVICECUSTOMERSHORTValidateResponse;
import com.newexa.cifchild.stub.WEBSERVICESEEDEPTAOResponse;

import javax.xml.bind.JAXBElement;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;


public class SoapClient extends WebServiceGatewaySupport {
    public WEBSERVICECUSTOMERSHORTValidateResponse getCIFData (String url, Object request){
        JAXBElement res = (JAXBElement) getWebServiceTemplate().marshalSendAndReceive(url, request);
        return (WEBSERVICECUSTOMERSHORTValidateResponse) res.getValue();
    }

    public WEBSERVICECUSTOMERSHORTResponse getCIFAuthorization (String url, Object request){
        JAXBElement res = (JAXBElement) getWebServiceTemplate().marshalSendAndReceive(url, request);
        return (WEBSERVICECUSTOMERSHORTResponse) res.getValue();
    }
    
    public WEBSERVICESEEDEPTAOResponse aOResponse (String url, Object request) {
        JAXBElement res = (JAXBElement) getWebServiceTemplate().marshalSendAndReceive(url, request);
        return (WEBSERVICESEEDEPTAOResponse) res.getValue();
    }
    
    public OpenCIFChildValidateResponse getCIFChildValidate (String url, Object request) {
        JAXBElement res = (JAXBElement) getWebServiceTemplate().marshalSendAndReceive(url, request);
        return (OpenCIFChildValidateResponse) res.getValue();
    }
    
    public OpenCIFChildResponse openCIFChildAuthor (String url, Object request) {
        JAXBElement res = (JAXBElement) getWebServiceTemplate().marshalSendAndReceive(url, request);
        return (OpenCIFChildResponse) res.getValue();
    }
    
    public OpenAccountWadiahValidateResponse openWadiahValidate (String url, Object String ){
        JAXBElement res = (JAXBElement) getWebServiceTemplate().marshalSendAndReceive(url, String);
        return (OpenAccountWadiahValidateResponse) res.getValue();
    }
    
    public OpenAccountWadiahResponse openWadiahAuthor (String url, Object String ){
        JAXBElement res = (JAXBElement) getWebServiceTemplate().marshalSendAndReceive(url, String);
        return (OpenAccountWadiahResponse) res.getValue();
    }
}