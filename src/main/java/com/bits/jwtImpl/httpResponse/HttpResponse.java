package com.bits.jwtImpl.httpResponse;

import org.springframework.http.HttpStatus;

public class HttpResponse {
    public int statusCode;
    public HttpStatus httpStatus;
    public String reason;
    public String message;

    public HttpResponse(int statusCode, HttpStatus httpStatus, String reason, String message) {
        this.statusCode = statusCode;
        this.httpStatus = httpStatus;
        this.reason = reason;
        this.message = message;
    }

    public void setHttpStatus(HttpStatus httpStatus) {
        this.httpStatus = httpStatus;
    }

    public HttpStatus getHttpStatus() {
        return httpStatus;
    }

    public int getStatusCode() {
        return statusCode;
    }

    public String getReason() {
        return reason;
    }

    public String getMessage() {
        return message;
    }

    public void setStatusCode(int statusCode) {
        this.statusCode = statusCode;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "HttpResponse{" +
                "statusCode=" + statusCode +
                ", httpStatus=" + httpStatus +
                ", reason='" + reason + '\'' +
                ", message='" + message + '\'' +
                '}';
    }

    public HttpResponse() {
    }
}
