package cn.itcast.mp.simple.mapper;

import cn.itcast.mp.simple.pojo.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;


/**
 * @Author Cheng
 * @Date 2022 12 06 12 55
 **/
public interface UserMapper extends BaseMapper<User> {
    List<User> findAll() ;
}
