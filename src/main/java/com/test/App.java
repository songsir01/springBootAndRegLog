package com.test;
/**
 * Project Name:SpringBootTest
 * File Name:App.java
 * Package Name:com.test
 * Date:2017年8月18日下午5:23:39
 * Copyright (c) 2017, chenzhou1025@126.com All Rights Reserved.
 *
*/


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * ClassName:App <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason:	 TODO ADD REASON. <br/>
 * Date:     2017年8月18日 下午5:23:39 <br/>
 * @author   Administrator
 * @version  
 * @since    JDK 1.7
 * @see 	 
 */
@MapperScan("com.test.mapper")
@SpringBootApplication
@EnableAutoConfiguration
public class App {
	
	public static void main(String[] args) {
		SpringApplication.run(App.class);
	}
	
	//what the happened
}

/**
 * 这里 修改修改改一下
 * 
 * zaizai 
 * xiugai u
 * gaiuxii
 * gaioug
 */

