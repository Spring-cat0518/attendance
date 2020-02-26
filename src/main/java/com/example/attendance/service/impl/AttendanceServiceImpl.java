package com.example.attendance.service.impl;

import com.example.attendance.domain.Attendance;
import com.example.attendance.domain.AttendanceQuery;
import com.example.attendance.mapper.AttendanceMapper;
import com.example.attendance.service.AttendanceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

/**
 * @Author: 吴机杏
 * @Date: 2020/2/21 16:13
 */
@Service
public class AttendanceServiceImpl implements AttendanceService {
    @Autowired
    private AttendanceMapper attendanceMapper;
    @Override
    public boolean insertAttendance(Attendance attendance) {
        return attendanceMapper.insert(attendance) > 0;
    }

    @Override
    public List<Attendance> selectAttendance(AttendanceQuery attendanceQuery) {
        Example example = new Example(Attendance.class);
        Example.Criteria criteria = example.createCriteria();
        return attendanceMapper.selectByExample(criteria);
    }
}
