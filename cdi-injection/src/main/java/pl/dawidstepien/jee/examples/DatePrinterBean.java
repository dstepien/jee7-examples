package pl.dawidstepien.jee.examples;

import java.util.logging.Logger;

import javax.annotation.PostConstruct;
import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.inject.Inject;

@Stateless
@Remote(DatePrinter.class)
public class DatePrinterBean implements DatePrinter {

  @Inject
  Logger logger;

  @Inject
  DateGenerator dateGenerator;

  @Override
  public void printDate() {
    logger.info("Today's date: " + dateGenerator.generateDate());
  }

  @PostConstruct
  public void sayHello() {
    logger.info("HI, THIS IS YOUR DATE PRINTER");
  }
}
