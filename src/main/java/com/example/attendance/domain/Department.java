package com.example.attendance.domain;

import javax.persistence.*;

public class Department {
    /**
     * 部门id
     */
    @Id
    private Long depaid;

    /**
     * 部门名称
     */
    private String depaname;

    /**
     * 部门所属公司
     */
    private Long depacompanyid;

    /**
     * 获取部门id
     *
     * @return depaid - 部门id
     */
    public Long getDepaid() {
        return depaid;
    }

    /**
     * 设置部门id
     *
     * @param depaid 部门id
     */
    public void setDepaid(Long depaid) {
        this.depaid = depaid;
    }

    /**
     * 获取部门名称
     *
     * @return depaname - 部门名称
     */
    public String getDepaname() {
        return depaname;
    }

    /**
     * 设置部门名称
     *
     * @param depaname 部门名称
     */
    public void setDepaname(String depaname) {
        this.depaname = depaname;
    }

    /**
     * 获取部门所属公司
     *
     * @return depacompanyid - 部门所属公司
     */
    public Long getDepacompanyid() {
        return depacompanyid;
    }

    /**
     * 设置部门所属公司
     *
     * @param depacompanyid 部门所属公司
     */
    public void setDepacompanyid(Long depacompanyid) {
        this.depacompanyid = depacompanyid;
    }
}