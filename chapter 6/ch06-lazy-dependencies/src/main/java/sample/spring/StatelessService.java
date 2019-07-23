package sample.spring;

import org.apache.log4j.Logger;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

@Service
@Lazy
public class StatelessService {
	private static Logger logger = Logger.getLogger(StatelessService.class);
	
	public StatelessService() {
		logger.info("Created StatelessService");
	}
}
