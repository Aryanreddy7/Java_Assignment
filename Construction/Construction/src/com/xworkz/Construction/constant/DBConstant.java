package com.xworkz.Construction.constant;

public enum DBConstant {

        URL("jdbc:mysql://localhost:3306/Construction_database"),
        USERNAME("root"),
        PASSWORD("Aryan@2003");

    private String value;

    private DBConstant(String value){
        this.value=value;

    }

    public String getValue() {
        return value;
    }
}
