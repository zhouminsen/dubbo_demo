

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

public class ProviderServiceTest  {


	@Test
	public void startService() throws IOException {
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"classpath:dubbo/*.xml");
		applicationContext.start();
		System.in.read(); // 为保证服务一直开着，利用输入流的阻塞来模拟
	}
}
