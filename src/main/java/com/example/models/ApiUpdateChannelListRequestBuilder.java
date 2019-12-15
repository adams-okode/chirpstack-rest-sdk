/*
 * LoRaServerRESTAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.example.models;

import java.util.*;

public class ApiUpdateChannelListRequestBuilder {
    //the instance to build
    private ApiUpdateChannelListRequest apiUpdateChannelListRequest;

    /**
     * Default constructor to initialize the instance
     */
    public ApiUpdateChannelListRequestBuilder() {
        apiUpdateChannelListRequest = new ApiUpdateChannelListRequest();
    }

    public ApiUpdateChannelListRequestBuilder id(String id) {
        apiUpdateChannelListRequest.setId(id);
        return this;
    }

    public ApiUpdateChannelListRequestBuilder name(String name) {
        apiUpdateChannelListRequest.setName(name);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public ApiUpdateChannelListRequest build() {
        return apiUpdateChannelListRequest;
    }
}