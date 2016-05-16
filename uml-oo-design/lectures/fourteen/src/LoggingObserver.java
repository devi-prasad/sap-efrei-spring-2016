import java.util.logging.Logger;

class LoggingObserver implements Observer {
	private Logger logger;

	public LoggingObserver() {
	}
    
    public void startObserving(Directory dir) {
    	logger = Logger.getLogger("ObserverExample");
        dir.register(this);
        logger.info("Attached to the subject.");
    }
  
    public void stopObserving(final Directory dir) {
        dir.unregister(this);
        logger.info("Detached from the subject.");
        logger = null;
    }

    public void added(String name) {
        logger.info("Subject created the item '" + name + "'" );
    }
 
    public void removed(String name) {
        logger.info("Subject removed the item '" + name + "'" );
    }

    public void renamed(String prev, String now) {
        logger.info("Subject renamed the item '" + prev + "' as '" + now + "'");
    }
}
