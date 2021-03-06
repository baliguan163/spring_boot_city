package com.ado.demo;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//还记得我定义CityMapper.java的时候，为什么把@Mapper给注释掉了吗？是因为我在入口文件这里定义了到哪里去找
//        mapper 文件，所以就不用再在每个 mapper 文件中再写个注解了：

//spring-boot 框架整合 MyBatis
@SpringBootApplication
// mapper 接口类扫描包配置
@MapperScan("com.ado.demo.dao") // 定义了在哪里扫描mapper文件
public class SpringBootDemoNoteApplication {
	public static void main(String[] args) {
		SpringApplication.run(SpringBootDemoNoteApplication.class, args);
	}
}
