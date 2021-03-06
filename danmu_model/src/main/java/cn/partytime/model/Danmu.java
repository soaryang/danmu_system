package cn.partytime.model;

import cn.partytime.baseModel.BaseModel;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.Date;

/**
 * Created by liuwei on 16/6/12.
 * 弹幕实体
 */
@Document(collection = "danmu")
public class Danmu extends BaseModel{

    @Field("_id")
    private String id;
    private String color;
    private String msg;
    private Boolean isBlocked = false;
    private Integer type = 0;//0普通弹幕；1测试弹幕；
    private Date created = new Date();
    private String danmuPoolId;
    private String userId;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Boolean isBlocked() {
        return isBlocked;
    }

    public void setIsBlocked(Boolean isBlocked) {
        this.isBlocked = isBlocked;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getDanmuPoolId() {
        return danmuPoolId;
    }

    public void setDanmuPoolId(String danmuPoolId) {
        this.danmuPoolId = danmuPoolId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }
}
