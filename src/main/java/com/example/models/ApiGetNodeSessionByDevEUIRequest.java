/*
 * LoRaServerRESTAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.example.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class ApiGetNodeSessionByDevEUIRequest 
        implements java.io.Serializable {
    private static final long serialVersionUID = 4718359531398791829L;
    private String devEUI;
    /** GETTER
     * hex encoded DevEUI
     */
    @JsonGetter("devEUI")
    public String getDevEUI ( ) { 
        return this.devEUI;
    }
    
    /** SETTER
     * hex encoded DevEUI
     */
    @JsonSetter("devEUI")
    public void setDevEUI (String value) { 
        this.devEUI = value;
    }
 
}
 