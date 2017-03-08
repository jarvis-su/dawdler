package sonar.duplications;

import org.apache.log4j.Logger;

public class Duplications03 {

	static Logger logger = Logger.getLogger(Duplications03.class);

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int i = 0, j = 0, k = 0;

		if (i % 2 == 0) {
			logger.info("1234");
			logger.info("12345");
			logger.info("123456");
			logger.info("1234567");
			logger.info("123456789");
		}

		if (j % 2 == 0) {
			logger.info("1234");
			logger.info("12345");
			logger.info("123456");
			logger.info("1234567");
			logger.info("123456789");
		}

		if (k % 2 == 0) {
			logger.info("1234");
			logger.info("12345");
			logger.info("123456");
			logger.info("1234567");
			logger.info("123456789");
		}

		if (k % 3 == 0) {
			logger.info("123456789");
			logger.info("123456789");
			logger.info("123456789");
			logger.info("123456789");
			logger.info("123456789");
			logger.info("123456789");
			logger.info("123456789");
			logger.info("123456789");
			logger.info("123456789");
		}
		if (k % 5 == 0) {
			logger.info("123456789");
			logger.info("123456789");
			logger.info("123456789");
			logger.info("123456789");
			logger.info("123456789");
			logger.info("123456789");
			logger.info("123456789");
			logger.info("123456789");
			logger.info("123456789");
		}

	}

}
