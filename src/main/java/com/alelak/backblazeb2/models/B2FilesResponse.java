package com.alelak.backblazeb2.models;

import java.io.Serializable;
import java.util.List;

public class B2FilesResponse implements Serializable {
    private static final long serialVersionUID = 5893571445251044947L;
    private List<B2FileAction> files;
    private String nextFileName;
    private String nextFileId;

    public B2FilesResponse() {

    }

    public List<B2FileAction> getFiles() {
        return files;
    }

    public void setFiles(List<B2FileAction> files) {
        this.files = files;
    }

    public String getNextFileName() {
        return nextFileName;
    }

    public void setNextFileName(String nextFileName) {
        this.nextFileName = nextFileName;
    }

    public String getNextFileId() {
        return nextFileId;
    }

    public void setNextFileId(String nextFileId) {
        this.nextFileId = nextFileId;
    }

    @Override
    public String toString() {
        return "B2FilesResponse{" +
                "files=" + files +
                ", nextFileName='" + nextFileName + '\'' +
                ", nextFileId='" + nextFileId + '\'' +
                '}';
    }
}


