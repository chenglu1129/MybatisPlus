package cn.itcast.mp.mapper;

import cn.itcast.mp.pojo.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

/**
 * @Author Cheng
 * @Date 2022 12 06 20 21
 **/

public interface UserMapper extends MyBaseMapper<User> {
    User findById(Long id);
}
