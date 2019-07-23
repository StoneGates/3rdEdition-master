package sample.spring.chapter07.bankapp.dao;

import org.apache.log4j.Logger;

import sample.spring.chapter07.bankapp.domain.CustomerRegistrationDetails;

public class CustomerRegistrationDaoImpl implements CustomerRegistrationDao {
	private static Logger logger = Logger.getLogger(CustomerRegistrationDaoImpl.class);

	@Override
	public void registerCustomer(CustomerRegistrationDetails customerRegistrationDetails) {
		logger.info("Registering customer");
	}
}
