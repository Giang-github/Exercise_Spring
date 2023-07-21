package com.devone.springpost.model.enums;

import lombok.Getter;

@Getter
public enum AuthorityType {


    USER("Author"),
    ADMIN("Admin");

    private String type;

    AuthorityType(String type) {
        this.type = type;
    }
}
