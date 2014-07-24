package pl.dawidstepien.jee.examples;

import java.util.logging.Logger;

import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.inject.Inject;

@Stateless
@Remote(DatePrinter.class)
@Profiling
public class DatePrinterBean implements DatePrinter {

  @Inject
  Logger logger;

  @Inject @SimpleDate
  DateGenerator dateGenerator;

  @Override
  public void printDate() {
    logger.info(dateGenerator.generateDate());
  }
}
