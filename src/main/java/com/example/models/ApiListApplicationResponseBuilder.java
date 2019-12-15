/*
 * LoRaServerRESTAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.example.models;

import java.util.*;

public class ApiListApplicationResponseBuilder {
    //the instance to build
    private ApiListApplicationResponse apiListApplicationResponse;

    /**
     * Default constructor to initialize the instance
     */
    public ApiListApplicationResponseBuilder() {
        apiListApplicationResponse = new ApiListApplicationResponse();
    }

    public ApiListApplicationResponseBuilder result(List<ApiGetApplicationResponse> result) {
        apiListApplicationResponse.setResult(result);
        return this;
    }

    /**
     * total number of applications
     */
    public ApiListApplicationResponseBuilder totalCount(String totalCount) {
        apiListApplicationResponse.setTotalCount(totalCount);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public ApiListApplicationResponse build() {
        return apiListApplicationResponse;
    }
}