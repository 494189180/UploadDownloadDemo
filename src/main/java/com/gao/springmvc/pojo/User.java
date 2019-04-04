package com.gao.springmvc.pojo;



import org.springframework.web.multipart.MultipartFile;

import java.io.Serializable;

/**
 * 用户实体类
 */
public class User implements Serializable {

    private String userName;
    /**
     * 上传文件会自动绑定到该属性
     */
    private MultipartFile headimage;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public MultipartFile getHeadimage() {
        return headimage;
    }

    public void setHeadimage(MultipartFile headimage) {
        this.headimage = headimage;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("User{");
        sb.append("userName='").append(userName).append('\'');
        sb.append(", headimage=").append(headimage);
        sb.append('}');
        return sb.toString();
    }
}
