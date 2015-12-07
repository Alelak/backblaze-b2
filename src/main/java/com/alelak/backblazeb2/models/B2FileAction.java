package com.alelak.backblazeb2.models;

import java.io.Serializable;

public class B2FileAction implements Serializable {

    private static final long serialVersionUID = -4308202140040830854L;
    private String action;
    private String fileId;
    private String fileName;
    private int size;
    private long uploadTimestamp;

    public B2FileAction() {
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
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

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public long getUploadTimestamp() {
        return uploadTimestamp;
    }

    public void setUploadTimestamp(long uploadTimestamp) {
        this.uploadTimestamp = uploadTimestamp;
    }

    @Override
    public String toString() {
        return "FileAction{" +
                "action='" + action + '\'' +
                ", fileId='" + fileId + '\'' +
                ", fileName='" + fileName + '\'' +
                ", size=" + size +
                ", uploadTimestamp=" + uploadTimestamp +
                '}';
    }
}
