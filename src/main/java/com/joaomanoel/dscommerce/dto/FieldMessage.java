package com.joaomanoel.dscommerce.dto;

public class FieldMessage {

    private String fieldName;

    private String message;

    public FieldMessage(String fielName, String message) {
        this.fieldName = fielName;
        this.message = message;
    }

    public String getFieldName() {
        return fieldName;
    }

    public String getMessage() {
        return message;
    }
}
