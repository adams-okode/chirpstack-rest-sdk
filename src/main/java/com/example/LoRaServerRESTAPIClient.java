/*
 * LoRaServerRESTAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.example;

import com.example.controllers.*;
import com.example.http.client.HttpClient;

public class LoRaServerRESTAPIClient {
    /**
     * Singleton access to Application controller
     * @return	Returns the ApplicationController instance 
     */
    public ApplicationController getApplication() {
        return ApplicationController.getInstance();
    }

    /**
     * Singleton access to Channel controller
     * @return	Returns the ChannelController instance 
     */
    public ChannelController getChannel() {
        return ChannelController.getInstance();
    }

    /**
     * Singleton access to ChannelList controller
     * @return	Returns the ChannelListController instance 
     */
    public ChannelListController getChannelList() {
        return ChannelListController.getInstance();
    }

    /**
     * Singleton access to Node controller
     * @return	Returns the NodeController instance 
     */
    public NodeController getNode() {
        return NodeController.getInstance();
    }

    /**
     * Singleton access to NodeSession controller
     * @return	Returns the NodeSessionController instance 
     */
    public NodeSessionController getNodeSession() {
        return NodeSessionController.getInstance();
    }

    /**
     * Get the shared http client currently being used for API calls
     * @return The http client instance currently being used
     */
    public HttpClient getSharedHttpClient() {
        return BaseController.getClientInstance();
    }
    
    /**
     * Set a shared http client to be used for API calls
     * @param httpClient The http client to use
     */
    public void setSharedHttpClient(HttpClient httpClient) {
        BaseController.setClientInstance(httpClient);
    }

    /**
     * Default constructor 
     */     
    public LoRaServerRESTAPIClient() {	
	}

}