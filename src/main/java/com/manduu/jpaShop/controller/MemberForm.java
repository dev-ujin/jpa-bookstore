package com.manduu.jpaShop.controller;

import com.sun.istack.NotNull;
import jdk.jfr.Name;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class MemberForm {

    @NotNull
    private String name;

    private String city;
    private String street;
    private String zipcode;
}
