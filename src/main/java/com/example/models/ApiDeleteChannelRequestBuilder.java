/*
 * LoRaServerRESTAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.example.models;

import java.util.*;

public class ApiDeleteChannelRequestBuilder {
    //the instance to build
    private ApiDeleteChannelRequest apiDeleteChannelRequest;

    /**
     * Default constructor to initialize the instance
     */
    public ApiDeleteChannelRequestBuilder() {
        apiDeleteChannelRequest = new ApiDeleteChannelRequest();
    }

    public ApiDeleteChannelRequestBuilder id(String id) {
        apiDeleteChannelRequest.setId(id);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public ApiDeleteChannelRequest build() {
        return apiDeleteChannelRequest;
    }
}