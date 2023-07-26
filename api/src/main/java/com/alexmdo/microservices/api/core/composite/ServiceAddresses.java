package com.alexmdo.microservices.api.core.composite;

public class ServiceAddresses {

    private final String cmp;
    private final String pro;
    private final String rec;
    private final String rev;

    public ServiceAddresses() {
        cmp = null;
        pro = null;
        rec = null;
        rev = null;
    }

    public ServiceAddresses(String compositeAddress, String productAddress, String recommendationAddress, String reviewAddress) {
        this.cmp = compositeAddress;
        this.pro = productAddress;
        this.rec = recommendationAddress;
        this.rev = reviewAddress;
    }

    public String getCmp() {
        return cmp;
    }

    public String getPro() {
        return pro;
    }

    public String getRec() {
        return rec;
    }

    public String getRev() {
        return rev;
    }

}
