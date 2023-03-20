package com.spice;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @author spice
 */
@SpringBootTest
class JenkinsPracticeApplicationTests {

	@Test
	void testJenkinsStage() {
		System.out.println("执行了单元测试");
		int expectedLife = 6;
		int actualLife = 6;
		Assertions.assertEquals(expectedLife, actualLife);
	}
}
