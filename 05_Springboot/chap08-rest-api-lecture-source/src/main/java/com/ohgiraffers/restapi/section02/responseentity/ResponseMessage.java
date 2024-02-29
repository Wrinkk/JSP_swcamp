package com.ohgiraffers.restapi.section02.responseentity;

import java.util.Map;

public class ResponseMessage {
    private int httpStatusCode;             // 응답 상태코드

    private String message;                 // 응답 메시지
    private Map<String, Object> result;     // 응답 데이터

    public ResponseMessage(int httpStatusCode, String message, Map<String, Object> result) {
        this.httpStatusCode = httpStatusCode;
        this.message = message;
        this.result = result;
    }

    public ResponseMessage() {
    }

    public int getHttpStatusCode() {
        return httpStatusCode;
    }

    public void setHttpStatusCode(int httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Map<String, Object> getResult() {
        return result;
    }

    public void setResult(Map<String, Object> result) {
        this.result = result;
    }
}
