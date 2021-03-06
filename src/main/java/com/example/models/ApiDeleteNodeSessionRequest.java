/*
 * LoRaServerRESTAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.example.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class ApiDeleteNodeSessionRequest 
        implements java.io.Serializable {
    private static final long serialVersionUID = 4760917717832513168L;
    private String devAddr;
    /** GETTER
     * hex encoded DevAddr
     */
    @JsonGetter("devAddr")
    public String getDevAddr ( ) { 
        return this.devAddr;
    }
    
    /** SETTER
     * hex encoded DevAddr
     */
    @JsonSetter("devAddr")
    public void setDevAddr (String value) { 
        this.devAddr = value;
    }
 
}
 