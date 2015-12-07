package com.alelak.backblazeb2.models;

import java.io.Serializable;
import java.util.List;

public class B2BucketsResponse implements Serializable {
    private static final long serialVersionUID = -6156439840973228038L;
    private List<B2Bucket> buckets;

    public List<B2Bucket> getBuckets() {
        return buckets;
    }

    public void setBuckets(List<B2Bucket> buckets) {
        this.buckets = buckets;
    }

    public B2BucketsResponse() {
    }

    @Override
    public String toString() {
        return "B2BucketsResponse{" +
                "buckets=" + buckets +
                '}';
    }
}
