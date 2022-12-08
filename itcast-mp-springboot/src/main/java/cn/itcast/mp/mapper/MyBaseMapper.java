package cn.itcast.mp.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;

/**
 * @Author Cheng
 * @Date 2022 12 08 16 28
 **/
public interface MyBaseMapper <T> extends BaseMapper<T> {

    List<T> findAll();

    // 扩展其他的方法
}
