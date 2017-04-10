
package com.ardic.example.kafka.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ArcloudMessage {

    @SerializedName("body")
    @Expose
    private Body body;
    @SerializedName("header")
    @Expose
    private Header header;

    public Body getBody() {
        return body;
    }

    public void setBody(Body body) {
        this.body = body;
    }

    public Header getHeader() {
        return header;
    }

    public void setHeader(Header header) {
        this.header = header;
    }



}
