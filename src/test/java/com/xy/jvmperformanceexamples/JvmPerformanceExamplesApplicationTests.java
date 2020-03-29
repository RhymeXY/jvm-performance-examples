package com.xy.jvmperformanceexamples;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

@SpringBootTest
@Slf4j
public class JvmPerformanceExamplesApplicationTests {
	@Autowired
	private ApplicationContext applicationContext;


	@Test
	public void beanLoopDependency() {
		log.info("applicationContext : {}",applicationContext);
	}


}
