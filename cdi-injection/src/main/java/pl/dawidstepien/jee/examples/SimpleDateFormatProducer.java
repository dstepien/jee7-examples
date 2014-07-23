package pl.dawidstepien.jee.examples;

import java.text.SimpleDateFormat;

import javax.enterprise.inject.Produces;
import javax.inject.Inject;

public class SimpleDateFormatProducer {

  @Inject @SimpleDatePattern
  private String pattern;

  @Produces
  public SimpleDateFormat produceSimpleDateFormat() {
    return new SimpleDateFormat(pattern);
  }
}
