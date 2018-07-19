import com.zjw.provider.service.ProviderService;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ConsumerServiceTest {


	@Test
	public void testQueryAll() {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"classpath:dubbo/*.xml");
		ProviderService providerService = applicationContext.getBean(ProviderService.class);
		System.out.println(providerService.add(1, 3));
	}
}
