package org.server;

import java.io.IOException;
import java.io.OutputStream;

import com.sun.net.httpserver.HttpHandler;
import com.sun.net.httpserver.HttpExchange;

public class Handler implements HttpHandler {
  protected int status;
  protected String response;

  public Handler(int status, String response) {
    this.status = status;
    this.response = response;
  }

  @Override
  public void handle(HttpExchange request) throws IOException {
    request.sendResponseHeaders(this.status, this.response.length());
    OutputStream os = request.getResponseBody();
    os.write(this.response.getBytes());
    os.close();
  }
}