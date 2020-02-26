package tk.mybatis;


import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

/**
 * @Author: 吴机杏
 * @Date: 2020/2/18 16:21
 */
public interface MyMapper<T> extends Mapper<T>, MySqlMapper<T> {
}
