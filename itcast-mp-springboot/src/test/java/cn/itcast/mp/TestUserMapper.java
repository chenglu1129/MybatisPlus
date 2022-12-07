package cn.itcast.mp;

import cn.itcast.mp.mapper.UserMapper;
import cn.itcast.mp.pojo.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @Author Cheng
 * @Date 2022 12 06 20 50
 **/
@RunWith(SpringRunner.class)
@SpringBootTest
public class TestUserMapper {
    @Autowired
    private UserMapper userMapper;

    @Test
    public void testInsert() {
        User user = new User();
        user.setMail("1@itcast.cn");
        user.setAge(30);
        user.setUserName("caocao");
        user.setName("曹操1");
        user.setPassword("123456");

        int result = this.userMapper.insert(user); //result数据库受影响的行数
        System.out.println("result => " + result);
        //获取自增长后的id值, 自增长后的id值会回填到user对象中
        System.out.println("id => " + user.getId());
    }

    @Test
    public void testSelectById() {
        User user = this.userMapper.selectById(2L);
        System.out.println(user);
    }

    @Test
    public void testUpdateById() {
        User user = new User();
        user.setId(1L); //条件，根据id更新
        user.setAge(19); //更新的字段
        user.setPassword("666666");

        int result = this.userMapper.updateById(user);
        System.out.println("result => " + result);
    }

}
