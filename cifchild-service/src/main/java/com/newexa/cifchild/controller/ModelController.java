/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.newexa.cifchild.controller;

import com.newexa.cifchild.model.AcctOpenPurpose;
import com.newexa.cifchild.model.CustomerRating;
import com.newexa.cifchild.model.DistrictCode;
import com.newexa.cifchild.model.Education;
import com.newexa.cifchild.model.FundSource;
import com.newexa.cifchild.model.Gurantor;
import com.newexa.cifchild.model.JobTitle;
import com.newexa.cifchild.model.LBUSCustType;
import com.newexa.cifchild.model.Legal;
import com.newexa.cifchild.model.Marital;
import com.newexa.cifchild.model.Province;
import com.newexa.cifchild.model.Relation;
import com.newexa.cifchild.model.Residence;
import com.newexa.cifchild.model.SIDRelationBank;
import com.newexa.cifchild.response.ResponseHandler;
import com.newexa.cifchild.service.AcctOpenPurposeService;
import com.newexa.cifchild.service.CustomerRatingService;
import com.newexa.cifchild.service.DistrictCodeService;
import com.newexa.cifchild.service.EducationService;
import com.newexa.cifchild.service.FundSourceService;
import com.newexa.cifchild.service.GurantorService;
import com.newexa.cifchild.service.JobTitleService;
import com.newexa.cifchild.service.LbusCustTypeService;
import com.newexa.cifchild.service.LegalService;
import com.newexa.cifchild.service.MaritalService;
import com.newexa.cifchild.service.ProvinceService;
import com.newexa.cifchild.service.RelationService;
import com.newexa.cifchild.service.ResidenceService;
import com.newexa.cifchild.service.SIDRelationService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author rimba
 */
@RestController
@RequestMapping("/model")
public class ModelController {
    
    @Autowired
    ResidenceService residenceService;
    
    @Autowired
    CustomerRatingService ratingService;
    
    @Autowired
    ProvinceService provinceService;
    
    @Autowired
    DistrictCodeService codeService;
    
    @Autowired
    JobTitleService jobTitleService;
    
    @Autowired
    AcctOpenPurposeService acctOpenPurposeService;
    
    @Autowired
    EducationService educationService;
    
    @Autowired
    FundSourceService fundSourceService;
    
    @Autowired
    GurantorService gurantorService;
    
    @Autowired
    LbusCustTypeService custTypeService;
    
    @Autowired
    LegalService legalService;
    
    @Autowired
    MaritalService maritalService;
    
    @Autowired
    RelationService relationService;
    
    @Autowired
    SIDRelationService iDRelationService;
    
    
    @GetMapping(value = "/residence")
    public ResponseEntity<Object> findAll (){
        
        List<Residence> listAll = residenceService.all();
        
        return ResponseHandler.generateResponse("Berhasil", HttpStatus.OK, true, listAll);
    }
    
    @GetMapping(value = "/province")
    public ResponseEntity<Object> listProvince (){
        
        List<Province> listAll = provinceService.listProvince();
        
        return ResponseHandler.generateResponse("Berhasil", HttpStatus.OK, true, listAll);
    }
    
    @GetMapping(value = "/district")
    public ResponseEntity<Object> lisDistrictByProv (@RequestParam(required = true) String idProvince){
        
        List<DistrictCode> listAll = codeService.listDistrictByProv(idProvince);
        
        return ResponseHandler.generateResponse("Berhasil", HttpStatus.OK, true, listAll);
    }
    
    @GetMapping(value = "/cusRating")
    public ResponseEntity<Object> findAllCusRating (){
        
        List<CustomerRating> listAll = ratingService.findAll();
        
        return ResponseHandler.generateResponse("Berhasil", HttpStatus.OK, true, listAll);
    }
    
    @GetMapping(value = "/jobTitle")
    public ResponseEntity<Object> findAllJobTitle (){
        
        List<JobTitle> listAll = jobTitleService.listJob();
        
        return ResponseHandler.generateResponse("Berhasil", HttpStatus.OK, true, listAll);
    }
    
    @GetMapping(value = "/acctPurpose")
    public ResponseEntity<Object> findAllAcct (){
        
        List<AcctOpenPurpose> listAll = acctOpenPurposeService.listAcct();
        
        return ResponseHandler.generateResponse("Berhasil", HttpStatus.OK, true, listAll);
    }
    
    @GetMapping(value = "/education")
    public ResponseEntity<Object> findAllEducation (){
        
        List<Education> listAll = educationService.listEducation();
        
        return ResponseHandler.generateResponse("Berhasil", HttpStatus.OK, true, listAll);
    }
    
    @GetMapping(value = "/fundSource")
    public ResponseEntity<Object> findAllFundSource (){
        
        List<FundSource> listAll = fundSourceService.listFund();
        
        return ResponseHandler.generateResponse("Berhasil", HttpStatus.OK, true, listAll);
    }
    
    @GetMapping(value = "/gurantor")
    public ResponseEntity<Object> findAllGurantor (){
        
        List<Gurantor> listAll = gurantorService.listGurantor();
        
        return ResponseHandler.generateResponse("Berhasil", HttpStatus.OK, true, listAll);
    }
    
    @GetMapping(value = "/LBUS")
    public ResponseEntity<Object> findAllLbusCust (){
        
        List<LBUSCustType> listAll = custTypeService.listLbus();
        
        return ResponseHandler.generateResponse("Berhasil", HttpStatus.OK, true, listAll);
    }
    
    @GetMapping(value = "/legal")
    public ResponseEntity<Object> findAllLegal (@RequestParam(required = true) String legal){
        
        List<Legal> listAll = legalService.listLegal(legal);
        
        return ResponseHandler.generateResponse("Berhasil", HttpStatus.OK, true, listAll);
    }
    
    @GetMapping(value = "/marital")
    public ResponseEntity<Object> findAllMarital (){
        
        List<Marital> listAll = maritalService.findMarital();
        
        return ResponseHandler.generateResponse("Berhasil", HttpStatus.OK, true, listAll);
    }
    
    @GetMapping(value = "/relation")
    public ResponseEntity<Object> findAllRelation (){
        
        List<Relation> listAll = relationService.listRelation();
        
        return ResponseHandler.generateResponse("Berhasil", HttpStatus.OK, true, listAll);
    }
    
    @GetMapping(value = "/SID")
    public ResponseEntity<Object> findAllSID (){
        
        List<SIDRelationBank> listAll = iDRelationService.listSID();
        
        return ResponseHandler.generateResponse("Berhasil", HttpStatus.OK, true, listAll);
    }
    
}
