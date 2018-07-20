package Servletcontroller;

import org.apache.log4j.Logger;

public class LoggerFile {
public static Logger logger=Logger.getRootLogger();
public static void main(String args[])
   {
	logger.trace("Trace");
	logger.debug("debug");
	logger.info("info");
	logger.warn("warning");
	logger.error("error");
	
	
  }
}
