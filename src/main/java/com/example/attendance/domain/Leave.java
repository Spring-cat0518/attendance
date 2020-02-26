package com.example.attendance.domain;

import java.util.Date;
import javax.persistence.*;

public class Leave {
    /**
     * 请假单id
     */
    @Id
    private Long leavid;

    /**
     * 请假员工id
     */
    private Long leavemplid;

    /**
     * 审核人id
     */
    private Long leavagentid;

    /**
     * 请假单单状态值	1、未审核	2、已驳回未通知	
3已通过未通知	4、已通知

     */
    private Integer leavflag;

    /**
     * 请假类型	1、年假	2、事假	3、病假	4、婚假	5、丧假	6.调休假	7、工伤假	8、陪产假	9、产检假	10、产假


     */
    private Integer leavtype;

    /**
     * 请假理由
     */
    private String leavreason;

    /**
     * 请假结果（驳回理由或通过）
     */
    private String leavresult;

    /**
     * 请假开始时间
     */
    private Date leavstart;

    /**
     * 请假结束时间
     */
    private Date leavend;

    /**
     * 获取请假单id
     *
     * @return leavid - 请假单id
     */
    public Long getLeavid() {
        return leavid;
    }

    /**
     * 设置请假单id
     *
     * @param leavid 请假单id
     */
    public void setLeavid(Long leavid) {
        this.leavid = leavid;
    }

    /**
     * 获取请假员工id
     *
     * @return leavemplid - 请假员工id
     */
    public Long getLeavemplid() {
        return leavemplid;
    }

    /**
     * 设置请假员工id
     *
     * @param leavemplid 请假员工id
     */
    public void setLeavemplid(Long leavemplid) {
        this.leavemplid = leavemplid;
    }

    /**
     * 获取审核人id
     *
     * @return leavagentid - 审核人id
     */
    public Long getLeavagentid() {
        return leavagentid;
    }

    /**
     * 设置审核人id
     *
     * @param leavagentid 审核人id
     */
    public void setLeavagentid(Long leavagentid) {
        this.leavagentid = leavagentid;
    }

    /**
     * 获取请假单单状态值	1、未审核	2、已驳回未通知	
3已通过未通知	4、已通知

     *
     * @return leavflag - 请假单单状态值	1、未审核	2、已驳回未通知	
3已通过未通知	4、已通知

     */
    public Integer getLeavflag() {
        return leavflag;
    }

    /**
     * 设置请假单单状态值	1、未审核	2、已驳回未通知	
3已通过未通知	4、已通知

     *
     * @param leavflag 请假单单状态值	1、未审核	2、已驳回未通知	
3已通过未通知	4、已通知

     */
    public void setLeavflag(Integer leavflag) {
        this.leavflag = leavflag;
    }

    /**
     * 获取请假类型	1、年假	2、事假	3、病假	4、婚假	5、丧假	6.调休假	7、工伤假	8、陪产假	9、产检假	10、产假


     *
     * @return leavtype - 请假类型	1、年假	2、事假	3、病假	4、婚假	5、丧假	6.调休假	7、工伤假	8、陪产假	9、产检假	10、产假


     */
    public Integer getLeavtype() {
        return leavtype;
    }

    /**
     * 设置请假类型	1、年假	2、事假	3、病假	4、婚假	5、丧假	6.调休假	7、工伤假	8、陪产假	9、产检假	10、产假


     *
     * @param leavtype 请假类型	1、年假	2、事假	3、病假	4、婚假	5、丧假	6.调休假	7、工伤假	8、陪产假	9、产检假	10、产假


     */
    public void setLeavtype(Integer leavtype) {
        this.leavtype = leavtype;
    }

    /**
     * 获取请假理由
     *
     * @return leavreason - 请假理由
     */
    public String getLeavreason() {
        return leavreason;
    }

    /**
     * 设置请假理由
     *
     * @param leavreason 请假理由
     */
    public void setLeavreason(String leavreason) {
        this.leavreason = leavreason;
    }

    /**
     * 获取请假结果（驳回理由或通过）
     *
     * @return leavresult - 请假结果（驳回理由或通过）
     */
    public String getLeavresult() {
        return leavresult;
    }

    /**
     * 设置请假结果（驳回理由或通过）
     *
     * @param leavresult 请假结果（驳回理由或通过）
     */
    public void setLeavresult(String leavresult) {
        this.leavresult = leavresult;
    }

    /**
     * 获取请假开始时间
     *
     * @return leavstart - 请假开始时间
     */
    public Date getLeavstart() {
        return leavstart;
    }

    /**
     * 设置请假开始时间
     *
     * @param leavstart 请假开始时间
     */
    public void setLeavstart(Date leavstart) {
        this.leavstart = leavstart;
    }

    /**
     * 获取请假结束时间
     *
     * @return leavend - 请假结束时间
     */
    public Date getLeavend() {
        return leavend;
    }

    /**
     * 设置请假结束时间
     *
     * @param leavend 请假结束时间
     */
    public void setLeavend(Date leavend) {
        this.leavend = leavend;
    }
}