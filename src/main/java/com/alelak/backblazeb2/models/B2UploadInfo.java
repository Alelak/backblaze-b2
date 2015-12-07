package com.alelak.backblazeb2.models;

import java.io.Serializable;

public class B2UploadInfo implements Serializable {
    private static final long serialVersionUID = -5825416906484155719L;
    private String bucketId;
    private String uploadUrl;
    private String authorizationToken;

    public B2UploadInfo() {

    }

    public String getBucketId() {
        return bucketId;
    }

    public void setBucketId(String bucketId) {
        this.bucketId = bucketId;
    }

    public String getUploadUrl() {
        return uploadUrl;
    }

    public void setUploadUrl(String uploadUrl) {
        this.uploadUrl = uploadUrl;
    }

    public String getAuthorizationToken() {
        return authorizationToken;
    }

    public void setAuthorizationToken(String authorizationToken) {
        this.authorizationToken = authorizationToken;
    }

    @Override
    public String toString() {
        return "B2UploadInfo{" +
                "bucketId='" + bucketId + '\'' +
                ", uploadUrl='" + uploadUrl + '\'' +
                ", authorizationToken='" + authorizationToken + '\'' +
                '}';
    }
}
