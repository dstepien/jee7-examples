package pl.dawidstepien.jee.examples;

import java.text.SimpleDateFormat;
import java.util.Calendar;

import javax.inject.Inject;

@SimpleDate
public class SimpleDateGenerator implements DateGenerator {

  @Inject @SimpleDatePattern
  private String pattern;

  @Override
  public String generateDate() {
    SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
    return simpleDateFormat.format(Calendar.getInstance().getTime());
  }
}
