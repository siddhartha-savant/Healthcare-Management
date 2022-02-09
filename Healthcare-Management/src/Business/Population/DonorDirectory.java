/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Population;

import java.util.ArrayList;

/**
 *
 * @author siddharthasavant
 */
public class DonorDirectory {
    private ArrayList<Donor> donorList;

    public DonorDirectory() {
        donorList = new ArrayList<Donor>();
    }

    public ArrayList<Donor> getDonorList() {
        return donorList;
    }

    public void setDonorList(ArrayList<Donor> donorList) {
        this.donorList = donorList;
    }
    
    public Donor addDonor(Donor donor)
    {
        donorList.add(donor);
        return donor;
    }
    
}
