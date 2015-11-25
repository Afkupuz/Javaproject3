/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it252.dataEnter;

/**
 *
 * @author nicolas
 */
public class SalesRep {
    
    String repID, firstName, lastName, contact, district;
    double paper, books, supplies, total;
            
    //variable constructor
    SalesRep(String id, String first, String last, double books, double paper,
            double supplies, double total, String district, String contact){
        this.repID = id;
        this.firstName = first;
        this.lastName = last;
        this.paper = paper;
        this.books = books;
        this.supplies = supplies;
        this.total = total;
        this.district = district;
        this.contact = contact;
    };
    
    @Override
    public String toString() {
        String listed = "ID: "+repID + " , First Name: " + firstName  + ", Last Name: " + 
                lastName  + ", Books: $" + String.valueOf(books) + ", Paper: $" + 
                String.valueOf(paper) + ", Supplies: $" + String.valueOf(supplies) +
                ", Total: $" + String.valueOf(total) + ", District: " + 
                district + ", Contact: " + contact;
        
        return (listed);
    };
    
    
    
}
