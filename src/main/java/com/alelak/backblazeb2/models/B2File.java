package com.alelak.backblazeb2.models;

import java.io.Serializable;

public class B2File implements Serializable {

    private static final long serialVersionUID = -8395396892792791831L;
    private String accountId;
    private String bucketId;
    private long contentLength;
    private String contentSha1;
    private String contentType;
    private String fileId;
    private String fileName;


    public B2File() {
    }

    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public String getBucketId() {
        return bucketId;
    }

    public void setBucketId(String bucketId) {
        this.bucketId = bucketId;
    }

    public long getContentLength() {
        return contentLength;
    }

    public void setContentLength(long contentLength) {
        this.contentLength = contentLength;
    }

    public String getContentSha1() {
        return contentSha1;
    }

    public void setContentSha1(String contentSha1) {
        this.contentSha1 = contentSha1;
    }

    public String getContentType() {
        return contentType;
    }

    public void setContentType(String contentType) {
        this.contentType = contentType;
    }

    public String getFileId() {
        return fileId;
    }

    public void setFileId(String fileId) {
        this.fileId = fileId;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public String toString() {
        return "B2File{" +
                "accountId='" + accountId + '\'' +
                ", bucketId='" + bucketId + '\'' +
                ", contentLength=" + contentLength +
                ", contentSha1='" + contentSha1 + '\'' +
                ", contentType='" + contentType + '\'' +
                ", fileId='" + fileId + '\'' +
                ", fileName='" + fileName + '\'' +
                '}';
    }
}
