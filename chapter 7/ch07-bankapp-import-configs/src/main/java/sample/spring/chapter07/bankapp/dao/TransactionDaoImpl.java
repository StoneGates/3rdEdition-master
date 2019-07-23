package sample.spring.chapter07.bankapp.dao;

import org.apache.log4j.Logger;

public class TransactionDaoImpl implements TransactionDao {
	private static Logger logger = Logger.getLogger(TransactionDaoImpl.class);
	
	@Override
	public void getTransactions(String customerId) {
		logger.info("Getting transactions");
	}
}
