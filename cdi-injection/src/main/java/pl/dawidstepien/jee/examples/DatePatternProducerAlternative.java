package pl.dawidstepien.jee.examples;

import javax.enterprise.inject.Alternative;
import javax.enterprise.inject.Produces;

public class DatePatternProducerAlternative {

  @Produces @SimpleDatePattern @Alternative
  private String simpleDatePattern = "d-M-y";
}
