package com.alelak.backblazeb2.models;

import java.io.Serializable;

public class B2Bucket implements Serializable {

    private static final long serialVersionUID = -8264301196020328759L;
    private String bucketId;
    private String accountId;
    private String bucketName;
    private String bucketType;


    public B2Bucket() {
    }

    public String getBucketId() {
        return bucketId;
    }

    public void setBucketId(String bucketId) {
        this.bucketId = bucketId;
    }

    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public String getBucketName() {
        return bucketName;
    }

    public void setBucketName(String bucketName) {
        this.bucketName = bucketName;
    }

    public String getBucketType() {
        return bucketType;
    }

    public void setBucketType(String bucketType) {
        this.bucketType = bucketType;
    }

    @Override
    public String toString() {
        return "B2Bucket{" +
                "bucketId='" + bucketId + '\'' +
                ", accountId='" + accountId + '\'' +
                ", bucketName='" + bucketName + '\'' +
                ", bucketType='" + bucketType + '\'' +
                '}';
    }
}
