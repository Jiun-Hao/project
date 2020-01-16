package com.zhuzhu.project.api.model;

import java.io.Serializable;

public class User implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * uuid
     */
    private Integer uuid;

    /**
     * 用户账号
     */
    private String userSerialId;

    /**
     * 用户密码
     */
    private String userPassword;

    /**
     * @return uuid
     */
    public Integer getUuid() {
        return uuid;
    }

    /**
     * @param uuid 
	 *            uuid
     */
    public void setUuid(Integer uuid) {
        this.uuid = uuid;
    }

    /**
     * @return 用户账号
     */
    public String getUserSerialId() {
        return userSerialId;
    }

    /**
     * @param userSerialId 
	 *            用户账号
     */
    public void setUserSerialId(String userSerialId) {
        this.userSerialId = userSerialId;
    }

    /**
     * @return 用户密码
     */
    public String getUserPassword() {
        return userPassword;
    }

    /**
     * @param userPassword 
	 *            用户密码
     */
    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }
}