/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.tmc_jepp;


import com.mycompany.tmc_jepp.Models.Gate;
import com.mycompany.tmc_jepp.Models.GatesService;
import java.util.ArrayList;
import static spark.Spark.*;


public class Hello{
    public static void main(String[] args) {
        port(80);
        GatesService gates = new GatesService();      
        get("/getGates", (req, res) -> gates.getGates(), JsonUtil.json());
        get("/getChosenGate", (req, res) -> gates.getChosenGate(), JsonUtil.json());
        post("/setChosenGate", (req, res) -> gates.choseGate(req), JsonUtil.json());
    }
}