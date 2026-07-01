package com.cognizant.Exercise2.Verifying.Interactions;

public class MyService {

  private ExternalApi externalApi;

  public MyService(ExternalApi externalApi) {
    this.externalApi = externalApi;
  }

  public String fetchData() {
    return externalApi.getData();
  }
}