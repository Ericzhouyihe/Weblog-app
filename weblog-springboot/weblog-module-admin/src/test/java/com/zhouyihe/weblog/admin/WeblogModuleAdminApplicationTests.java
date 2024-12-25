package com.zhouyihe.weblog.admin;

import com.zhouyihe.weblog.common.domain.dos.UserDO;
import com.zhouyihe.weblog.common.domain.mapper.UserMapper;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(classes = WeblogModuleAdminApplicationTests.Application.class)
class WeblogModuleAdminApplicationTests {
	// @Import({
	// 		DataSourceAutoConfiguration.class, // Spring DB 自动配置类
	// 		DataSourceTransactionManagerAutoConfiguration.class, // Spring 事务自动配置类
	// 		MybatisPlusAutoConfiguration.class, // MyBatis 的自动配置类
	// })
	public static class Application {
	}

}
