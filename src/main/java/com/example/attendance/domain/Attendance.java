package com.example.attendance.domain;

import java.util.Date;
import javax.persistence.*;

public class Attendance {
    /**
     * 考勤id
     */
    @Id
    private Long atteid;

    /**
     * 公司id
     */
    private Long attecompanyid;

    /**
     * 员工id
     */
    private Long atteemplid;

    /**
     * 日期
     */
    private Date attedate;

    /**
     * 当天考勤1
     */
    private Date atteone;

    /**
     * 当天考勤2
     */
    private Date attetwo;

    /**
     * 是否节假日
     */
    private Boolean atteflag;

    /**
     * 员工状态	1、正常出勤	2、迟到	4、早退	8、上午旷工     16、下午旷工	32、请假

     */
    private Byte attestate;

    /**
     * 迟到时间（分钟）
     */
    private String attelatetime;

    /**
     * 早退时间（分钟
     */
    private String atteendtime;

    /**
     * 获取考勤id
     *
     * @return atteid - 考勤id
     */
    public Long getAtteid() {
        return atteid;
    }

    /**
     * 设置考勤id
     *
     * @param atteid 考勤id
     */
    public void setAtteid(Long atteid) {
        this.atteid = atteid;
    }

    /**
     * 获取公司id
     *
     * @return attecompanyid - 公司id
     */
    public Long getAttecompanyid() {
        return attecompanyid;
    }

    /**
     * 设置公司id
     *
     * @param attecompanyid 公司id
     */
    public void setAttecompanyid(Long attecompanyid) {
        this.attecompanyid = attecompanyid;
    }

    /**
     * 获取员工id
     *
     * @return atteemplid - 员工id
     */
    public Long getAtteemplid() {
        return atteemplid;
    }

    /**
     * 设置员工id
     *
     * @param atteemplid 员工id
     */
    public void setAtteemplid(Long atteemplid) {
        this.atteemplid = atteemplid;
    }

    /**
     * 获取日期
     *
     * @return attedate - 日期
     */
    public Date getAttedate() {
        return attedate;
    }

    /**
     * 设置日期
     *
     * @param attedate 日期
     */
    public void setAttedate(Date attedate) {
        this.attedate = attedate;
    }

    /**
     * 获取当天考勤1
     *
     * @return atteone - 当天考勤1
     */
    public Date getAtteone() {
        return atteone;
    }

    /**
     * 设置当天考勤1
     *
     * @param atteone 当天考勤1
     */
    public void setAtteone(Date atteone) {
        this.atteone = atteone;
    }

    /**
     * 获取当天考勤2
     *
     * @return attetwo - 当天考勤2
     */
    public Date getAttetwo() {
        return attetwo;
    }

    /**
     * 设置当天考勤2
     *
     * @param attetwo 当天考勤2
     */
    public void setAttetwo(Date attetwo) {
        this.attetwo = attetwo;
    }

    /**
     * 获取是否节假日
     *
     * @return atteflag - 是否节假日
     */
    public Boolean getAtteflag() {
        return atteflag;
    }

    /**
     * 设置是否节假日
     *
     * @param atteflag 是否节假日
     */
    public void setAtteflag(Boolean atteflag) {
        this.atteflag = atteflag;
    }

    /**
     * 获取员工状态	1、正常出勤	2、迟到	4、早退	8、上午旷工     16、下午旷工	32、请假

     *
     * @return attestate - 员工状态	1、正常出勤	2、迟到	4、早退	8、上午旷工     16、下午旷工	32、请假

     */
    public Byte getAttestate() {
        return attestate;
    }

    /**
     * 设置员工状态	1、正常出勤	2、迟到	4、早退	8、上午旷工     16、下午旷工	32、请假

     *
     * @param attestate 员工状态	1、正常出勤	2、迟到	4、早退	8、上午旷工     16、下午旷工	32、请假

     */
    public void setAttestate(Byte attestate) {
        this.attestate = attestate;
    }

    /**
     * 获取迟到时间（分钟）
     *
     * @return attelatetime - 迟到时间（分钟）
     */
    public String getAttelatetime() {
        return attelatetime;
    }

    /**
     * 设置迟到时间（分钟）
     *
     * @param attelatetime 迟到时间（分钟）
     */
    public void setAttelatetime(String attelatetime) {
        this.attelatetime = attelatetime;
    }

    /**
     * 获取早退时间（分钟
     *
     * @return atteendtime - 早退时间（分钟
     */
    public String getAtteendtime() {
        return atteendtime;
    }

    /**
     * 设置早退时间（分钟
     *
     * @param atteendtime 早退时间（分钟
     */
    public void setAtteendtime(String atteendtime) {
        this.atteendtime = atteendtime;
    }
}