package com.newexa.twsservice.consumesoap;

import org.springframework.ws.client.core.support.WebServiceGatewaySupport;

import javax.xml.bind.JAXBElement;

import com.newexa.twsservice.stub.OpenAccountMudharabahResponse;
import com.newexa.twsservice.stub.OpenAccountMudharabahValidateResponse;
import com.newexa.twsservice.stub.OpenCIFChildResponse;
import com.newexa.twsservice.stub.WEBSERVICECUSTOMERSHORTResponse;
import com.newexa.twsservice.stub.WEBSERVICECUSTOMERSHORTValidateResponse;
import com.newexa.twsservice.stub.WEBSERVICESEEDEPTAOResponse;

public class SoapClient extends WebServiceGatewaySupport {
    public WEBSERVICECUSTOMERSHORTValidateResponse getCIFData (String url, Object request){
        JAXBElement res = (JAXBElement) getWebServiceTemplate().marshalSendAndReceive(url, request);
        return (WEBSERVICECUSTOMERSHORTValidateResponse) res.getValue();
    }

    public WEBSERVICECUSTOMERSHORTResponse getCIFAuthorization (String url, Object request){
        JAXBElement res = (JAXBElement) getWebServiceTemplate().marshalSendAndReceive(url, request);
        return (WEBSERVICECUSTOMERSHORTResponse) res.getValue();
    }

    public OpenAccountMudharabahValidateResponse getOpenAccountMudharabah (String url, Object request){
        JAXBElement res = (JAXBElement) getWebServiceTemplate().marshalSendAndReceive(url, request);
        return (OpenAccountMudharabahValidateResponse) res.getValue();
    }

    public OpenAccountMudharabahResponse getOpenAccountMudharabahAuthorization (String url, Object request){
        JAXBElement res = (JAXBElement) getWebServiceTemplate().marshalSendAndReceive(url, request);
        return (OpenAccountMudharabahResponse) res.getValue();
    }
    
    public WEBSERVICESEEDEPTAOResponse aOResponse (String url, Object request) {
        JAXBElement res = (JAXBElement) getWebServiceTemplate().marshalSendAndReceive(url, request);
        return (WEBSERVICESEEDEPTAOResponse) res.getValue();
    }
    
    public OpenCIFChildResponse openCIFChildResponse (String url, Object request) {
        JAXBElement res = (JAXBElement) getWebServiceTemplate().marshalSendAndReceive(url, request);
        return (OpenCIFChildResponse) res.getValue();
    }
}