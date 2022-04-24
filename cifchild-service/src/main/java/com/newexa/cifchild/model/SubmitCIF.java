/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.newexa.cifchild.model;

/**
 *
 * @author hp
 */
public class SubmitCIF {

    protected CIFChild child;
    protected ParentCifChild parent;
    
    public CIFChild getChild() {
        return child;
    }

    public void setChild(CIFChild child) {
        this.child = child;
    }

    public ParentCifChild getParent() {
        return parent;
    }

    public void setParent(ParentCifChild parent) {
        this.parent = parent;
    }
    
    
}
