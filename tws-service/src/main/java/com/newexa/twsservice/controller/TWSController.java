package com.newexa.twsservice.controller;

import com.newexa.twsservice.consumesoap.SoapClient;
import com.newexa.twsservice.model.ChildCIF;
import com.newexa.twsservice.model.CustomerAccount;
import com.newexa.twsservice.model.CustomerCIF;
import com.newexa.twsservice.stub.ACCOUNTIDIACMUDOPENR2TWSType;
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
import com.newexa.twsservice.stub.OpenCIFChild;
import com.newexa.twsservice.stub.OpenCIFChildResponse;
import com.newexa.twsservice.stub.TransactionId;
import com.newexa.twsservice.stub.WEBSERVICESEEDEPTAO;
import com.newexa.twsservice.stub.WEBSERVICESEEDEPTAOResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/twsservice")
public class TWSController {
    @Autowired SoapClient soapClient;
    
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
    public OpenCIFChildResponse openCifChild (@RequestBody(required = true) CustomerCIF customerCIF) {
        
        ObjectFactory objectFactory = new ObjectFactory();
        OpenCIFChild openCIFChild = new OpenCIFChild();
        
//        CUSTOMERIDIRETAILCHILDR2TWSType customeridiretailchildrtwst 
        
        WebRequestCommon webRequestCommon = new WebRequestCommon();
        webRequestCommon.setUserName("TWSDEV");
        webRequestCommon.setPassword("Bsi321");
        webRequestCommon.setCompany("ID0010001");
        
        OfsFunction ofsFunction = new OfsFunction();
        ofsFunction.setMessageId("EX20220215103647_9a05f6344c3226ceceff9170966494b6");
        
        openCIFChild.setWebRequestCommon(webRequestCommon);
        openCIFChild.setOfsFunction(ofsFunction);
//        openCIFChild.setCUSTOMERIDIRETAILCHILDR2TWSType();
        
        OpenCIFChildResponse openCIFChildResponse = soapClient.openCIFChildResponse(url, objectFactory.createOpenCIFChild(openCIFChild));
        
        return openCIFChildResponse;
       
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
    
    public CUSTOMERIDIRETAILCHILDR2TWSType setCUSTOMERIDIRETAILCHILDR2TWSType (ChildCIF childCIF) {
        CUSTOMERIDIRETAILCHILDR2TWSType customeridiretailchildrtwst = new CUSTOMERIDIRETAILCHILDR2TWSType();
        
        String id = String.valueOf(childCIF.getIdCifChild());
        customeridiretailchildrtwst.setId(id);
        
        GSHORTNAME gshortname = new GSHORTNAME();
        gshortname.getSHORTNAME().add(childCIF.getShortName());
        customeridiretailchildrtwst.setGSHORTNAME(gshortname);
        
        
        
        
        
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

}
