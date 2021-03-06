/*
 * LoRaServerRESTAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.example.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class ApiUpdateApplicationRequest 
        implements java.io.Serializable {
    private static final long serialVersionUID = 5423695565238732086L;
    private String appEUI;
    private String name;
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
 
    /** GETTER
     * name of the application
     */
    @JsonGetter("name")
    public String getName ( ) { 
        return this.name;
    }
    
    /** SETTER
     * name of the application
     */
    @JsonSetter("name")
    public void setName (String value) { 
        this.name = value;
    }
 
}
 