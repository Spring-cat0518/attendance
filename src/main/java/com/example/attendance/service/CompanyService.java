package com.example.attendance.service;

import com.example.attendance.domain.Company;

/**
 * @Author: 吴机杏
 * @Date: 2020/2/18 16:08
 */
public interface CompanyService {
    boolean insertCompany(Company company);
    Company selectByid(Long id);
}
