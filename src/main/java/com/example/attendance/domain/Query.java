package com.example.attendance.domain;

import lombok.Data;

import java.io.Serializable;

/**
 * @Author: 吴机杏
 * @Date: 2020/2/21 13:44
 */
@Data
public class Query implements Serializable {
    private int page; // 第几页开始
    private int limit; // 查询几页
    private String sort; // 降序或者升序
}
