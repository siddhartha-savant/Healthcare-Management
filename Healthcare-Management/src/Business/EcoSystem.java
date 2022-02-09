/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Business.Population.PatientDirectory;
import Business.Population.PatientRequestDirectory;
import Business.Employee.Employee;
import Business.Network.Network;
import Business.Role.Role;
import Business.Role.SystemAdminRole;
import Business.UserAccount.UserAccount;
import Business.UserAccount.UserAccountDirectory;
import Business.Organization.Organization;
import Business.Population.DonorDirectory;
import Business.Population.DonorRequestDirectory;
import java.util.ArrayList;

/**
 *
 * @author siddharthasavant
 */
public class EcoSystem extends Organization{
    
    private static EcoSystem business;
    private DonorDirectory donorList;
    private PatientDirectory patientList;
    private DonorRequestDirectory donorRequestList;
    private PatientRequestDirectory patientRequestList;
    private UserAccountDirectory userAccountList;
    private ArrayList<Network> networkList;
    
    private EcoSystem(){
        super("New Organization");
        this.patientRequestList = new PatientRequestDirectory();
        this.userAccountList  = new UserAccountDirectory();
        networkList = new ArrayList<Network>();
        this.donorList = new DonorDirectory();
        this.patientList = new PatientDirectory();
        this.donorRequestList = new DonorRequestDirectory();
        
    }
    
    public DonorRequestDirectory getDonorRequestList() { 
        if(this.donorRequestList == null)
            this.donorRequestList = new DonorRequestDirectory();
        return donorRequestList;    
    }
    
    public void setDonorRequestList(DonorRequestDirectory donorRequestList) {        
        this.donorRequestList = donorRequestList;    
    }
    
    public PatientRequestDirectory getPatientRequestList() {    
        if(this.patientRequestList == null)
            this.patientRequestList = new PatientRequestDirectory();
        return patientRequestList;    
    }
    
    public void setPatientRequestList(PatientRequestDirectory patientRequestList) {
        this.patientRequestList = patientRequestList;    
    }
    
    public PatientDirectory getPatientList() {
        if(this.patientList == null)
            this.patientList = new PatientDirectory();
        return patientList;
    }
    
    public void setPatientList(PatientDirectory patientList) {
        this.patientList = patientList;
    }
    
    public UserAccountDirectory getUserAccountList() {
        if(this.userAccountList == null) {
            userAccountList = new UserAccountDirectory();
            Employee employee = this.getEmployeeList().createEmployee("sysadmin");
            UserAccount ua = this.userAccountList.createUserAccount("sysadmin", "sysadmin", employee, new SystemAdminRole());
        }
        return this.userAccountList;
    }
    
    public void setUserAccountList(UserAccountDirectory userAccountList) { 
        this.userAccountList = userAccountList;  
    }

    public DonorDirectory getDonorList() {
        if(this.donorList == null)
            this.donorList = new DonorDirectory();
        return donorList;
    }
    
    public void setDonorList(DonorDirectory donorList) {
        this.donorList = donorList;
    }
    
    public ArrayList<Network> getNetworkList() {
        return networkList;
    }

    public void setNetworkList(ArrayList<Network> networkList) {
        this.networkList = networkList;
    }
    
    public static EcoSystem getInstance(){
        if(business==null){
            business=new EcoSystem();
        }
        return business;
    }
    
    public Network createAddNetworkEntity(){
        Network network=new Network();
        networkList.add(network);
        return network;
    }
    
    public boolean uniqueUserVerification(String userName){
        if(!this.getUserAccountList().checkIfUsernameIsUnique(userName)){
            return false;
        }
        for(Network network:networkList){
            
        }
        return true;
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roleList=new ArrayList<Role>();
        roleList.add(new SystemAdminRole());
        return roleList;
    }
}
