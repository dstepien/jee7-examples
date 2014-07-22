package pl.dawidstepien.jee.examples;

import javax.enterprise.inject.Produces;

public class DatePatternProducer {

  @Produces @SimpleDatePattern
  private String simpleDatePattern = "d/M/y";
}
