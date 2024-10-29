/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.project1db;


/**
 *
 * @author samia
 */
public class IdentificationType {
    private int ID_IdentificationType;
    private String name;

    public IdentificationType(int ID_IdentificationType, String name) {
        this.ID_IdentificationType = ID_IdentificationType;
        this.name = name;
    }

    public int getID_IdentificationType() {
        return ID_IdentificationType;
    }

    public void setID_IdentificationType(int ID_IdentificationType) {
        this.ID_IdentificationType = ID_IdentificationType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    
}
