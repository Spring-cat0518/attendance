package com.example.attendance;

import com.alibaba.fastjson.JSON;
import com.example.attendance.domain.Company;
import com.example.attendance.service.CompanyService;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
@SpringBootTest
public class AttendanceApplicationTests {

    @Autowired
    private CompanyService companyService;

    @Test
    public void contextLoads() {
        Company company = new Company();
        company = companyService.selectByid(1L);
        System.out.println(JSON.toJSONString(company));
    }

}
