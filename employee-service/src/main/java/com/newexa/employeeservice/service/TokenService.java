/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.newexa.employeeservice.service;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jws;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.security.Keys;
import java.io.UnsupportedEncodingException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.Signature;
import java.security.SignatureException;
import java.security.spec.ECGenParameterSpec;
import java.util.Date;
import java.util.UUID;
import org.springframework.stereotype.Component;

/**
 *
 * @author rimba
 */
@Component
public  class TokenService {
          
   
    public String generateToken (String userId) throws NoSuchAlgorithmException, InvalidAlgorithmParameterException, InvalidKeyException, UnsupportedEncodingException, SignatureException {
            
        
        KeyPairGenerator keyGen = KeyPairGenerator.getInstance("EC");
        keyGen.initialize(new ECGenParameterSpec("secp256r1"), new SecureRandom());
        
        KeyPair pair = keyGen.generateKeyPair();
        PrivateKey priv = pair.getPrivate();
        PublicKey pub = pair.getPublic();
        
        Signature ecdsa = Signature.getInstance("SHA256withECDSA");
        ecdsa.initSign(priv);
        
        String str = "This is string to sign";
        byte[] strByte = str.getBytes("UTF-8");
        ecdsa.update(strByte);
        
        byte[] reaSig = ecdsa.sign();
        
            Date expDate = new Date(new Date().getTime() + (60 * 60 * 1009));
            System.out.println("Exp Date : "+expDate.toString());
            return Jwts
                    .builder()
                .setSubject(userId)
                .setId(UUID.randomUUID().toString())
                .setIssuedAt(new Date())
                .setExpiration(expDate)
                .signWith(SignatureAlgorithm.HS512, reaSig)
                .compact();
        
    }
    
    public Jws<Claims> validate (String token) throws Exception {
        
        KeyPairGenerator keyGen = KeyPairGenerator.getInstance("EC");
        keyGen.initialize(new ECGenParameterSpec("secp256r1"), new SecureRandom());
        
        KeyPair pair = keyGen.generateKeyPair();
        PrivateKey priv = pair.getPrivate();
        PublicKey pub = pair.getPublic();
        
        Signature ecdsa = Signature.getInstance("SHA256withECDSA");
        ecdsa.initSign(priv);
        
        String str = "This is string to sign";
        byte[] strByte = str.getBytes("UTF-8");
        ecdsa.update(strByte);
        
        byte[] reaSig = ecdsa.sign();
        
        return Jwts
                .parser()
                .setSigningKey(reaSig)
                .parseClaimsJws(token);
    }
}
