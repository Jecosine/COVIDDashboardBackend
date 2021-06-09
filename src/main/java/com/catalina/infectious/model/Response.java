package com.catalina.infectious.model;

import lombok.Data;

import java.io.Serializable;

@Data
public class Response<T> implements Serializable {
    public Integer status;
    public String message;
    public T data;
}
