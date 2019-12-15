/*
 * LoRaServerRESTAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.example.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class ApiListApplicationRequest 
        implements java.io.Serializable {
    private static final long serialVersionUID = 5581795962152789337L;
    private String limit;
    private String offset;
    /** GETTER
     * max number of results to return
     */
    @JsonGetter("limit")
    public String getLimit ( ) { 
        return this.limit;
    }
    
    /** SETTER
     * max number of results to return
     */
    @JsonSetter("limit")
    public void setLimit (String value) { 
        this.limit = value;
    }
 
    /** GETTER
     * result offset (for pagination)
     */
    @JsonGetter("offset")
    public String getOffset ( ) { 
        return this.offset;
    }
    
    /** SETTER
     * result offset (for pagination)
     */
    @JsonSetter("offset")
    public void setOffset (String value) { 
        this.offset = value;
    }
 
}
 