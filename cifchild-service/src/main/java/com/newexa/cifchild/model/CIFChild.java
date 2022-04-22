/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.newexa.cifchild.model;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author hp
 */

@Entity
@Table(name = "cifchild")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CIFChild {
    
    private String nomor_Identitas;
    private String nama_Identitas;
    private String nama_panggilan;
    private String nama_Ibu_Kandung;
    private String tempat_lahir;
    private Date tanggal_lahir;
    private String agama;
    private String gender;
    
    
    
}
