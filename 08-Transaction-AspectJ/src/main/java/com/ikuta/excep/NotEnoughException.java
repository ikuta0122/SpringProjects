package com.ikuta.excep;

/**
 * 自定义的运行时异常
 */
public class NotEnoughException extends RuntimeException {
    private static final long serialVersionUID = 1L;

    public NotEnoughException() {
        super();
    }

    public NotEnoughException(String message) {
        super(message);
    }
}