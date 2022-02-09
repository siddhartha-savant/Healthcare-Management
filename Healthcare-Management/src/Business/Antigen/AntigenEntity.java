/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Antigen;

import java.util.ArrayList;

/**
 *
 * @author siddharthasavant
 */
public class AntigenEntity {
    
    private ArrayList<TypeOfHLA> AntigenList = new ArrayList();
    
    public AntigenEntity() {
        AntigenList = new ArrayList<>();
    }
    
    public ArrayList<TypeOfHLA> getAntigenList() {
        return AntigenList;
    }
    
    public void setAntigenList(ArrayList<TypeOfHLA> AntigenList) {
        this.AntigenList = AntigenList;
    }
    
    public enum TypeOfHLA{
        HLA_A("HLA_A"),
        HLA_B("HLA_B"),
        HLA_C("HLA_C"),
        HLA_DR("HLA_DR"),
        HLA_DBQ1("HLA_DBQ1");
        
        private String value;
        private TypeOfHLA(String value){
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return value;
        }
    }
    
    public void addAntigen(TypeOfHLA hlaType) {   
        for(TypeOfHLA typeOfAntigen : this.getAntigenList()) {
            if(typeOfAntigen.getValue().equals(hlaType.getValue())) {
                System.out.println("HLAType already in patient's HLA List");
                return;
            }
        } 
        this.getAntigenList().add(hlaType);
    }


    public void deleteAntigen(TypeOfHLA hlaType) {
        this.getAntigenList().remove(hlaType);
    }
    
    public static AntigenEntity antigenCreation(String hlaList) {
        AntigenEntity antigenEntity = new AntigenEntity();
        antigenEntity.AntigenUpdationList(hlaList);
        return antigenEntity;
    }
    
    public ArrayList<String> listOfAntigentValues() {
        ArrayList<String> hlaValuesList = new ArrayList<String>();
        for(TypeOfHLA h : this.AntigenList) {
            hlaValuesList.add(h.getValue());
        }       
        return hlaValuesList;
    }

    public void AntigenUpdationList(String hlaList) {
        this.AntigenList = new ArrayList<TypeOfHLA>();
        try {
            for(String hlaType: hlaList.split(",")) {
                this.AntigenList.add(TypeOfHLA.valueOf(hlaType.trim()));
            }
        }
        catch (Exception e){
            System.out.println(e);
            this.AntigenList.add(TypeOfHLA.valueOf(hlaList));
        }
    }
    
    public void listOfHLAUpdationContaining(String hlaList) {
        this.AntigenList = new ArrayList<TypeOfHLA>();
        System.out.println(hlaList);
        try {
            for(String hlaType: hlaList.split("-")) {
                System.out.println(hlaType);
                this.AntigenList.add(TypeOfHLA.valueOf(hlaType.trim()));
            }
        }
        catch (Exception e){
            System.out.println(e);
            this.AntigenList.add(TypeOfHLA.valueOf(hlaList));
        }
    }
    
    
    
}
