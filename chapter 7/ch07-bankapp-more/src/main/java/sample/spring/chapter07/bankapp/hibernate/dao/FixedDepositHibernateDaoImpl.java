package sample.spring.chapter07.bankapp.hibernate.dao;

import org.apache.log4j.Logger;

import sample.spring.chapter07.bankapp.dao.FixedDepositDao;
import sample.spring.chapter07.bankapp.domain.DataSource;
import sample.spring.chapter07.bankapp.domain.FixedDepositDetails;

public class FixedDepositHibernateDaoImpl implements FixedDepositDao {
	private static Logger logger = Logger
			.getLogger(FixedDepositHibernateDaoImpl.class);
	
	public FixedDepositHibernateDaoImpl(DataSource dataSource) {
		// TODO Auto-generated constructor stub
	}
	
	public boolean createFixedDeposit(FixedDepositDetails fdd) {
		// -- save the fixed deposits and then return true
		logger.info("Saving fixed deposit details");
		return true;
	}
}
