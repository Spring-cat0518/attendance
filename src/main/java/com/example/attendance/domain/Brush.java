package com.example.attendance.domain;

import javax.persistence.*;

public class Brush {
    /**
     * 补刷单id
     */
    @Id
    private Long brusid;

    /**
     * 补刷员工id
     */
    private Long brusemplid;

    /**
     * 审核人id
     */
    private Long brusagentid;

    /**
     * 补刷单状态值 	1、未审核	2、已驳回未通知	3已通过未通知	4、已通知
     */
    private Integer brusflag;

    /**
     * 补刷时间
     */
    private String brustime;

    /**
     * 补刷结果（驳回理由或通过）
     */
    private String brusresult;

    /**
     * 补刷理由
     */
    private String brusreason;

    /**
     * 获取补刷单id
     *
     * @return brusid - 补刷单id
     */
    public Long getBrusid() {
        return brusid;
    }

    /**
     * 设置补刷单id
     *
     * @param brusid 补刷单id
     */
    public void setBrusid(Long brusid) {
        this.brusid = brusid;
    }

    /**
     * 获取补刷员工id
     *
     * @return brusemplid - 补刷员工id
     */
    public Long getBrusemplid() {
        return brusemplid;
    }

    /**
     * 设置补刷员工id
     *
     * @param brusemplid 补刷员工id
     */
    public void setBrusemplid(Long brusemplid) {
        this.brusemplid = brusemplid;
    }

    /**
     * 获取审核人id
     *
     * @return brusagentid - 审核人id
     */
    public Long getBrusagentid() {
        return brusagentid;
    }

    /**
     * 设置审核人id
     *
     * @param brusagentid 审核人id
     */
    public void setBrusagentid(Long brusagentid) {
        this.brusagentid = brusagentid;
    }

    /**
     * 获取补刷单状态值 	1、未审核	2、已驳回未通知	3已通过未通知	4、已通知
     *
     * @return brusflag - 补刷单状态值 	1、未审核	2、已驳回未通知	3已通过未通知	4、已通知
     */
    public Integer getBrusflag() {
        return brusflag;
    }

    /**
     * 设置补刷单状态值 	1、未审核	2、已驳回未通知	3已通过未通知	4、已通知
     *
     * @param brusflag 补刷单状态值 	1、未审核	2、已驳回未通知	3已通过未通知	4、已通知
     */
    public void setBrusflag(Integer brusflag) {
        this.brusflag = brusflag;
    }

    /**
     * 获取补刷时间
     *
     * @return brustime - 补刷时间
     */
    public String getBrustime() {
        return brustime;
    }

    /**
     * 设置补刷时间
     *
     * @param brustime 补刷时间
     */
    public void setBrustime(String brustime) {
        this.brustime = brustime;
    }

    /**
     * 获取补刷结果（驳回理由或通过）
     *
     * @return brusresult - 补刷结果（驳回理由或通过）
     */
    public String getBrusresult() {
        return brusresult;
    }

    /**
     * 设置补刷结果（驳回理由或通过）
     *
     * @param brusresult 补刷结果（驳回理由或通过）
     */
    public void setBrusresult(String brusresult) {
        this.brusresult = brusresult;
    }

    /**
     * 获取补刷理由
     *
     * @return brusreason - 补刷理由
     */
    public String getBrusreason() {
        return brusreason;
    }

    /**
     * 设置补刷理由
     *
     * @param brusreason 补刷理由
     */
    public void setBrusreason(String brusreason) {
        this.brusreason = brusreason;
    }
}