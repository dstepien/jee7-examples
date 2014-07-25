package pl.dawidstepien.jee.examples;

import static org.junit.Assert.assertEquals;

import java.text.SimpleDateFormat;
import java.util.Calendar;

import org.jboss.weld.environment.se.Weld;
import org.jboss.weld.environment.se.WeldContainer;
import org.junit.Test;

public class SimpleDateGeneratorTest {

  @Test
  public void shouldGenerateCorrectDate() {
    Weld weld = new Weld();
    WeldContainer weldContainer = weld.initialize();

    SimpleDateGenerator simpleDateGenerator = weldContainer.instance().select(SimpleDateGenerator.class).get();
    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("d-M-y");

    String expected = "Today's date: " + simpleDateFormat.format(Calendar.getInstance().getTime());
    String actual = simpleDateGenerator.generateDate();

    assertEquals(expected, actual);
  }
}