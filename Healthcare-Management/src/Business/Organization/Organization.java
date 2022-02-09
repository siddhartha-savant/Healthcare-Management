/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Antigen.AntigenEntity;
import Business.DB4OUtil.DB4OUtil;
import Business.EcoSystem;
import Business.Employee.EmployeeDirectory;
import Business.Role.Role;
import Business.UserAccount.UserAccountDirectory;
import Business.WorkQueue.WorkQueue;
import java.util.ArrayList;

/**
 *
 * @author siddharthasavant
 */
public abstract class Organization {

    private int organizationID;
    private String organizationName;
    private String actualName;
    private WorkQueue workQueue;
    private EmployeeDirectory employeeList;
    private UserAccountDirectory userAccountList;
    
    private static int counter=0;
    private ArrayList<AntigenEntity> allHLAs;
    private DB4OUtil dB4OUtil = DB4OUtil.getInstance();
    
    
    public enum Type{
        Admin("Admin Organization"),        
        HealthServiceManager("Health Service Organization"),
        Doctor("Doctor Organization"), 
        Pathologist("Pathologist Organization");
        private String value;
        private Type(String value) {
            this.value = value;
        }
        public String getValue() {
            return value;
        }
    }
    
     public enum BoneMarrowBankType {
         
        BoneMarrowCenter("BoneMarrow Center Administrator Organization");
        private String value;

        private BoneMarrowBankType(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }
     }
    
    public enum HematologicDiseaseCenterType {
         
        HematologicDiseaseCenter("HematologicDisease Centre Coordinator Organization");
        private String value;

        private HematologicDiseaseCenterType(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }
     }
    
    public enum GovernmentType {
         
        Government("Government Coordinator Organization");
        private String value;

        private GovernmentType(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }
     }
    
    
     public enum LegalType {
         
        LegalOfficer("Legal Officer Organization");
        private String value;

        private LegalType(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }
     }

    public Organization(String name) {
        this.organizationName = name;
        workQueue = new WorkQueue();
        System.out.println("Work Queue Initialised");
        userAccountList = new UserAccountDirectory();
        allHLAs = new ArrayList<AntigenEntity>();
        employeeList = new EmployeeDirectory();
        
        organizationID = counter;
        ++counter;
    }

    public abstract ArrayList<Role> getSupportedRole();
    
    public UserAccountDirectory getUserAccountList() {
        return userAccountList;
    }

    public int getOrganizationID() {
        return organizationID;
    }

    public EmployeeDirectory getEmployeeList() {
        return employeeList;
    }
    
    public String getOrganizationName() {
        return organizationName;
    }

    public WorkQueue getWorkQueue() {
        return workQueue;
    }

    public void setOrganizationName(String organizationName) {
        this.organizationName = organizationName;
    }

    public void setWorkQueue(WorkQueue workQueue) {
        this.workQueue = workQueue;
    }

    public ArrayList<AntigenEntity> getAllHLAs() {
        return allHLAs;
    }

    public void setAllHLAsList(ArrayList<AntigenEntity> allHLAs) {
        this.allHLAs = allHLAs;
    }
    
    public void addHLA(AntigenEntity hla) {
        this.allHLAs.add(hla);
    }

    public String getActualName() {
        return actualName;
    }

    public void setActualName(String actualName) {
        this.actualName = actualName;
    }

   @Override
    public String toString() {
        return organizationName;
    }
       
}
