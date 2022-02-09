/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Antigen;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

/**
 *
 * @author siddharthasavant
 */
public class AntigenCounter {
    HashMap<String, Integer> antigenCount;
    
    public AntigenCounter() {
        antigenCount = new HashMap<>();
    }
    
    public void addHLACount(AntigenEntity hla) {
        ArrayList<String> hlaValues = hla.listOfAntigentValues();
        Collections.sort(hlaValues);
        String comboHLA = String.join(", ", hlaValues);
        this.antigenCount.putIfAbsent(comboHLA, 0);
        this.antigenCount.put(comboHLA, this.antigenCount.get(comboHLA) + 1);
    }
    
    public void addHLACount(AntigenEntity hla, Integer i) {
        ArrayList<String> hlaValues = hla.listOfAntigentValues();
        Collections.sort(hlaValues);
        String comboHLA = String.join(", ", hlaValues);
        this.antigenCount.putIfAbsent(comboHLA, 0);
        this.antigenCount.put(comboHLA, this.antigenCount.get(comboHLA) + i);
    }
    
    public void substractHLACount(AntigenEntity hla) {
        ArrayList<String> hlaValues = hla.listOfAntigentValues();
        Collections.sort(hlaValues);
        String comboHLA = String.join(", ", hlaValues);
        this.antigenCount.put(comboHLA, this.antigenCount.get(comboHLA) - 1);
    }
    
    public HashMap<String, Integer> getHlaComboCounts() {
        return antigenCount;
    }
    
}
