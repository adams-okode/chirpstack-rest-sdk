/*
 * LoRaServerRESTAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.example.models;

import java.util.*;

public class ApiGetApplicationRequestBuilder {
    //the instance to build
    private ApiGetApplicationRequest apiGetApplicationRequest;

    /**
     * Default constructor to initialize the instance
     */
    public ApiGetApplicationRequestBuilder() {
        apiGetApplicationRequest = new ApiGetApplicationRequest();
    }

    /**
     * hex encoded AppEUI
     */
    public ApiGetApplicationRequestBuilder appEUI(String appEUI) {
        apiGetApplicationRequest.setAppEUI(appEUI);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public ApiGetApplicationRequest build() {
        return apiGetApplicationRequest;
    }
}