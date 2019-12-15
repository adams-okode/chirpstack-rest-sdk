/*
 * LoRaServerRESTAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.example.models;

import java.util.*;

public class ApiCreateChannelRequestBuilder {
    //the instance to build
    private ApiCreateChannelRequest apiCreateChannelRequest;

    /**
     * Default constructor to initialize the instance
     */
    public ApiCreateChannelRequestBuilder() {
        apiCreateChannelRequest = new ApiCreateChannelRequest();
    }

    public ApiCreateChannelRequestBuilder channel(String channel) {
        apiCreateChannelRequest.setChannel(channel);
        return this;
    }

    public ApiCreateChannelRequestBuilder channelListID(String channelListID) {
        apiCreateChannelRequest.setChannelListID(channelListID);
        return this;
    }

    public ApiCreateChannelRequestBuilder frequency(String frequency) {
        apiCreateChannelRequest.setFrequency(frequency);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public ApiCreateChannelRequest build() {
        return apiCreateChannelRequest;
    }
}