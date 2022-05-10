package com.newexa.twsservice.controller;

import com.newexa.twsservice.consumesoap.SoapClient;
import com.newexa.twsservice.model.ChildCIF;
import com.newexa.twsservice.model.CustomerAccount;
import com.newexa.twsservice.model.CustomerCIF;
import com.newexa.twsservice.stub.ACCOUNTIDIACMUDOPENR2TWSType;
import com.newexa.twsservice.stub.ACCOUNTIDIACWADOPENR1TWSType;
import com.newexa.twsservice.stub.CUSTOMERIDIRETAILCHILDR2TWSType;
import com.newexa.twsservice.stub.CUSTOMERIDIRETAILSHORTR2TWSType;
import com.newexa.twsservice.stub.ObjectFactory;
import com.newexa.twsservice.stub.OfsFunction;
import com.newexa.twsservice.stub.OpenAccountMudharabah;
import com.newexa.twsservice.stub.OpenAccountMudharabahResponse;
import com.newexa.twsservice.stub.OpenAccountMudharabahValidate;
import com.newexa.twsservice.stub.OpenAccountMudharabahValidateResponse;
import com.newexa.twsservice.stub.WEBSERVICECUSTOMERSHORT;
import com.newexa.twsservice.stub.WEBSERVICECUSTOMERSHORTResponse;
import com.newexa.twsservice.stub.WEBSERVICECUSTOMERSHORTValidate;
import com.newexa.twsservice.stub.WEBSERVICECUSTOMERSHORTValidateResponse;
import com.newexa.twsservice.stub.WebRequestCommon;
import com.newexa.twsservice.stub.CUSTOMERIDIRETAILSHORTR2TWSType.GOFFPHONE;
import com.newexa.twsservice.stub.CUSTOMERIDIRETAILSHORTR2TWSType.GEMPLOYMENTSTATUS.MEMPLOYMENTSTATUS.SgEMPLOYERSADD;
import com.newexa.twsservice.stub.CUSTOMERIDIRETAILSHORTR2TWSType.GADDRTYPE.MADDRTYPE;
import com.newexa.twsservice.stub.CUSTOMERIDIRETAILSHORTR2TWSType.GADDRTYPE;
import com.newexa.twsservice.stub.CUSTOMERIDIRETAILSHORTR2TWSType.GEMPLOYMENTSTATUS;
import com.newexa.twsservice.stub.CUSTOMERIDIRETAILSHORTR2TWSType.GEMPLOYMENTSTATUS.MEMPLOYMENTSTATUS;
import com.newexa.twsservice.stub.CUSTOMERIDIRETAILSHORTR2TWSType.GFUNDSOURCE;
import com.newexa.twsservice.stub.CUSTOMERIDIRETAILSHORTR2TWSType.GFUNDSOURCE.MFUNDSOURCE;
import com.newexa.twsservice.stub.CUSTOMERIDIRETAILSHORTR2TWSType.GSMS1;
import com.newexa.twsservice.stub.CUSTOMERIDIRETAILSHORTR2TWSType.GCOUNTRY;
import com.newexa.twsservice.stub.CUSTOMERIDIRETAILSHORTR2TWSType.GPOSTCODE;
import com.newexa.twsservice.stub.CUSTOMERIDIRETAILSHORTR2TWSType.GTOWNCOUNTRY;
import com.newexa.twsservice.stub.CUSTOMERIDIRETAILSHORTR2TWSType.GSTREET;
import com.newexa.twsservice.stub.CUSTOMERIDIRETAILSHORTR2TWSType.GNAME1;
import com.newexa.twsservice.stub.CUSTOMERIDIRETAILSHORTR2TWSType.GSHORTNAME;
import com.newexa.twsservice.stub.EnquiryGetDataCIF;
import com.newexa.twsservice.stub.EnquiryGetDataCIFResponse;
import com.newexa.twsservice.stub.EnquiryInput;
import com.newexa.twsservice.stub.EnquiryInputCollection;
import com.newexa.twsservice.stub.IDIEGETSINGLECIFType;
import com.newexa.twsservice.stub.OpenAccountWadiah;
import com.newexa.twsservice.stub.OpenAccountWadiahResponse;
import com.newexa.twsservice.stub.OpenAccountWadiahValidate;
import com.newexa.twsservice.stub.OpenAccountWadiahValidateResponse;
import com.newexa.twsservice.stub.OpenCIFChild;
import com.newexa.twsservice.stub.OpenCIFChildResponse;
import com.newexa.twsservice.stub.OpenCIFChildValidate;
import com.newexa.twsservice.stub.OpenCIFChildValidateResponse;
import com.newexa.twsservice.stub.TransactionId;
import com.newexa.twsservice.stub.WEBSERVICESEEDEPTAO;
import com.newexa.twsservice.stub.WEBSERVICESEEDEPTAOResponse;
import java.math.BigInteger;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/twsservice")
public class TWSController {
    @Autowired 
    SoapClient soapClient;
    
    String url = "http://10.0.147.139:8180/iBSM_TWS/services";

    @PostMapping(value = "/validatecif")
    public WEBSERVICECUSTOMERSHORTValidateResponse validateCIF(@RequestBody(required = true) CustomerCIF customerCIF){
        ObjectFactory objectFactory = new ObjectFactory();
        WEBSERVICECUSTOMERSHORTValidate webservicecustomershortValidate = new WEBSERVICECUSTOMERSHORTValidate();
        CUSTOMERIDIRETAILSHORTR2TWSType customeridiretailshortr2twsType = setCUSTOMERIDIRETAILSHORTR2TWSType(customerCIF);

        System.out.println("data user "+ customerCIF.getName1());
        WebRequestCommon webRequestCommon = new WebRequestCommon();
        webRequestCommon.setUserName("TWSDEV");
        webRequestCommon.setPassword("Bsi321");
        webRequestCommon.setCompany("ID0010001");

        OfsFunction ofsFunction = new OfsFunction();
        ofsFunction.setMessageId("EX20220215103647_9a05f6344c3226ceceff9170966494b6");
        
        webservicecustomershortValidate.setWebRequestCommon(webRequestCommon);
        webservicecustomershortValidate.setOfsFunction(ofsFunction);
        webservicecustomershortValidate.setCUSTOMERIDIRETAILSHORTR2TWSType(customeridiretailshortr2twsType);

        WEBSERVICECUSTOMERSHORTValidateResponse webservicecustomershortValidateResponse = soapClient.getCIFData("http://10.0.147.139:8180/iBSM_TWS/services", objectFactory.createWEBSERVICECUSTOMERSHORTValidate(webservicecustomershortValidate));
        System.out.println("CEK CEK "+ webservicecustomershortValidateResponse.getStatus().getSuccessIndicator());
        System.out.println("CEK CEK 2 "+ webservicecustomershortValidateResponse.getStatus().getMessages());
        
        return webservicecustomershortValidateResponse;
    }

    //inquiry AO
    @PostMapping(value = "/inquiryAO")
    public WEBSERVICESEEDEPTAOResponse inquiryAO (@RequestParam(required = true) String transactionId){
        
        ObjectFactory objectFactory = new ObjectFactory();
        WEBSERVICESEEDEPTAO webserviceseedeptao = new WEBSERVICESEEDEPTAO();
        
        TransactionId transactionId2 = new TransactionId();
        transactionId2.setTransactionId(transactionId);
        
        WebRequestCommon webRequestCommon = new WebRequestCommon();
        webRequestCommon.setUserName("TWSDEV");
        webRequestCommon.setPassword("Bsi321");
        webRequestCommon.setCompany("ID0010001");
        
        webserviceseedeptao.setWebRequestCommon(webRequestCommon);
        webserviceseedeptao.setDEPTACCTOFFICERType(transactionId2);
        
        WEBSERVICESEEDEPTAOResponse aOResponse = soapClient.aOResponse(url, objectFactory.createWEBSERVICESEEDEPTAO(webserviceseedeptao));
        
        return aOResponse;
    }
    
    //Open CIF Child
    @PostMapping(value = "/validateCifChild")
    public OpenCIFChildValidateResponse openCifChild (@RequestBody(required = true) ChildCIF childCIF) {
        
        ObjectFactory objectFactory = new ObjectFactory();
        OpenCIFChildValidate cIFChildValidate = new OpenCIFChildValidate();
        CUSTOMERIDIRETAILCHILDR2TWSType customeridiretailchildrtwst = setCUSTOMERIDIRETAILCHILDR2TWSType(childCIF);
        
        WebRequestCommon webRequestCommon = new WebRequestCommon();
        webRequestCommon.setUserName("TWSDEV");
        webRequestCommon.setPassword("Bsi321");
        webRequestCommon.setCompany("ID0010001");
        
        OfsFunction ofsFunction = new OfsFunction();
        ofsFunction.setMessageId("EX"+randomMessageId());
        
        cIFChildValidate.setWebRequestCommon(webRequestCommon);
        cIFChildValidate.setOfsFunction(ofsFunction);
        cIFChildValidate.setCUSTOMERIDIRETAILCHILDR2TWSType(customeridiretailchildrtwst);
        
        OpenCIFChildValidateResponse openCIFChildValidateResponse = soapClient.getCIFChildValidate
                                                                    (url, objectFactory.createOpenCIFChildValidate(cIFChildValidate));
        
        return openCIFChildValidateResponse;
       
    }
    
    //validate CIF Child
    @PostMapping(value = "/authorCIFChild")
    public OpenCIFChildResponse authorCIFChild (@RequestBody(required = true) ChildCIF childCIF) {
        
        ObjectFactory objectFactory = new ObjectFactory();
        OpenCIFChild openCIFChild = new OpenCIFChild();
        CUSTOMERIDIRETAILCHILDR2TWSType customeridiretailchildrtwst = setCUSTOMERIDIRETAILCHILDR2TWSType(childCIF);
        
        WebRequestCommon webRequestCommon = new WebRequestCommon();
        webRequestCommon.setUserName("TWSDEV");
        webRequestCommon.setPassword("Bsi321");
        webRequestCommon.setCompany("ID0010001");
        
        OfsFunction ofsFunction = new OfsFunction();
        ofsFunction.setMessageId("EX"+randomMessageId());
        
        openCIFChild.setWebRequestCommon(webRequestCommon);
        openCIFChild.setOfsFunction(ofsFunction);
        openCIFChild.setCUSTOMERIDIRETAILCHILDR2TWSType(customeridiretailchildrtwst);
        
        OpenCIFChildResponse openCIFChildResponse = soapClient.openCIFChildAuthor(url, objectFactory.createOpenCIFChild(openCIFChild));
                
        return openCIFChildResponse;
    }
    
    //Create Easy Wadiah
    @PostMapping(value = "/validateEasyWadiah")
    public OpenAccountWadiahValidateResponse openEasyWadiah (@RequestBody(required = true) CustomerAccount customerAccount){
        
        ObjectFactory objectFactory = new ObjectFactory();
        OpenAccountWadiahValidate accountWadiahValidate = new OpenAccountWadiahValidate();
        ACCOUNTIDIACWADOPENR1TWSType accountidiacwadopenrtwst = setACCOUNTIDIACWADOPENR1TWSType(customerAccount);
        
        WebRequestCommon webRequestCommon = new WebRequestCommon();
        webRequestCommon.setUserName("TWSDEV");
        webRequestCommon.setPassword("Bsi321");
        webRequestCommon.setCompany("ID0010001");
        
        OfsFunction ofsFunction = new OfsFunction();
        ofsFunction.setMessageId("EX"+randomMessageId());
        
        accountWadiahValidate.setWebRequestCommon(webRequestCommon);
        accountWadiahValidate.setOfsFunction(ofsFunction);
        accountWadiahValidate.setACCOUNTIDIACWADOPENR1TWSType(accountidiacwadopenrtwst);
        
        OpenAccountWadiahValidateResponse wadiahValidate = soapClient.openWadiahValidate(url, objectFactory.createOpenAccountWadiahValidate(accountWadiahValidate));
        
        return wadiahValidate;
    }
    
    //Author Easy Wadiah
    @PostMapping(value = "/authorEasyWadiah")
    public OpenAccountWadiahResponse authEasyWadiah (@RequestBody(required = true) CustomerAccount customerAccount){
        
        ObjectFactory objectFactory = new ObjectFactory();
        OpenAccountWadiah openAccountWadiah = new OpenAccountWadiah();
        ACCOUNTIDIACWADOPENR1TWSType accountidiacwadopenrtwst = setACCOUNTIDIACWADOPENR1TWSType(customerAccount);
        
        WebRequestCommon webRequestCommon = new WebRequestCommon();
        webRequestCommon.setUserName("TWSDEV");
        webRequestCommon.setPassword("Bsi321");
        webRequestCommon.setCompany("ID0010001");
        
        OfsFunction ofsFunction = new OfsFunction();
        ofsFunction.setMessageId("EX"+randomMessageId());
        
        openAccountWadiah.setWebRequestCommon(webRequestCommon);
        openAccountWadiah.setOfsFunction(ofsFunction);
        openAccountWadiah.setACCOUNTIDIACWADOPENR1TWSType(accountidiacwadopenrtwst);
        
        OpenAccountWadiahResponse accountWadiahResponse = soapClient.openWadiahAuthor(url, objectFactory.createOpenAccountWadiah(openAccountWadiah));
        
        return accountWadiahResponse;
    }
    
    //enquiryCIF
    @PostMapping("/enquiryCIF")
    public EnquiryGetDataCIFResponse getDataCIFResponse (@RequestParam(required = true) String ID ) {
        
        ObjectFactory objectFactory = new ObjectFactory();
        EnquiryGetDataCIF dataCIF = new EnquiryGetDataCIF();
        EnquiryInput idiEg = setIDIEGETSINGLECIFType(ID);
        
        WebRequestCommon webRequestCommon = new WebRequestCommon();
        webRequestCommon.setUserName("TWSDEV");
        webRequestCommon.setPassword("Bsi321");
        webRequestCommon.setCompany("ID0010001");
        
        dataCIF.setWebRequestCommon(webRequestCommon);
        dataCIF.setIDIEGETSINGLECIFType(idiEg);
        
        EnquiryGetDataCIFResponse dataCIFResponse = soapClient.enquiryGetDataCIF(url, objectFactory.createEnquiryGetDataCIF(dataCIF));
        return dataCIFResponse;
    }
    
    
    @PostMapping(value = "/authorcif")
    public WEBSERVICECUSTOMERSHORTResponse authorCIF(@RequestBody(required = true) CustomerCIF customerCIF){
        ObjectFactory objectFactory = new ObjectFactory();
        WEBSERVICECUSTOMERSHORT webservicecustomershort = new WEBSERVICECUSTOMERSHORT();
        CUSTOMERIDIRETAILSHORTR2TWSType customeridiretailshortr2twsType = setCUSTOMERIDIRETAILSHORTR2TWSType(customerCIF);

        System.out.println("data user "+ customerCIF.getName1());
        WebRequestCommon webRequestCommon = new WebRequestCommon();
        webRequestCommon.setUserName("TWSDEV");
        webRequestCommon.setPassword("Bsi321");
        webRequestCommon.setCompany("ID0010001");

        OfsFunction ofsFunction = new OfsFunction();
        ofsFunction.setMessageId("EX20220215103647_9a05f6344c3226ceceff9170966494b6");
        
        webservicecustomershort.setWebRequestCommon(webRequestCommon);
        webservicecustomershort.setOfsFunction(ofsFunction);
        webservicecustomershort.setCUSTOMERIDIRETAILSHORTR2TWSType(customeridiretailshortr2twsType);

        WEBSERVICECUSTOMERSHORTResponse webservicecustomershortResponse = soapClient.getCIFAuthorization("http://10.0.147.139:8180/iBSM_TWS/services", objectFactory.createWEBSERVICECUSTOMERSHORT(webservicecustomershort));
        System.out.println("CEK CEK "+ webservicecustomershortResponse.getStatus().getSuccessIndicator());
        System.out.println("CEK CEK 2 "+ webservicecustomershortResponse.getStatus().getMessages());
        
        return webservicecustomershortResponse;
    }

    @PostMapping(value = "/validateeasymudharabah")
    public OpenAccountMudharabahValidateResponse validateEasyMudharabah(@RequestBody(required = true) CustomerAccount customerAccount){
        ObjectFactory objectFactory = new ObjectFactory();
        OpenAccountMudharabahValidate openAccountMudharabahValidate = new OpenAccountMudharabahValidate();
        ACCOUNTIDIACMUDOPENR2TWSType accountidiacmudopenr2twsType = setACCOUNTIDIACMUDOPENR2TWSType(customerAccount);

        WebRequestCommon webRequestCommon = new WebRequestCommon();
        webRequestCommon.setUserName("TWSDEV");
        webRequestCommon.setPassword("Bsi321");
        webRequestCommon.setCompany("ID0010001");

        OfsFunction ofsFunction = new OfsFunction();
        ofsFunction.setMessageId("EX20220215103647_9a05f6344c3226ceceff9170966494b6");
        
        openAccountMudharabahValidate.setWebRequestCommon(webRequestCommon);
        openAccountMudharabahValidate.setOfsFunction(ofsFunction);
        openAccountMudharabahValidate.setACCOUNTIDIACMUDOPENR2TWSType(accountidiacmudopenr2twsType);

        OpenAccountMudharabahValidateResponse openAccountMudharabahValidateResponse = soapClient.getOpenAccountMudharabah("http://10.0.147.139:8180/iBSM_TWS/services", objectFactory.createOpenAccountMudharabahValidate(openAccountMudharabahValidate));
        
        return openAccountMudharabahValidateResponse;
    }


    @PostMapping(value = "/authoreasymudharabah")
    public OpenAccountMudharabahResponse authorEasyMudharabah(@RequestBody(required = true) CustomerAccount customerAccount){
        ObjectFactory objectFactory = new ObjectFactory();
        OpenAccountMudharabah openAccountMudharabah = new OpenAccountMudharabah();
        ACCOUNTIDIACMUDOPENR2TWSType accountidiacmudopenr2twsType = setACCOUNTIDIACMUDOPENR2TWSType(customerAccount);

        WebRequestCommon webRequestCommon = new WebRequestCommon();
        webRequestCommon.setUserName("TWSDEV");
        webRequestCommon.setPassword("Bsi321");
        webRequestCommon.setCompany("ID0010001");

        OfsFunction ofsFunction = new OfsFunction();
        ofsFunction.setMessageId("EX20220215103647_9a05f6344c3226ceceff9170966494b6");
        
        openAccountMudharabah.setWebRequestCommon(webRequestCommon);
        openAccountMudharabah.setOfsFunction(ofsFunction);
        openAccountMudharabah.setACCOUNTIDIACMUDOPENR2TWSType(accountidiacmudopenr2twsType);
        
        OpenAccountMudharabahResponse openAccountMudharabahResponse = soapClient.getOpenAccountMudharabahAuthorization("http://10.0.147.139:8180/iBSM_TWS/services", objectFactory.createOpenAccountMudharabah(openAccountMudharabah));
        
        return openAccountMudharabahResponse;

    }
    
    public String randomMessageId(){
        Random rnd = new Random();
        int number = rnd.nextInt(999999999);
        String id = "1";
        String.format("%09d", number);
        String idNumber =  id + number;
        return idNumber;
    }
    
    public CUSTOMERIDIRETAILCHILDR2TWSType setCUSTOMERIDIRETAILCHILDR2TWSType (ChildCIF childCIF) {
        CUSTOMERIDIRETAILCHILDR2TWSType customeridiretailchildrtwst = new CUSTOMERIDIRETAILCHILDR2TWSType();
        
        System.out.println("Child CIF : "+childCIF.getLbuCustType());
        
        //short name
        CUSTOMERIDIRETAILCHILDR2TWSType.GSHORTNAME gshortname = new CUSTOMERIDIRETAILCHILDR2TWSType.GSHORTNAME();
        gshortname.getSHORTNAME().add(childCIF.getShortName());
        customeridiretailchildrtwst.setGSHORTNAME(gshortname);
        
        //name
        CUSTOMERIDIRETAILCHILDR2TWSType.GNAME1 gname = new CUSTOMERIDIRETAILCHILDR2TWSType.GNAME1();
        gname.getNAME1().add(childCIF.getName1());
        customeridiretailchildrtwst.setGNAME1(gname);
        
        //given names - education
        customeridiretailchildrtwst.setGIVENNAMES(childCIF.getGivenNames());
        customeridiretailchildrtwst.setMOTHMAIDEN(childCIF.getMothMaiden());
        customeridiretailchildrtwst.setPLACEBIRTH(childCIF.getPlaceBirth());
        customeridiretailchildrtwst.setDATEOFBIRTH((childCIF.getDateOfBirth()));
        customeridiretailchildrtwst.setCHILDLEGALTYP(childCIF.getChildLegalTyp());
        customeridiretailchildrtwst.setLEGALIDNO(childCIF.getLegalIdNo());
        customeridiretailchildrtwst.setGENDER(childCIF.getGender());
        customeridiretailchildrtwst.setNATIONALITY(childCIF.getNationality());
        customeridiretailchildrtwst.setEDUCATION(childCIF.getEducation());
        
        //street domisili
        CUSTOMERIDIRETAILCHILDR2TWSType.GSTREET gstreet = new CUSTOMERIDIRETAILCHILDR2TWSType.GSTREET();
        gstreet.getSTREET().add(childCIF.getStreet());
        customeridiretailchildrtwst.setGSTREET(gstreet);
        
        //address domisili
        CUSTOMERIDIRETAILCHILDR2TWSType.GLLADDRESS.MLLADDRESS mlladdress = new CUSTOMERIDIRETAILCHILDR2TWSType.GLLADDRESS.MLLADDRESS();
        CUSTOMERIDIRETAILCHILDR2TWSType.GLLADDRESS glladdress = new CUSTOMERIDIRETAILCHILDR2TWSType.GLLADDRESS();
        CUSTOMERIDIRETAILCHILDR2TWSType.GLLADDRESS.MLLADDRESS.SgLLADDRESS slladdress = new CUSTOMERIDIRETAILCHILDR2TWSType.GLLADDRESS.MLLADDRESS.SgLLADDRESS();
        slladdress.getADDRESS().add(childCIF.getAddress());
        mlladdress.setSgLLADDRESS(slladdress);
        glladdress.getMLLADDRESS().add(mlladdress);
        customeridiretailchildrtwst.setGLLADDRESS(glladdress);
        
        //rt rw domisili
        customeridiretailchildrtwst.setRTRW(childCIF.getRtRw());
        
        //kelurahan domisili
        CUSTOMERIDIRETAILCHILDR2TWSType.GTOWNCOUNTRY gtowncountry = new CUSTOMERIDIRETAILCHILDR2TWSType.GTOWNCOUNTRY();
        gtowncountry.getTOWNCOUNTRY().add(childCIF.getTownCountry());
        customeridiretailchildrtwst.setGTOWNCOUNTRY(gtowncountry);
        
        //country domisili
        CUSTOMERIDIRETAILCHILDR2TWSType.GCOUNTRY gcountryy = new CUSTOMERIDIRETAILCHILDR2TWSType.GCOUNTRY();
        gcountryy.getCOUNTRY().add(childCIF.getCountry());
        customeridiretailchildrtwst.setGCOUNTRY(gcountryy);
        
        //province - districtcode domisili
        customeridiretailchildrtwst.setPROVINCE(childCIF.getProvince());
        customeridiretailchildrtwst.setRESIDENCE(childCIF.getResidence());
        customeridiretailchildrtwst.setDISTRICTCODE(childCIF.getDistricCode());
        
        //postcode domisili
        CUSTOMERIDIRETAILCHILDR2TWSType.GPOSTCODE gpostcode = new CUSTOMERIDIRETAILCHILDR2TWSType.GPOSTCODE();
        gpostcode.getPOSTCODE().add(childCIF.getPostCode());
        customeridiretailchildrtwst.setGPOSTCODE(gpostcode);
        
        //sms1
        CUSTOMERIDIRETAILCHILDR2TWSType.GSMS1 gsms1 = new CUSTOMERIDIRETAILCHILDR2TWSType.GSMS1();
        gsms1.getSMS1().add(childCIF.getSms1());
        customeridiretailchildrtwst.setGSMS1(gsms1);
        
        //email
        CUSTOMERIDIRETAILCHILDR2TWSType.GEMAIL1 gemail1 = new CUSTOMERIDIRETAILCHILDR2TWSType.GEMAIL1();
        gemail1.getEMAIL1().add(childCIF.getEmail1());
        customeridiretailchildrtwst.setGEMAIL1(gemail1);
        
        customeridiretailchildrtwst.setMNEMONIC("");
        customeridiretailchildrtwst.setRESIDEYN("Y");
        customeridiretailchildrtwst.setACCOUNTOFFICER(childCIF.getAccountOfficer());
        customeridiretailchildrtwst.setALTCUSTID("");
        customeridiretailchildrtwst.setSEGMENT("");
        
        //informasi orang tua / wali
        CUSTOMERIDIRETAILCHILDR2TWSType.GFUNDPROVNAME gfundprovname = new CUSTOMERIDIRETAILCHILDR2TWSType.GFUNDPROVNAME();
        CUSTOMERIDIRETAILCHILDR2TWSType.GFUNDPROVNAME.MFUNDPROVNAME mfundprovname = new CUSTOMERIDIRETAILCHILDR2TWSType.GFUNDPROVNAME.MFUNDPROVNAME();
        mfundprovname.setFUNDPROVNAME(childCIF.getFundProvName());
        mfundprovname.setFUNDPROVJOB(childCIF.getFundProvJob());
        mfundprovname.setFUNDPROVPHONE(childCIF.getFundProvPhone());
        mfundprovname.setFUNDPROVADDR(childCIF.getFundProvAddr());
        gfundprovname.getMFUNDPROVNAME().add(mfundprovname);
        customeridiretailchildrtwst.setGFUNDPROVNAME(gfundprovname);
        
        customeridiretailchildrtwst.setFUNDLEGALTYPE(childCIF.getFundLegalType());
        customeridiretailchildrtwst.setFUNLEGALIDNO(childCIF.getFunLegalIdNo());
        customeridiretailchildrtwst.setFUNPROVGENDER(childCIF.getFunProvGender());
        customeridiretailchildrtwst.setFUNDMARITSTAT(childCIF.getFundMaritStat());
        customeridiretailchildrtwst.setFUNPROVRELCU(childCIF.getFunProvRelcu());
        customeridiretailchildrtwst.setFUNDEDUCATION(childCIF.getFundEducation());
        customeridiretailchildrtwst.setFUNDRELIGION(childCIF.getFundReligion());
        customeridiretailchildrtwst.setFUNDMOTHMAIDE(childCIF.getFundMothMaide());
        customeridiretailchildrtwst.setFUNDPLACEBIRT(childCIF.getFundPlaceBirt());
        customeridiretailchildrtwst.setFUNDATEBIRTH(childCIF.getFunDateBirth());
        customeridiretailchildrtwst.setFUNDSTREET(childCIF.getFundStreet());
        customeridiretailchildrtwst.setFUNDPROVSMS1(childCIF.getFundProvSms1());
        customeridiretailchildrtwst.setFUNDEMPLOYADD(childCIF.getFundEmployAdd());
        customeridiretailchildrtwst.setFUNDOCCUPATION(childCIF.getFundOccupation());
        
        CUSTOMERIDIRETAILCHILDR2TWSType.GFUNDSOURCE gfundsource = new CUSTOMERIDIRETAILCHILDR2TWSType.GFUNDSOURCE();
        CUSTOMERIDIRETAILCHILDR2TWSType.GFUNDSOURCE.MFUNDSOURCE mfundsource = new CUSTOMERIDIRETAILCHILDR2TWSType.GFUNDSOURCE.MFUNDSOURCE();
        mfundsource.setFUNDSOURCE(childCIF.getFundSource());
        gfundsource.getMFUNDSOURCE().add(mfundsource);
        customeridiretailchildrtwst.setGFUNDSOURCE(gfundsource);
        //end data orang tua
        
        //alamat identitas
        CUSTOMERIDIRETAILCHILDR2TWSType.GADDRTYPE.MADDRTYPE maddrtype = new CUSTOMERIDIRETAILCHILDR2TWSType.GADDRTYPE.MADDRTYPE();
        maddrtype.setADDRCOUNTRY(childCIF.getAddrCountry());
        maddrtype.setADDRDISTRICT(childCIF.getAddrDistrict());
        maddrtype.setADDRMUNICIPAL(childCIF.getAddrMunicipal());
        maddrtype.setADDRPOSTCODE(childCIF.getAddrPostCode());
        maddrtype.setADDRPROVINCE(childCIF.getAddrProvince());
        maddrtype.setADDRRTRW(childCIF.getAddrRtRw());
        maddrtype.setADDRSTREET(childCIF.getAddrStreet());
        maddrtype.setADDRSUBURBTWN(childCIF.getAddrSuburBtwn());
        maddrtype.setADDRTYPE(childCIF.getAddrType());
        CUSTOMERIDIRETAILCHILDR2TWSType.GADDRTYPE gaddrtype = new CUSTOMERIDIRETAILCHILDR2TWSType.GADDRTYPE();
        gaddrtype.getMADDRTYPE().add(maddrtype);
        customeridiretailchildrtwst.setGADDRTYPE(gaddrtype);
        //end alamat identitas
        
        //informasi sekolah
        CUSTOMERIDIRETAILCHILDR2TWSType.SgEMPLOYERSADD semployersadd = new CUSTOMERIDIRETAILCHILDR2TWSType.SgEMPLOYERSADD();
        semployersadd.getEMPLOYERSADD().add(childCIF.getEmployersAdd());
        customeridiretailchildrtwst.setSgEMPLOYERSADD(semployersadd);
        
        customeridiretailchildrtwst.setEMPLOYERSNAME(childCIF.getEmployersName());
        
        CUSTOMERIDIRETAILCHILDR2TWSType.GOFFPHONE goffphone = new CUSTOMERIDIRETAILCHILDR2TWSType.GOFFPHONE();
        goffphone.getOFFPHONE().add(childCIF.getOffPhone());
        customeridiretailchildrtwst.setGOFFPHONE(goffphone);
        //end informasi sekolah
        
        //informasi BI
        customeridiretailchildrtwst.setLBUCUSTTYPE(childCIF.getLbuCustType());
        customeridiretailchildrtwst.setGUARANTORCODE(childCIF.getGuarantorCode());
        customeridiretailchildrtwst.setSIDRELATIBANK(childCIF.getSidRelatiBank());
        
        CUSTOMERIDIRETAILCHILDR2TWSType.GCUSTOMERRATING gcustomerrating = new CUSTOMERIDIRETAILCHILDR2TWSType.GCUSTOMERRATING();
        gcustomerrating.getCUSTOMERRATING().add(childCIF.getCustomerRating());
        customeridiretailchildrtwst.setGCUSTOMERRATING(gcustomerrating);
        //end informasi BI
        
        return customeridiretailchildrtwst;
    }

    public CUSTOMERIDIRETAILSHORTR2TWSType setCUSTOMERIDIRETAILSHORTR2TWSType(CustomerCIF customerCIF){
        CUSTOMERIDIRETAILSHORTR2TWSType customeridiretailshortr2twsType = new CUSTOMERIDIRETAILSHORTR2TWSType();
        
        customeridiretailshortr2twsType.setACCOUNTOFFICER(customerCIF.getAccountOfficer());
        customeridiretailshortr2twsType.setALTCUSTID("");
        customeridiretailshortr2twsType.setCUSTAPPROVE("");
        customeridiretailshortr2twsType.setDATEOFBIRTH(customerCIF.getDateOfBirth());
        customeridiretailshortr2twsType.setDISTRICTCODE(customerCIF.getDistrictCode());
        customeridiretailshortr2twsType.setEDUCATION(customerCIF.getEducation());
        customeridiretailshortr2twsType.setEXPIRYDTEID("");
        customeridiretailshortr2twsType.setFAMILYNAME(customerCIF.getFamilyName());
        customeridiretailshortr2twsType.setGUARANTORCODE(customerCIF.getGuarantorCode());
        customeridiretailshortr2twsType.setINFOCOMPLETE("");
        customeridiretailshortr2twsType.setLBUCUSTTYPE(customerCIF.getlBuCustType());
        customeridiretailshortr2twsType.setLEGALIDNO(customerCIF.getLegalIdNo());
        customeridiretailshortr2twsType.setLEGALTYPE(customerCIF.getLegalType());
        customeridiretailshortr2twsType.setMARTIALSTATUS(customerCIF.getMaritalStatus());
        customeridiretailshortr2twsType.setMNEMONIC("");
        customeridiretailshortr2twsType.setMOTHMAIDEN(customerCIF.getMothMaiden());
        customeridiretailshortr2twsType.setPLACEBIRTH(customerCIF.getPlaceBirth());
        customeridiretailshortr2twsType.setPROVINCE(customerCIF.getProvince());
        customeridiretailshortr2twsType.setRELIGION(customerCIF.getReligion());
        customeridiretailshortr2twsType.setRESIDENCE(customerCIF.getResideYN());
        customeridiretailshortr2twsType.setRESIDEYN(customerCIF.getResideYN());
        customeridiretailshortr2twsType.setINFOCOMPLETE("Y");
        customeridiretailshortr2twsType.setRISKLEVELID(customerCIF.getRiskLevelID());
        customeridiretailshortr2twsType.setRTRW(customerCIF.getRt()+"/"+customerCIF.getRw());
        customeridiretailshortr2twsType.setSEGMENT("");
        customeridiretailshortr2twsType.setSIDRELATIBANK(customerCIF.getSidRelatiBank());
        customeridiretailshortr2twsType.setGENDER(customerCIF.getGender());

        // short name submit
        GSHORTNAME gshortname = new GSHORTNAME();
        gshortname.getSHORTNAME().add(customerCIF.getShortName());
        customeridiretailshortr2twsType.setGSHORTNAME(gshortname);

        // name 1 submit
        GNAME1 gname1 = new GNAME1();
        gname1.getNAME1().add(customerCIF.getName1());
        customeridiretailshortr2twsType.setGNAME1(gname1);

        // street submit
        GSTREET gstreet = new GSTREET();
        gstreet.getSTREET().add(customerCIF.getStreet());
        customeridiretailshortr2twsType.setGSTREET(gstreet);

        // town country submit
        GTOWNCOUNTRY gtowncountry = new GTOWNCOUNTRY();
        gtowncountry.getTOWNCOUNTRY().add(customerCIF.getTownCountry());
        customeridiretailshortr2twsType.setGTOWNCOUNTRY(gtowncountry);

        // post code submit
        GPOSTCODE gpostcode = new GPOSTCODE();
        gpostcode.getPOSTCODE().add(customerCIF.getPostCode());
        customeridiretailshortr2twsType.setGPOSTCODE(gpostcode);

        // country submit
        GCOUNTRY gcountry = new GCOUNTRY();
        gcountry.getCOUNTRY().add(customerCIF.getCountry());
        customeridiretailshortr2twsType.setGCOUNTRY(gcountry);

        // sms submit
        GSMS1 gsms1 = new GSMS1();
        gsms1.getSMS().add(customerCIF.getSms());
        customeridiretailshortr2twsType.setGSMS1(gsms1);

        // mfundsource
        MFUNDSOURCE mfundsource = new MFUNDSOURCE();
        mfundsource.setFUNDSOURCE(customerCIF.getFundSource());
        mfundsource.setFUNDSOURCEAMT(customerCIF.getFundSourceAMT());
        GFUNDSOURCE gfundsource = new GFUNDSOURCE();
        gfundsource.getMFUNDSOURCE().add(mfundsource);
        customeridiretailshortr2twsType.setGFUNDSOURCE(gfundsource);
    
        // meploymentstatus
        SgEMPLOYERSADD sgEMPLOYERSADD = new SgEMPLOYERSADD();
        sgEMPLOYERSADD.getEMPLOYERSADD().add(customerCIF.getEmployersAdd());
        MEMPLOYMENTSTATUS memploymentstatus = new MEMPLOYMENTSTATUS();
        memploymentstatus.setEMPLOYERSBUSS(customerCIF.getEmployersBuss());
        memploymentstatus.setEMPLOYERSNAME(customerCIF.getEmployersName());
        memploymentstatus.setEMPLOYMENTSTART(customerCIF.getEmploymentStart());
        memploymentstatus.setEMPLOYMENTSTATUS(customerCIF.getEmploymentStatus());
        memploymentstatus.setJOBTITLE(customerCIF.getJobTitle());
        memploymentstatus.setOCCUPATION(customerCIF.getOccupation());
        memploymentstatus.setSgEMPLOYERSADD(sgEMPLOYERSADD);
        GEMPLOYMENTSTATUS gemploymentstatus = new GEMPLOYMENTSTATUS();
        gemploymentstatus.getMEMPLOYMENTSTATUS().add(memploymentstatus);
        customeridiretailshortr2twsType.setGEMPLOYMENTSTATUS(gemploymentstatus);

        // maddrtype
        MADDRTYPE maddrtype = new MADDRTYPE();
        maddrtype.setADDRCOUNTRY(customerCIF.getAddrCountry());
        maddrtype.setADDRDISTRICT(customerCIF.getAddrDistrict());
        maddrtype.setADDRMUNICIPAL(customerCIF.getAddrMunicipal());
        maddrtype.setADDRPOSTCODE(customerCIF.getAddrPostCode());
        maddrtype.setADDRPROVINCE(customerCIF.getAddrProvince());
        maddrtype.setADDRRTRW(customerCIF.getRt()+"/"+customerCIF.getRw());
        maddrtype.setADDRSTREET(customerCIF.getAddrStreet());
        maddrtype.setADDRSUBURBTWN(customerCIF.getAddrSuburBtwn());
        maddrtype.setADDRTYPE(customerCIF.getAddrType());
        GADDRTYPE gaddrtype = new GADDRTYPE();
        gaddrtype.getMADDRTYPE().add(maddrtype);
        customeridiretailshortr2twsType.setGADDRTYPE(gaddrtype);

        //goffphone
        GOFFPHONE goffphone = new GOFFPHONE();
        goffphone.getOFFPHONE().add(customerCIF.getOffPhone());
        customeridiretailshortr2twsType.setGOFFPHONE(goffphone);

        return customeridiretailshortr2twsType;
    } 

    public ACCOUNTIDIACMUDOPENR2TWSType setACCOUNTIDIACMUDOPENR2TWSType(CustomerAccount customerAccount){
        ACCOUNTIDIACMUDOPENR2TWSType accountidiacmudopenr2twsType = new ACCOUNTIDIACMUDOPENR2TWSType();
        // accountidiacmudopenr2twsType.setACCTRECVBONUS(customerAccount.get);
        accountidiacmudopenr2twsType.setACOPENPURPOSE(customerAccount.getAcopenPurpose());
        accountidiacmudopenr2twsType.setAccountOfficer(customerAccount.getAccountOfficer());
        accountidiacmudopenr2twsType.setCurrency(customerAccount.getCurrency());
        accountidiacmudopenr2twsType.setEVENTCODE(customerAccount.getEventCode());
        // accountidiacmudopenr2twsType.setGESERVICES(value);
        // accountidiacmudopenr2twsType.setGJOINTHOLDER(value);
        // accountidiacmudopenr2twsType.setGKETPAJAK(value);
        accountidiacmudopenr2twsType.setZAKAT(customerAccount.getZakat());
        accountidiacmudopenr2twsType.setNoCIF(customerAccount.getCifNo());
        accountidiacmudopenr2twsType.setPassbook(customerAccount.getPassBook());
        accountidiacmudopenr2twsType.setPrintedName(customerAccount.getPrintedName());
        accountidiacmudopenr2twsType.setProductCode(customerAccount.getProductCode());

        return accountidiacmudopenr2twsType;
    } 
    
    public ACCOUNTIDIACWADOPENR1TWSType setACCOUNTIDIACWADOPENR1TWSType (CustomerAccount customerAccount) {
        
        ACCOUNTIDIACWADOPENR1TWSType accountidiacwadopenrtwst = new ACCOUNTIDIACWADOPENR1TWSType();
        
        accountidiacwadopenrtwst.setCUSTOMER(customerAccount.getCifNo());
        accountidiacwadopenrtwst.setACCOUNTTITLE1((customerAccount.getPrintedName()));
        accountidiacwadopenrtwst.setCURRENCY(customerAccount.getCurrency());
        accountidiacwadopenrtwst.setACOPENPURPOSE(customerAccount.getAcopenPurpose());
        accountidiacwadopenrtwst.setACCOUNTOFFICER(customerAccount.getAccountOfficer());
        accountidiacwadopenrtwst.setCATEGORY("6007");
        accountidiacwadopenrtwst.setBONUS("N");
        accountidiacwadopenrtwst.setZAKAT("N");
        accountidiacwadopenrtwst.setPASSBOOK("Y");
        
        return accountidiacwadopenrtwst;
    }
    
    public EnquiryInput setIDIEGETSINGLECIFType (String cif) {
        
        EnquiryInput cIFType = new EnquiryInput();
        EnquiryInputCollection collection = new EnquiryInputCollection();
        collection.setColumnName("CUSTUMER.ID");
        collection.setCriteriaValue(cif);
        collection.setOperand("EQ");
        cIFType.getEnquiryInputCollection().add(collection);
       
        return cIFType;
        
    }
}
