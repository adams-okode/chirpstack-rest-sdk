/*
 * LoRaServerRESTAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.example.models;

import java.util.*;

public class ApiListChannelsByChannelListRequestBuilder {
    //the instance to build
    private ApiListChannelsByChannelListRequest apiListChannelsByChannelListRequest;

    /**
     * Default constructor to initialize the instance
     */
    public ApiListChannelsByChannelListRequestBuilder() {
        apiListChannelsByChannelListRequest = new ApiListChannelsByChannelListRequest();
    }

    public ApiListChannelsByChannelListRequestBuilder id(String id) {
        apiListChannelsByChannelListRequest.setId(id);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public ApiListChannelsByChannelListRequest build() {
        return apiListChannelsByChannelListRequest;
    }
}