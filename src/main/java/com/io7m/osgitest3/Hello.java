package com.io7m.osgitest3;

import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Deactivate;

@Component(immediate = true)
public final class Hello
{
  public Hello()
  {

  }

  @Activate
  public void onActivate()
  {
    System.out.println("Hello Eclipse BND 2!");
  }

  @Deactivate
  public void onDeactivate()
  {
    System.out.println("Goodbye Eclipse BND 2!");
  }
}
