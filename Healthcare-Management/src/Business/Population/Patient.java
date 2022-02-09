/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Population;

import java.util.Date;
import Business.Antigen.AntigenEntity;
import Business.Antigen.AntigenEntity.TypeOfHLA;

/**
 *
 * @author siddharthasavant
 */
public class Patient {
    private String IdOfPatient;
    private String nameOfPatient;
    private Date dateOfBirthOfPatient;
    private int ageOfPatient;
    private String gender;
    private AntigenEntity hla;
    private String streetAddress;
    private String city;
    private String state;
    private int zipCode;
    private long contact;
    private String emailID;
    private String status;
    private boolean labVerification;
    private boolean legalConfirmation;
    private boolean statusAsEmergency;
    private Date dateOfTreatment;
    private String imagePath;
    private String diseaseType;
    private byte[] Pd;

    public Patient() {
        this.hla = new AntigenEntity();
    }

    public String getDiseaseType() {
        return diseaseType;
    }

    public void setDiseaseType(String diseaseType) {
        this.diseaseType = diseaseType;
    }
    
    
    public byte[] getPd() {
        return Pd;
    }

    public void setPd(byte[] Pd) {
        this.Pd = Pd;
    }    

    public String getImagePath() {
        return imagePath;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }

    public String getNameOfPatient() {   
        return nameOfPatient;  
    }
    
    public void setNameOfPatient(String nameOfPatient) {  
        this.nameOfPatient = nameOfPatient;   
    }
    
    public long getContact() {   
        return contact;   
    }
    
    public void setContact(long contact) {    
        this.contact = contact;  
    }
    
    public String getIdOfPatient() {
        return IdOfPatient; 
    }
    
    public void setIdOfPatient(String IdOfPatient) { 
        this.IdOfPatient = IdOfPatient; 
    }
    
    public Date getDateOfBirthOfPatient() {    
        return dateOfBirthOfPatient; 
    }
    
    public void setDateOfBirthOfPatient(Date dateOfBirthOfPatient) {  
        this.dateOfBirthOfPatient = dateOfBirthOfPatient; 
    }
    
    public int getAgeOfPatient() {  
        return ageOfPatient;  
    }
    
    public void setAgeOfPatient(int ageOfPatient) {  
        this.ageOfPatient = ageOfPatient; 
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
    
    public boolean isLabVerification() {   
        return labVerification;   
    }
    
    public void setLabVerification(boolean labVerification) {   
        this.labVerification = labVerification;   
    }
    
    public boolean isLegalConfirmation() {   
        return legalConfirmation;  
    }
    
    public void setLegalConfirmation(boolean legalConfirmation) {    
        this.legalConfirmation = legalConfirmation;    
    }
    
    public boolean isStatusAsEmergency() {   
        return statusAsEmergency; 
    }
    
    public void setStatusAsEmergency(boolean statusAsEmergency) {   
        this.statusAsEmergency = statusAsEmergency; 
    }
    
    public Date getDateOfTreatment() {    
        return dateOfTreatment;  
    }
    
    public void setDateOfTreatment(Date dateOfTreatment) {  
        this.dateOfTreatment = dateOfTreatment;   
    }
    
    @Override
    public String toString() {
        return IdOfPatient;
    }

}
