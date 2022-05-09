///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package com.newexa.cifchild.consumesoap;
//
///**
// *
// * @author hp
// */
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.oxm.jaxb.Jaxb2Marshaller;
//
//@Configuration
//public class BeanConfig {
//    @Bean
//    public Jaxb2Marshaller marshaller()  {
//        Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
//        marshaller.setContextPath("com.newexa.cifperoranganservice.stub");
//        return marshaller;
//    }
//
//    @Bean
//    public SoapClient soapConnector(Jaxb2Marshaller marshaller) {
//        SoapClient client = new SoapClient();
//        client.setDefaultUri("http://10.0.147.139:8180/iBSM_TWS/services");
//        client.setMarshaller(marshaller);
//        client.setUnmarshaller(marshaller);
//        return client;
//    }
//}