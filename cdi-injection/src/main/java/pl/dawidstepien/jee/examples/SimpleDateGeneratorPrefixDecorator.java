package pl.dawidstepien.jee.examples;

import javax.decorator.Decorator;
import javax.decorator.Delegate;
import javax.inject.Inject;

@Decorator
public class SimpleDateGeneratorPrefixDecorator implements DateGenerator {

  @Inject @SimpleDate @Delegate
  private DateGenerator dateGenerator;

  @Override
  public String generateDate() {
    return "Today's date: " + dateGenerator.generateDate();
  }
}
