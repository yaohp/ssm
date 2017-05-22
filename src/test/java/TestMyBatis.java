import com.alibaba.fastjson.JSON;
import com.demo.po.User;
import com.demo.service.IUserService;
import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

/**
 * @author 姚贺鹏
 * @company 广州市初放网络科技有限公司
 * @ClassName TestMyBatis
 * @Description
 * @date 2017/5/22 0022下午 2:36
 * @Copyright (c) 2017, yaohepeng@chufanginc.com All Rights Reserved.
 */
@RunWith(SpringJUnit4ClassRunner.class)     //表示继承了SpringJUnit4ClassRunner类
@ContextConfiguration(locations = {"classpath:spring-mybatis.xml"})
public class TestMyBatis {
    private static Logger logger = Logger.getLogger(TestMyBatis.class);
    @Resource(name = "userService")
    private IUserService userService;
    @Test
    public void test1() {
        User user = userService.getUserById(1);
        // System.out.println(user.getUserName());
        // logger.info("值："+user.getUserName());
        logger.info(JSON.toJSONString(user));
    }
}
