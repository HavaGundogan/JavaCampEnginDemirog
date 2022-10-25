package business;

import core.logging.Logger;
import dataAccess.İnstructerDao;
import entities.İnstructer;

public class İntructerManager {
	private Logger[] loggers;
	private İnstructerDao instructerDao;
	
	public İntructerManager(İnstructerDao instruerDao , Logger[] loggers) {
		this.instructerDao = instruerDao;
		this.loggers = loggers;
		
	}
	public void add(İnstructer instructer) {
		instructerDao.add();
		
		for(Logger logger : loggers) {
			logger.log(instructer.getFirstName());
		}
	}

}
