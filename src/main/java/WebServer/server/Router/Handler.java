package org.server.Router;

import java.io.IOException;
import java.io.OutputStream;

import com.sun.net.httpserver.HttpHandler;
import com.sun.net.httpserver.HttpExchange;

public class Handler implements HttpHandler {
  protected int status;
  protected String response;
  protected String[] allowedProtocols;

  protected void send(int status, String response, String... allowedProtocols) {
    this.status = status;
    this.response = response;
    this.allowedProtocols = allowedProtocols;
  }

  @Override
  public void handle(HttpExchange request) throws IOException {
    request.request.getProtocol();
    request.sendResponseHeaders(this.status, this.response.length());
    OutputStream os = request.getResponseBody();
    os.write(this.response.getBytes());
    os.close();
  }
}