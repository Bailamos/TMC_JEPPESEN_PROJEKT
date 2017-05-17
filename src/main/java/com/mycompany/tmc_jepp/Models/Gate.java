/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.tmc_jepp.Models;

public class Gate {

    private String id;
    private String lat;
    private String lon;

    public Gate(String id, String lat, String lon){
        this.id = id;
        this.lat = lat;
        this.lon = lon;
    }
    
    public void setId(String id) {
        this.id = id;
    }
    
    public void setLon(String lon) {
        this.lon = lon;
    }

    public void setLat(String lat) {
        this.lat = lat;
    }

    public String getId() {
        return this.id;
    }

    public String getLat() {
        return lat;
    }

    public String getLon() {
        return lon;
    }
}
