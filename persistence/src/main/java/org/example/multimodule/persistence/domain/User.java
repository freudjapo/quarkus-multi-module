package org.example.multimodule.persistence.domain;

import java.util.Date;
import javax.annotation.Generated;

public class User {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-03-09T22:27:21.306538+08:00", comments="Source field: user.id")
    private Integer id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-03-09T22:27:21.311255+08:00", comments="Source field: user.nickname")
    private String nickname;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-03-09T22:27:21.311507+08:00", comments="Source field: user.create_time")
    private Date createTime;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-03-09T22:27:21.311777+08:00", comments="Source field: user.update_time")
    private Date updateTime;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-03-09T22:27:21.31053+08:00", comments="Source field: user.id")
    public Integer getId() {
        return id;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-03-09T22:27:21.311153+08:00", comments="Source field: user.id")
    public void setId(Integer id) {
        this.id = id;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-03-09T22:27:21.311333+08:00", comments="Source field: user.nickname")
    public String getNickname() {
        return nickname;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-03-09T22:27:21.311439+08:00", comments="Source field: user.nickname")
    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-03-09T22:27:21.3116+08:00", comments="Source field: user.create_time")
    public Date getCreateTime() {
        return createTime;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-03-09T22:27:21.311678+08:00", comments="Source field: user.create_time")
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-03-09T22:27:21.311852+08:00", comments="Source field: user.update_time")
    public Date getUpdateTime() {
        return updateTime;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-03-09T22:27:21.311926+08:00", comments="Source field: user.update_time")
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}