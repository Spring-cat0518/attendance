package com.example.attendance.domain;

import javax.persistence.*;

public class Employee {
    /**
     * 员工id
     */
    @Id
    private Long emplid;

    /**
     * 所属公司id
     */
    private Long emplcompanyid;

    /**
     * 所属部门id
     */
    private Long empldepartid;

    /**
     * 员工密码
     */
    private String emplpassword;

    /**
     * 手机号码
     */
    private String emplphone;

    /**
     * 代理人id
     */
    private Long emplagentid;

    /**
     * 获取员工id
     *
     * @return emplid - 员工id
     */
    public Long getEmplid() {
        return emplid;
    }

    /**
     * 设置员工id
     *
     * @param emplid 员工id
     */
    public void setEmplid(Long emplid) {
        this.emplid = emplid;
    }

    /**
     * 获取所属公司id
     *
     * @return emplcompanyid - 所属公司id
     */
    public Long getEmplcompanyid() {
        return emplcompanyid;
    }

    /**
     * 设置所属公司id
     *
     * @param emplcompanyid 所属公司id
     */
    public void setEmplcompanyid(Long emplcompanyid) {
        this.emplcompanyid = emplcompanyid;
    }

    /**
     * 获取所属部门id
     *
     * @return empldepartid - 所属部门id
     */
    public Long getEmpldepartid() {
        return empldepartid;
    }

    /**
     * 设置所属部门id
     *
     * @param empldepartid 所属部门id
     */
    public void setEmpldepartid(Long empldepartid) {
        this.empldepartid = empldepartid;
    }

    /**
     * 获取员工密码
     *
     * @return emplpassword - 员工密码
     */
    public String getEmplpassword() {
        return emplpassword;
    }

    /**
     * 设置员工密码
     *
     * @param emplpassword 员工密码
     */
    public void setEmplpassword(String emplpassword) {
        this.emplpassword = emplpassword;
    }

    /**
     * 获取手机号码
     *
     * @return emplphone - 手机号码
     */
    public String getEmplphone() {
        return emplphone;
    }

    /**
     * 设置手机号码
     *
     * @param emplphone 手机号码
     */
    public void setEmplphone(String emplphone) {
        this.emplphone = emplphone;
    }

    /**
     * 获取代理人id
     *
     * @return emplagentid - 代理人id
     */
    public Long getEmplagentid() {
        return emplagentid;
    }

    /**
     * 设置代理人id
     *
     * @param emplagentid 代理人id
     */
    public void setEmplagentid(Long emplagentid) {
        this.emplagentid = emplagentid;
    }
}