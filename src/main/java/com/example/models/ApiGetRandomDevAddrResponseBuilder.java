/*
 * LoRaServerRESTAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.example.models;

import java.util.*;

public class ApiGetRandomDevAddrResponseBuilder {
    //the instance to build
    private ApiGetRandomDevAddrResponse apiGetRandomDevAddrResponse;

    /**
     * Default constructor to initialize the instance
     */
    public ApiGetRandomDevAddrResponseBuilder() {
        apiGetRandomDevAddrResponse = new ApiGetRandomDevAddrResponse();
    }

    /**
     * hex encoded DevAddr
     */
    public ApiGetRandomDevAddrResponseBuilder devAddr(String devAddr) {
        apiGetRandomDevAddrResponse.setDevAddr(devAddr);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public ApiGetRandomDevAddrResponse build() {
        return apiGetRandomDevAddrResponse;
    }
}