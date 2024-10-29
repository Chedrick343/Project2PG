/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.project1db;

/**
 *
 * @author samia
 */
public class Country {
    private int ID_Country;
    private String Name;
    private int ID_Image;

    public Country(int ID_Country, String Name, int ID_Image) {
        this.ID_Country = ID_Country;
        this.Name = Name;
        this.ID_Image = ID_Image;
    }

    public int getID_Country() {
        return ID_Country;
    }

    public void setID_Country(int ID_Country) {
        this.ID_Country = ID_Country;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public int getID_Image() {
        return ID_Image;
    }

    public void setID_Image(int ID_Image) {
        this.ID_Image = ID_Image;
    }
    
    
}
