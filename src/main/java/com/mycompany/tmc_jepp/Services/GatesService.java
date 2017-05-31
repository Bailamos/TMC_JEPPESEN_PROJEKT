/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.tmc_jepp.Services;

import java.util.ArrayList;

import com.mycompany.tmc_jepp.Models.Gate;
import org.json.JSONObject;

public class GatesService {
    private ArrayList<Gate> gates;
    private JSONObject choosenGate;

    public GatesService(){
        gates = new ArrayList<Gate>();
        gates.add(new Gate("3050042783","54.3813476","18.4664826"));
        gates.add(new Gate("3050042784","54.3814913","18.4658952"));
        gates.add(new Gate("3050042786","54.3816382","18.4653212"));
        gates.add(new Gate("3050042787","54.3812070","18.4670700"));
    }
    
    public ArrayList<Gate> getGates(){
        return gates;
    }
    
    public JSONObject getChosenGate(){
        return choosenGate;
    }
    
    public JSONObject choseGate(JSONObject gate){
        choosenGate = gate;
        return gate;
    }
    
}
