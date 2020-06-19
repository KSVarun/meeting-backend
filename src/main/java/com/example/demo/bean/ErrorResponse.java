package com.example.demo.bean;

public class ErrorResponse {
    private String url;
    private String errMsg;
    private String eventId;

    public ErrorResponse() {
    }

    public ErrorResponse(String url, String errMsg, String eventId) {
        this.url = url;
        this.errMsg = errMsg;
        this.eventId = eventId;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getErrMsg() {
        return errMsg;
    }

    public void setErrMsg(String errMsg) {
        this.errMsg = errMsg;
    }

    public String getEventId() {
        return eventId;
    }

    public void setEventId(String eventId) {
        this.eventId = eventId;
    }

    @Override
    public String toString() {
        return "ErrorResponse{" +
                "url='" + url + '\'' +
                ", errMsg='" + errMsg + '\'' +
                ", eventId='" + eventId + '\'' +
                '}';
    }
}
