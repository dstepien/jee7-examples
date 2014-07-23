package pl.dawidstepien.jee.examples;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import javax.inject.Inject;

@SimpleDate
public class SimpleDateGenerator implements DateGenerator {

  @Inject
  private SimpleDateFormat simpleDateFormat;

  @Override
  public String generateDate() {
    return simpleDateFormat.format(getCurrentDate());
  }

  private Date getCurrentDate() {
    return Calendar.getInstance().getTime();
  }
}
