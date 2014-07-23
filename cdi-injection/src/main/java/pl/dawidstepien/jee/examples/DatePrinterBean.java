package pl.dawidstepien.jee.examples;

import java.util.logging.Logger;

import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.interceptor.Interceptors;

@Stateless
@Remote(DatePrinter.class)
@Interceptors(ProfileInterceptor.class)
public class DatePrinterBean implements DatePrinter {

  @Inject
  Logger logger;

  @Inject @SimpleDate
  DateGenerator dateGenerator;

  @Override
  public void printDate() {
    logger.info("Today's date: " + dateGenerator.generateDate());
  }
}
