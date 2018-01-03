package org.rvslab.chapter2;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.client.RestTemplate;

import junit.framework.Assert;


@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment=WebEnvironment.RANDOM_PORT)

/* It is deprecated now
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(Chapter2BootrestApplication.class)
@WebIntegrationTest("server.port:8080")
*/

public class Chapter2BootrestApplicationTests {

	@Value("${local.server.port}")
	private int port;
	
	@Test
	public void contextLoads() {
	}
	
	@Test
	public void testVanillaService(){
		RestTemplate restTemplate = new RestTemplate();
		
		Greet greet = restTemplate.getForObject(
				"http://localhost:" + port, Greet.class);
		Assert.assertEquals("Hello World", greet.getMessage());
	}

}
