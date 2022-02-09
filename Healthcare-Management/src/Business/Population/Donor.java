/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Population;

import java.util.Date;
import Business.Antigen.AntigenEntity;
/**
 *
 * @author siddharthasavant
 */
public class Donor {
    
    private String IdOfDonor;
    private String nameOfDonor;
    private String city;
    private String state;
    private int zipCode;
    private long contactNumber;
    private String emailID;
    private String status;
    
    private Date dateOfBirthOfDonor;
    private int age;
    private boolean respiratoryProblem;
    private String imagePath; 
    private byte[] pD;
    private Date diagnosisDate;
    private String gender;
    private AntigenEntity hla;
    private String streetAddress;
   
    private Date  lastDonationDate;
    private boolean brainDamageToDonor;
    private boolean diabetesBPToDonor;       //Currently you do NOT have any diabetesBPToDonor? 
    

    public byte[] getpD() {
        return pD;
    }

    public void setpD(byte[] pD) {
        this.pD = pD;
    }
    
    public Donor(){
        this.hla = new AntigenEntity();
    }
    
    
    public String getImagePath() {
        return imagePath;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }


// Getter Setter Functions
    public String getNameOfDonor() {
        return nameOfDonor;
    }
    
    public void setNameOfDonor(String nameOfDonor) {
        this.nameOfDonor = nameOfDonor;
    }
    
    public long getContactNumber() {
        return contactNumber;
    }
    
    public void setContactNumber(long contactNumber) {
        this.contactNumber = contactNumber;
    }
    
    public String getIdOfDonor() {
        return IdOfDonor;    
    }
    
    public void setIdOfDonor(String IdOfDonor) {  
        this.IdOfDonor = IdOfDonor;  
    }
    
    public Date getDateOfBirthOfDonor() { 
        return dateOfBirthOfDonor;  
    }
    
    public void setDateOfBirthOfDonor(Date dateOfBirthOfDonor) {  
        this.dateOfBirthOfDonor = dateOfBirthOfDonor;   
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
        if(this.hla == null){
            this.hla = new AntigenEntity();
            hla.AntigenUpdationList("HLA_A,HLA_B");
        }
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
    
    public boolean isDiabetesBPToDonor() {    
        return diabetesBPToDonor;   
    }
    
    public void setDiabetesBPToDonor(boolean diabetesBPToDonor) {  
        this.diabetesBPToDonor = diabetesBPToDonor;   
    }
    
    public boolean isRespiratoryProblem() {
        return respiratoryProblem;
    }
    
    public void setRespiratoryProblem(boolean respiratoryProblem) {      
        this.respiratoryProblem = respiratoryProblem;  
    }

    public AntigenEntity getHla() {
        return hla;
    }

    public void setHla(AntigenEntity hla) {
        this.hla = hla;
    }
          
    @Override
    public String toString() {
        return IdOfDonor;
    }

    public void setDiagnosisDate(Date date) {
        this.diagnosisDate = date;
    }
}
