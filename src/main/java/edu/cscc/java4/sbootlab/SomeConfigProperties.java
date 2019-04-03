package edu.cscc.java4.sbootlab;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.net.InetAddress;


@Component
@ConfigurationProperties(prefix="edu.cscc.java4.sbootlab.config")

public class SomeConfigProperties {

  private boolean enabled;
  private InetAddress remoteAddress;
  private String messageOfTheDay;

  public boolean isEnabled() {return enabled; }

  public void setEnabled(boolean enabled) {
    this.enabled = enabled;
  }

  public InetAddress getRemoteAddress() {
    return remoteAddress;
  }

  public void setRemoteAddress(InetAddress remoteAddress) {
    this.remoteAddress = remoteAddress;
  }

  public String getMessageOfTheDay() {
    return messageOfTheDay;
  }

  public void setMessageOfTheDay(String messageOfTheDay) {
    this.messageOfTheDay = messageOfTheDay;
  }

}
