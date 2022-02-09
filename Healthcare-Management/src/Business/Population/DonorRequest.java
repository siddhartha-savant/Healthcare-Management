/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Population;

import Business.Antigen.AntigenEntity;
import java.util.Date;

/**
 *
 * @author siddharthasavant
 */
public class DonorRequest {
    
    private String IdOfDonor;
    private String nameOfDonor;
    private Date dateOfBirth;
    private int age;
    private long contact;
    private String emailID;
  
    private String gender;
    private String streetAddress;
    private String city;
    private String state;
    private int zipCode;
    
    private boolean brainDamageToDonor;
    private boolean diabetesToDonor;
    private boolean breathingDisorder;
    private boolean chronicDiscomfort;
    private String status;
    private Date  diagnosisDate;
    private Date  lastDonationDate;
    
    private String imagePath;
    private byte[] dP;
    private AntigenEntity hla;
    

    public DonorRequest() {
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

    public String getNameOfDonor() {
        return nameOfDonor;
    }
    
    public void setNameOfDonor(String nameOfDonor) {
        this.nameOfDonor = nameOfDonor;
    }
    
    public long getContact() {
        return contact;
    }
    
    public void setContact(long contact) {
        this.contact = contact;
    }
    
    public String getIdOfDonor() {      
        return IdOfDonor; 
    }
    
    public void setIdOfDonor(String IdOfDonor) {   
        this.IdOfDonor = IdOfDonor;    
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
    
    public AntigenEntity getHLA() { 
        return hla;   
    }
    
    public void setHLA(AntigenEntity hla) {  
        this.hla = hla; 
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
    
    public Date getLastDonationDate() {   
        return lastDonationDate;
    }
    
    public void setLastDonationDate(Date lastDonationDate) {   
        this.lastDonationDate = lastDonationDate; 
    }
    
    public boolean isBrainDamageToDonor() {  
        return brainDamageToDonor;
    }
    
    public void setBrainDamageToDonor(boolean brainDamageToDonor) {    
        this.brainDamageToDonor = brainDamageToDonor; 
    }
    
    public boolean isDiabetesToDonor() {
        return diabetesToDonor;  
    }
    
    public void setDiabetesToDonor(boolean diabetesToDonor) { 
        this.diabetesToDonor = diabetesToDonor;   
    }
    
    public boolean isBreathingDisorder() {
        return breathingDisorder;
    }
    
    public void setBreathingDisorder(boolean breathingDisorder) { 
        this.breathingDisorder = breathingDisorder;  
    }
          
    @Override
    public String toString() {
        return IdOfDonor;
    }

    public void setDiagnosisDate(Date date) {
        this.diagnosisDate = date;
    }

    public Date getDiagnosisDate() {
        return this.diagnosisDate;
    }

    public AntigenEntity getHla() {
        return hla;
    }

    public void setHla(AntigenEntity hla) {
        this.hla = hla;
    }

    public boolean isChronicDiscomfort() {
        return chronicDiscomfort;
    }

    public void setChronicDiscomfort(boolean chronicDiscomfort) {
        this.chronicDiscomfort = chronicDiscomfort;
    }
    
}
