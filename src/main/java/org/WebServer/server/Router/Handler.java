package org.WebServer.server.Router;

import java.io.IOException;
import java.io.OutputStream;

import com.sun.net.httpserver.HttpHandler;

import org.WebServer.middleware.Middleware;

import com.sun.net.httpserver.HttpExchange;

public class Handler implements HttpHandler {
  protected String response;

  @Override
  public void handle(HttpExchange request) throws IOException {
    OutputStream os = request.getResponseBody();
    Middleware middleware = new Middleware();

    request.sendResponseHeaders(200, this.response.length());

    os.write(this.response.getBytes());
    os.close();
  }
}