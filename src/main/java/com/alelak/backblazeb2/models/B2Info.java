package com.alelak.backblazeb2.models;

import java.io.Serializable;

public class B2Info implements Serializable {

    private static final long serialVersionUID = -1572042017568687099L;
    private String accountId;
    private String apiUrl;
    private String authorizationToken;
    private String downloadUrl;

    public B2Info() {

    }

    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public String getApiUrl() {
        return apiUrl;
    }

    public void setApiUrl(String apiUrl) {
        this.apiUrl = apiUrl;
    }

    public String getAuthorizationToken() {
        return authorizationToken;
    }

    public void setAuthorizationToken(String authorizationToken) {
        this.authorizationToken = authorizationToken;
    }

    public String getDownloadUrl() {
        return downloadUrl;
    }

    public void setDownloadUrl(String downloadUrl) {
        this.downloadUrl = downloadUrl;
    }

    @Override
    public String toString() {
        return "B2Info{" +
                "accountId='" + accountId + '\'' +
                ", apiUrl='" + apiUrl + '\'' +
                ", authorizationToken='" + authorizationToken + '\'' +
                ", downloadUrl='" + downloadUrl + '\'' +
                '}';
    }
}
