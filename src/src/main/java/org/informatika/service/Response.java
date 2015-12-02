package org.informatika.service;

/**
 * Created by edmundophie on 12/1/15.
 */
public class Response<T> {
    private boolean success;
    private T returnValue;

    public Response() {
    }

    public Response(boolean success) {
        this.success = success;
    }

    public Response(boolean success, T returnValue) {
        this.success = success;
        this.returnValue = returnValue;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public T getReturnValue() {
        return returnValue;
    }

    public void setReturnValue(T returnValue) {
        this.returnValue = returnValue;
    }
}
