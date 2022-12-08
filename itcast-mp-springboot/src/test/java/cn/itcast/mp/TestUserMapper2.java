package cn.itcast.mp;

//import cn.itcast.mp.cn.itcast.mp.enums.SexEnum;
import cn.itcast.mp.enums.SexEnum;
import cn.itcast.mp.pojo.User;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/**
 * @Author Cheng
 * @Date 2022 12 08 15 28
 **/
@RunWith(SpringRunner.class)
@SpringBootTest
public class TestUserMapper2 {
    @Test
    public void testSelectById(){
        User user = new User();
        user.setId(2L);

        User user1 = user.selectById();
        System.out.println(user1);
    }

    /**
     * 测试全表更新，SQL分析器阻断效果
     */
    @Test
    public void testUpdateAll(){
        User user = new User();
        user.setAge(31); // 更新的数据

        boolean result = user.update(null); //全表更新
        System.out.println("result => " + result);
    }

    @Test
    public void testInsert(){
        User user = new User();
        user.setUserName("diaochan");
        user.setPassword("123456");
        user.setAge(20);
        user.setName("貂蝉");
        user.setMail("diaochan@itcast.cn");
        user.setVersion(1);
        user.setSex(SexEnum.WOMAN); //使用的是枚举

        // 调用AR的insert方法进行插入数据
        boolean insert = user.insert();
        System.out.println("result => " + insert);
    }

    @Test
    public void testDeleteById(){
        User user = new User();
        boolean result =  user.deleteById(2L);
        System.out.println("result => " + result);
    }


    @Test
    public void testInsert1(){
        User user = new User();
        user.setName("关羽");
        user.setUserName("guanyu");
        user.setAge(30);
        user.setMail("guanyu@itast.cn");
        user.setVersion(1);
        boolean result = user.insert();
        System.out.println("result => " + result);
    }


    @Test
    public void testUpdate(){
        User user = new User();
        user.setId(2L);// 查询条件
        user.setAge(31); // 更新的数据

        boolean result = user.updateById();
        System.out.println("result => " + result);
    }

    @Test
    public void testDelete(){
        User user = new User();
        user.setId(3L);

        boolean delete = user.deleteById();
        System.out.println("result => " + delete);
    }

    @Test
    public void testSelect(){
        User user = new User();

        QueryWrapper<User> wrapper  = new QueryWrapper<>();
        wrapper.ge("age", 30); //大于等于30岁的用户查询出来

        List<User> users = user.selectList(wrapper);
        for (User user1 : users) {
            System.out.println(user1);
        }
    }
}
