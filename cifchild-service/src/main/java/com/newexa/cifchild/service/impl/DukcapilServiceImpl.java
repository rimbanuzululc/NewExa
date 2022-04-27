/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.newexa.cifchild.service.impl;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.util.JSONPObject;
import com.google.common.collect.HashBiMap;
import com.google.common.collect.Multimap;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.newexa.cifchild.model.Dukcapil;
import com.newexa.cifchild.model.ResponDukcapil;
import com.newexa.cifchild.service.DukcapilService;
import java.util.Base64;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.tomcat.util.json.JSONParser;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.http.client.support.BasicAuthenticationInterceptor;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 *
 * @author hp
 */
@Service
public class DukcapilServiceImpl implements DukcapilService{

    @Override
    public Dukcapil cekDukcapil(Dukcapil dukcapil) {
            String url = "http://10.0.117.109:8080/wsktp-api-0.0.1/api/nikVerifyByElement";
//            String url = "http://localhost:9004/dummy/";
            
            RestTemplate restTemplate = new RestTemplate();
            
            Dukcapil dukcapil2 = new Dukcapil();
            
            HttpHeaders headers = new HttpHeaders();
            headers.setContentType(MediaType.APPLICATION_JSON);
            headers.setAccept(Collections.singletonList(MediaType.APPLICATION_JSON));
            
//            headers.setBasicAuth("Basic ZXhhOmV4YWRldg==");
            headers.add("Authorization", "Basic "+"ZXhhOmV4YWRldg==");
            
            Map<String, Object> map = new HashMap<>();
            
            map.put("CHANNEL_NAME", dukcapil.getChannel());
            map.put("UID", dukcapil.getUid());
            map.put("NIK", dukcapil.getNik());
            map.put("NAMA_LGKP", dukcapil.getFullName());
            map.put("NAMA_LGKP_IBU", dukcapil.getMaidenName());
            map.put("JENIS_KLMIN", dukcapil.getGender());
            map.put("TMPT_LHR", dukcapil.getBirthPlace());
            map.put("TGL_LHR", dukcapil.getBirthDate());
            
            HttpEntity<Map<String, Object>> entity = new HttpEntity<>(map, headers);
            System.out.println(entity);
            
            ResponseEntity<String> response = restTemplate.postForEntity(url, entity, String.class);
            
            if (response.getStatusCode() == HttpStatus.CREATED) {
                System.out.println(response.getBody());
                JsonParser parser = new JsonParser();
                String json = response.getBody().toString();
                JsonElement jsonTree = parser.parse(json);
                
                if (jsonTree.isJsonObject()) {
                    JsonObject jsonObject = jsonTree.getAsJsonObject();
                    JsonElement data = jsonObject.getAsJsonObject("data");  
                    
                    if (data.isJsonObject()) {
                        
                        JsonObject data2 = data.getAsJsonObject();
                        
                        for (int i = 0; i < data2.size(); i++) {
                            
                            if (data2.get("NIK") != null) {
                                
                                dukcapil2.setNik(data2.get("NIK").getAsString());
                                
                            } if (!data2.get("JENIS_KLMIN").toString().isEmpty()){
                                
                                dukcapil2.setGender(data2.get("JENIS_KLMIN").getAsString());
                                
                            } if (data2.get("TMPT_LHR").toString() != null){
                                
                                dukcapil2.setBirthPlace(data2.get("TMPT_LHR").getAsString());
                                
                            } if (data2.get("NAMA_LGKP").toString() != null){
                                
                                dukcapil2.setFullName(data2.get("NAMA_LGKP").getAsString());
                                
                            } if (data2.get("NAMA_LGKP_IBU").toString() != null){
                                
                                dukcapil2.setMaidenName(data2.get("NAMA_LGKP_IBU").getAsString());
                                
                            } if (data2.get("TGL_LHR").toString() != null){
                                
                                dukcapil2.setBirthDate(data2.get("TGL_LHR").getAsString());
                                
                            }
                            
                        }
                        
                    }
                }
                
            } else {
                System.out.println(response.getStatusCode());
}
            
        return dukcapil2;
    }
    
}
