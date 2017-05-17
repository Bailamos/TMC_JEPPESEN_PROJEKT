/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.tmc_jepp.Models;

import java.util.ArrayList;
import spark.Request;

public class GatesService {
    private ArrayList<Gate> gates;
    private String choosenGate;
    
    public GatesService(){
        gates = new ArrayList<Gate>();
        gates.add(new Gate("3050042784","54.3814913","18.4658952"));
        gates.add(new Gate("3050042787","54.3812070","18.4670700"));
    }
    
    public ArrayList<Gate> getGates(){
        return gates;
    }
    
    public String getChosenGate(){
        return choosenGate;
    }
    
    public String choseGate(Request req){
        choosenGate = req.body();
        return req.body();
    }
    
}
