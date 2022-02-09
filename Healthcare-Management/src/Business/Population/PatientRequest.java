/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Population;

import Business.Antigen.AntigenEntity;
import Business.Antigen.AntigenEntity.TypeOfHLA;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author siddharthasavant
 */
public class PatientRequest {
    
    // Patient/Receiver Attributes   
    private String IDofPatientRequest;
    private String nameOfPatientRequest;
    private String streetAddress;
    private String city;
    private String state;
    private int zipCode;
    private String disease;
    
    private Date dateOfBirth;
    private Date diagnosisDate;
    private int age;
    private String gender;
    private AntigenEntity hla;
    
    private long contact;
    private String emailID;
    private boolean labConfirmation;
    private String status;
    private String imagePath;
    private byte[] dP;

    public String getDisease() {
        return disease;
    }

    public void setDisease(String disease) {
        this.disease = disease;
    }
    
    public PatientRequest() {
        this.hla = new AntigenEntity();
    }

    public byte[] getdP() {
        return dP;
    }

    public void setdP(byte[] dP) {
        this.dP = dP;
    }

    public String getImagePath() {
        return imagePath;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }


    public String getNameOfPatientRequest() {     
        return nameOfPatientRequest;  
    }
    
    public void setNameOfPatientRequest(String nameOfPatientRequest) {   
        this.nameOfPatientRequest = nameOfPatientRequest;
    }
    
    public long getContact() { 
        return contact;    
    }
    
    public void setContact(long contact) {  
        this.contact = contact;   
    }
    
    public String getIDofPatientRequest() {
        return IDofPatientRequest; 
    }
    
    public void setIDofPatientRequest(String IDofPatientRequest) {     
        this.IDofPatientRequest = IDofPatientRequest;   
    }
    
    public Date getDateOfBirth() {    
        return dateOfBirth;  
    }
    
    public void setDateOfBirth(Date dateOfBirth) {     
        this.dateOfBirth = dateOfBirth;   
    }
    
    public int getAge() { 
        return age; 
    }
    
    public void setAge(int age) {   
        this.age = age;   
    }
    
    public String getGender() {   
        return gender;    
    }
    
    public void setGender(String gender) {    
        this.gender = gender;   
    }
    
    public String getStreetAddress() {   
        return streetAddress;   
    }
    
    public void setStreetAddress(String streetAddress) {    
        this.streetAddress = streetAddress;   
    }
    
    public String getCity() {    
        return city;   
    }
    
    public void setCity(String city) {
        this.city = city;   
    }
    
    public String getState() {      
        return state;    
    }
    
    public void setState(String state) {   
        this.state = state; 
    }
    
    public int getZipCode() {      
        return zipCode;  
    }
    
    public void setZipCode(int zipCode) {     
        this.zipCode = zipCode;    
    }
    
    public String getEmailID() {   
        return emailID;  
    }
    
    public void setEmailID(String emailID) { 
        this.emailID = emailID; 
    }
    
    public String getStatus() { 
        return status;   
    }
    
    public void setStatus(String status) {    
        this.status = status;   
    }
    
    public boolean isLabConfirmation() {   
        return labConfirmation;  
    }
    
    public void setLabConfirmation(boolean labConfirmation) {  
        this.labConfirmation = labConfirmation; 
    }

    public AntigenEntity getHla() {
        return hla;
    }

    public void setHla(AntigenEntity hla) {
        this.hla = hla;
    }
    
    @Override
    public String toString() {
        return IDofPatientRequest;
    }

    public void setDiagnosisDate(Date date) {
        this.diagnosisDate = date;
    }
    
    public Date getDiagnosisDate() {
        return this.diagnosisDate;
    } 

}
