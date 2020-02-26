package com.example.attendance.domain;

import javax.persistence.*;

public class Company {
    /**
     * 公司id
     */
    @Id
    private Long compid;

    /**
     * 公司名称
     */
    private String compname;

    /**
     * 公司持有人id
     */
    private Long compholderid;

    /**
     * 公司持有人名称
     */
    private String compholdername;

    /**
     * 公司持有人密码
     */
    private String compholderpwd;

    /**
     * 公司持有人电话
     */
    private String compholderphone;

    /**
     * 公司持有人邮箱
     */
    private String compholderemail;

    /**
     * 公司ip地址
     */
    private String compip;

    /**
     * 获取公司id
     *
     * @return compid - 公司id
     */
    public Long getCompid() {
        return compid;
    }

    /**
     * 设置公司id
     *
     * @param compid 公司id
     */
    public void setCompid(Long compid) {
        this.compid = compid;
    }

    /**
     * 获取公司名称
     *
     * @return compname - 公司名称
     */
    public String getCompname() {
        return compname;
    }

    /**
     * 设置公司名称
     *
     * @param compname 公司名称
     */
    public void setCompname(String compname) {
        this.compname = compname;
    }

    /**
     * 获取公司持有人id
     *
     * @return compholderid - 公司持有人id
     */
    public Long getCompholderid() {
        return compholderid;
    }

    /**
     * 设置公司持有人id
     *
     * @param compholderid 公司持有人id
     */
    public void setCompholderid(Long compholderid) {
        this.compholderid = compholderid;
    }

    /**
     * 获取公司持有人名称
     *
     * @return compholdername - 公司持有人名称
     */
    public String getCompholdername() {
        return compholdername;
    }

    /**
     * 设置公司持有人名称
     *
     * @param compholdername 公司持有人名称
     */
    public void setCompholdername(String compholdername) {
        this.compholdername = compholdername;
    }

    /**
     * 获取公司持有人密码
     *
     * @return compholderpwd - 公司持有人密码
     */
    public String getCompholderpwd() {
        return compholderpwd;
    }

    /**
     * 设置公司持有人密码
     *
     * @param compholderpwd 公司持有人密码
     */
    public void setCompholderpwd(String compholderpwd) {
        this.compholderpwd = compholderpwd;
    }

    /**
     * 获取公司持有人电话
     *
     * @return compholderphone - 公司持有人电话
     */
    public String getCompholderphone() {
        return compholderphone;
    }

    /**
     * 设置公司持有人电话
     *
     * @param compholderphone 公司持有人电话
     */
    public void setCompholderphone(String compholderphone) {
        this.compholderphone = compholderphone;
    }

    /**
     * 获取公司持有人邮箱
     *
     * @return compholderemail - 公司持有人邮箱
     */
    public String getCompholderemail() {
        return compholderemail;
    }

    /**
     * 设置公司持有人邮箱
     *
     * @param compholderemail 公司持有人邮箱
     */
    public void setCompholderemail(String compholderemail) {
        this.compholderemail = compholderemail;
    }

    /**
     * 获取公司ip地址
     *
     * @return compip - 公司ip地址
     */
    public String getCompip() {
        return compip;
    }

    /**
     * 设置公司ip地址
     *
     * @param compip 公司ip地址
     */
    public void setCompip(String compip) {
        this.compip = compip;
    }
}