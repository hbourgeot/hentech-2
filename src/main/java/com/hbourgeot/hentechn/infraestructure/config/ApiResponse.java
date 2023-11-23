package com.hbourgeot.hentechn.infraestructure.config;

import lombok.Data;

@Data
public class ApiResponse {
  private boolean ok;
  private int status;
  private Object data;
  private String message;
  private String errorDetails;

  public ApiResponse(boolean ok, int status, Object data, String message, String error) {
    this.setOk(ok);
    this.setStatus(status);
    this.setData(data);
    this.setMessage(message);
    this.setErrorDetails(error);
  }
}
