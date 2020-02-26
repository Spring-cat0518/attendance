package com.example.attendance.domain;

import java.util.Date;
import javax.persistence.*;

public class Clock {
    /**
     * 打卡id
     */
    @Id
    private Long clocid;

    /**
     * 员工id
     */
    private Long clocemplid;

    /**
     * 打卡时间
     */
    private Date cloctime;

    /**
     * 获取打卡id
     *
     * @return clocid - 打卡id
     */
    public Long getClocid() {
        return clocid;
    }

    /**
     * 设置打卡id
     *
     * @param clocid 打卡id
     */
    public void setClocid(Long clocid) {
        this.clocid = clocid;
    }

    /**
     * 获取员工id
     *
     * @return clocemplid - 员工id
     */
    public Long getClocemplid() {
        return clocemplid;
    }

    /**
     * 设置员工id
     *
     * @param clocemplid 员工id
     */
    public void setClocemplid(Long clocemplid) {
        this.clocemplid = clocemplid;
    }

    /**
     * 获取打卡时间
     *
     * @return cloctime - 打卡时间
     */
    public Date getCloctime() {
        return cloctime;
    }

    /**
     * 设置打卡时间
     *
     * @param cloctime 打卡时间
     */
    public void setCloctime(Date cloctime) {
        this.cloctime = cloctime;
    }
}