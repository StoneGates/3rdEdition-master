package sample.spring.chapter07.bankapp.beanpostprocessor;

import org.apache.log4j.Logger;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class MyBeanPostProcessor implements BeanPostProcessor {
	private static Logger logger = Logger
			.getLogger(MyBeanPostProcessor.class);
	public MyBeanPostProcessor() {
		logger.info("Created MyBeanPostProcessor");
	}
	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName)
			throws BeansException {
		logger.info("postProcessBeforeInitialization method invoked for bean "
				+ beanName + " of type " + bean.getClass());
		return bean;
	}

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName)
			throws BeansException {
		logger.info("postProcessAfterInitialization method invoked for bean "
				+ beanName + " of type " + bean.getClass());
		return bean;
	}
}
