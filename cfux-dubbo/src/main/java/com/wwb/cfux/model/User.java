package com.wwb.cfux.model;

import lombok.Data;

import java.io.Serializable;

@Data
public class User implements Serializable {

    private Long id;

    private String phone;

    private String userName;

    private Integer age;

}
