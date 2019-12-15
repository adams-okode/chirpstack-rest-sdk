/*
 * LoRaServerRESTAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.example.models;

import java.util.*;

public class ApiGetChannelRequestBuilder {
    //the instance to build
    private ApiGetChannelRequest apiGetChannelRequest;

    /**
     * Default constructor to initialize the instance
     */
    public ApiGetChannelRequestBuilder() {
        apiGetChannelRequest = new ApiGetChannelRequest();
    }

    public ApiGetChannelRequestBuilder id(String id) {
        apiGetChannelRequest.setId(id);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public ApiGetChannelRequest build() {
        return apiGetChannelRequest;
    }
}