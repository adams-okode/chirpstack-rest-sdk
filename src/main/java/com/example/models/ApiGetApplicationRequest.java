/*
 * LoRaServerRESTAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.example.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class ApiGetApplicationRequest 
        implements java.io.Serializable {
    private static final long serialVersionUID = 5393087049566767728L;
    private String appEUI;
    /** GETTER
     * hex encoded AppEUI
     */
    @JsonGetter("appEUI")
    public String getAppEUI ( ) { 
        return this.appEUI;
    }
    
    /** SETTER
     * hex encoded AppEUI
     */
    @JsonSetter("appEUI")
    public void setAppEUI (String value) { 
        this.appEUI = value;
    }
 
}
 