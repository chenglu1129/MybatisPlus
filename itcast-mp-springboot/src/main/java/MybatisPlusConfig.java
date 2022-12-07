import com.baomidou.mybatisplus.extension.plugins.PaginationInterceptor;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author Cheng
 * @Date 2022 12 07 15 45
 **/
@Configuration
@MapperScan("cn.itcast.mp.mapper")
public class MybatisPlusConfig {
    @Bean //配置分页插件
    public PaginationInterceptor paginationInterceptor(){
        return new PaginationInterceptor();
    }
}
