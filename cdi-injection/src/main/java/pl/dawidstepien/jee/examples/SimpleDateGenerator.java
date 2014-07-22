package pl.dawidstepien.jee.examples;

import java.text.SimpleDateFormat;
import java.util.Calendar;

@SimpleDate
public class SimpleDateGenerator implements DateGenerator {

  @Override
  public String generateDate() {
    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("d/M/y");
    return simpleDateFormat.format(Calendar.getInstance().getTime());
  }
}
