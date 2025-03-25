package com.vicky.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CustomerAddress {


    @JsonProperty("firstLine")
    private String firstLine;

    @JsonProperty
            ("postCode")
    private String postCode;

//    public CustomerAddress(String firstLine, String postcode) {
//        this.firstLine = firstLine;
//        this.postCode = postcode;
//    }

    public CustomerAddress() {

    }

    public String getFirstLine() {
        return firstLine;
    }

    public void setFirstLine(String firstLine) {
        this.firstLine = firstLine;
    }

    public String getPostCode() {
        return postCode;
    }

    public void setPostCode(String postCode) {
        this.postCode = postCode;
    }
}
