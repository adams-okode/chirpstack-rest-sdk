/*
 * LoRaServerRESTAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.example.models;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

public enum ApiRXWindowEnum {
    RX1, //TODO: Write general description for this element
    RX2; //TODO: Write general description for this element

    private static TreeMap<String, ApiRXWindowEnum> valueMap = new TreeMap<String, ApiRXWindowEnum>();
    private String value;

    static {
        RX1.value = "RX1";
        RX2.value = "RX2";

        valueMap.put("RX1", RX1);
        valueMap.put("RX2", RX2);
    }

    /**
     * Returns the enum member associated with the given string value
     * @return The enum member against the given string value */
    @com.fasterxml.jackson.annotation.JsonCreator
    public static ApiRXWindowEnum fromString(String toConvert) {
        return valueMap.get(toConvert);
    }

    /**
     * Returns the string value associated with the enum member
     * @return The string value against enum member */
    @com.fasterxml.jackson.annotation.JsonValue
    public String value() {
        return value;
    }
        
    /**
     * Get string representation of this enum
     */
    @Override
    public String toString() {
        return value.toString();
    }

    /**
     * Convert list of ApiRXWindowEnum values to list of string values
     * @param toConvert The list of ApiRXWindowEnum values to convert
     * @return List of representative string values */
    public static List<String> toValue(List<ApiRXWindowEnum> toConvert) {
        if(toConvert == null)
            return null;
        List<String> convertedValues = new ArrayList<String>();
        for (ApiRXWindowEnum enumValue : toConvert) {
            convertedValues.add(enumValue.value);
        }
        return convertedValues;
    }
} 