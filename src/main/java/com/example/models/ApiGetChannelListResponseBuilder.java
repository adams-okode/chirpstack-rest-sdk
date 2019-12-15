/*
 * LoRaServerRESTAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.example.models;

import java.util.*;

public class ApiGetChannelListResponseBuilder {
    //the instance to build
    private ApiGetChannelListResponse apiGetChannelListResponse;

    /**
     * Default constructor to initialize the instance
     */
    public ApiGetChannelListResponseBuilder() {
        apiGetChannelListResponse = new ApiGetChannelListResponse();
    }

    public ApiGetChannelListResponseBuilder id(String id) {
        apiGetChannelListResponse.setId(id);
        return this;
    }

    public ApiGetChannelListResponseBuilder name(String name) {
        apiGetChannelListResponse.setName(name);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public ApiGetChannelListResponse build() {
        return apiGetChannelListResponse;
    }
}