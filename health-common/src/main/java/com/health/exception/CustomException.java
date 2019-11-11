package com.health.exception;

/**
 * 自定义异常
 */
public class CustomException extends RuntimeException {

    // 异常消息
    private String message;

    //有参构造
    public CustomException(String message) {
        super(message);
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
