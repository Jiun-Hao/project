package com.zhuzhu.project.api.model;

import java.io.Serializable;

public class UserShare implements Serializable {
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
     * 图片路径
     */
    private String shareImgPath;

    /**
     * 用户分享信息
     */
    private String shareMsg;

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
     * @return 图片路径
     */
    public String getShareImgPath() {
        return shareImgPath;
    }

    /**
     * @param shareImgPath 
	 *            图片路径
     */
    public void setShareImgPath(String shareImgPath) {
        this.shareImgPath = shareImgPath;
    }

    /**
     * @return 用户分享信息
     */
    public String getShareMsg() {
        return shareMsg;
    }

    /**
     * @param shareMsg 
	 *            用户分享信息
     */
    public void setShareMsg(String shareMsg) {
        this.shareMsg = shareMsg;
    }
}