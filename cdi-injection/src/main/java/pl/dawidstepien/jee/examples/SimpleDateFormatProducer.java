package pl.dawidstepien.jee.examples;

import java.text.SimpleDateFormat;
import java.util.logging.Logger;

import javax.enterprise.inject.Disposes;
import javax.enterprise.inject.Produces;
import javax.inject.Inject;

public class SimpleDateFormatProducer {

  @Inject
  Logger logger;

  @Inject @SimpleDatePattern
  private String pattern;

  @Produces
  public SimpleDateFormat produceSimpleDateFormat() {
    return new SimpleDateFormat(pattern);
  }

  private void objectCreated(@Disposes SimpleDateFormat simpleDateFormat) {
    logger.info("SimpleDateFormat object created.");
  }
}
