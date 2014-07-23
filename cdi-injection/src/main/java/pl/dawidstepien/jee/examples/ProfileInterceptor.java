package pl.dawidstepien.jee.examples;

import java.util.logging.Logger;

import javax.annotation.PostConstruct;
import javax.inject.Inject;
import javax.interceptor.AroundInvoke;
import javax.interceptor.InvocationContext;

public class ProfileInterceptor {

  @Inject
  Logger logger;

  @PostConstruct
  public void logMethod(InvocationContext invocationContext) throws Exception {
    logger.info("\n\nWelcome, this is " + invocationContext.getTarget().getClass().getSimpleName() + "\n");
    invocationContext.proceed();
  }

  @AroundInvoke
  public Object profile(InvocationContext invocationContext) throws Exception {
    long initTime = System.currentTimeMillis();
    logger.info("ENTER: " + invocationContext.getMethod().getName());

    try {
      return invocationContext.proceed();
    } finally {
      long diffTime = System.currentTimeMillis() - initTime;
      logger.info(invocationContext.getMethod().getName() + " took " + diffTime + " millis");
    }
  }
}
