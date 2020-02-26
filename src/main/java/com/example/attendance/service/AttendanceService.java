package com.example.attendance.service;

import com.example.attendance.domain.Attendance;
import com.example.attendance.domain.AttendanceQuery;

import java.util.List;

/**
 * @Author: 吴机杏
 * @Date: 2020/2/21 15:58
 */
public interface AttendanceService {
    boolean insertAttendance(Attendance attendance);
    List<Attendance> selectAttendance(AttendanceQuery attendanceQuery);
}
