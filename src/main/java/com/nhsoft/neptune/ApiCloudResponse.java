package com.nhsoft.neptune;

import lombok.Data;

import java.io.Serializable;

/**
 * @auther nhsoft.yex
 */
@Data
public class ApiCloudResponse<T> implements Serializable {

    private Integer code;

    private String msg;

    private T result;

    public Boolean isSuccess() {
        return code == 0;
    }
}
