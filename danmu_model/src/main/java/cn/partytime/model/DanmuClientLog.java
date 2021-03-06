package cn.partytime.model;

import cn.partytime.baseModel.BaseModel;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.Date;

/**
 * Created by liuwei on 16/6/12.
 * 弹幕客户端日志
 */
@Document(collection = "danmu_client_log")
public class DanmuClientLog extends BaseModel{

    @Field("_id")
    private String id;

    private Date createTime;

    private Date logTime;

    private String log;

    private String danmuClientCode;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getLogTime() {
        return logTime;
    }

    public void setLogTime(Date logTime) {
        this.logTime = logTime;
    }

    public String getLog() {
        return log;
    }

    public void setLog(String log) {
        this.log = log;
    }

    public String getDanmuClientCode() {
        return danmuClientCode;
    }

    public void setDanmuClientCode(String danmuClientCode) {
        this.danmuClientCode = danmuClientCode;
    }
}
