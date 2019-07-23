package sample.spring;

import org.apache.log4j.Logger;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SampleApp {
	private static Logger logger = Logger.getLogger(SampleApp.class);

	public static void main(String args[]) throws Exception {
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext(
				"classpath:META-INF/spring/applicationContext.xml");
		MyServices services = context.getBean(MyServices.class);
		logger.info("Calling --> useStateless");
		services.useStateless();
		logger.info("Calling again --> useStateless");
		services.useStateless();
		logger.info("Calling --> useStateful");
		services.useStateful();
		logger.info("Calling again --> useStateful");
		services.useStateful();
		context.close();
	}
}
