package com.gethin.wang.domain.enums;

/**
 * @author huangsy
 * @date 2018/7/30 17:42
 */
public enum UserSexEnum {
    /**
     * man
     */
    MAN(0, "man"),
    /**
     * woman
     */
    WOMAN(1, "woman");

    private int dbNumber;
    private String name;

    private UserSexEnum(int dbNumber, String name) {
        this.dbNumber = dbNumber;
        this.name = name;
    }


    public int getDbNumber() {
        return dbNumber;
    }

    public String getName() {
        return name;
    }
}
