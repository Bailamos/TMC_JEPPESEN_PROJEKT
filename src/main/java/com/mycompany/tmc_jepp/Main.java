
package com.mycompany.tmc_jepp;

import com.mycompany.tmc_jepp.Services.GatesService;
import com.mycompany.tmc_jepp.Utils.JsonUtil;
import org.json.JSONObject;

import static spark.Spark.*;


public class Main {

    public static void main(String[] args) {

        port(5000);
        GatesService gates = new GatesService();

        get("/getGates", "application/json", (req, res) ->
                gates.getGates(), JsonUtil.json());

        get("/getChosenGate", "application/json",(req, res) ->
                gates.getChosenGate());

        post("/setChosenGate","application/json", (req, res) -> {
            JSONObject jsonObj = new JSONObject(req.body());
            return gates.choseGate(jsonObj);
        });
    }
}