package sample.spring.chapter07.bankapp;

import org.apache.log4j.Logger;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import sample.spring.chapter07.bankapp.controller.FixedDepositController;

public class BankAppWithoutProfile {
	private static Logger logger = Logger.getLogger(BankAppWithoutProfile.class);

	public static void main(String args[]) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(BankAppConfiguration.class,
				DevDBConfiguration.class, ProdDBConfiguration.class);
		FixedDepositController fixedDepositController = context.getBean(FixedDepositController.class);

		logger.info("Submission status of fixed deposit : " + fixedDepositController.submit());
		logger.info("Returned fixed deposit info : " + fixedDepositController.get());
		context.close();
	}
}
