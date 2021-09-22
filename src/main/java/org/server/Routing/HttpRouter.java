package org.server.Routing;

import com.sun.net.httpserver.HttpServer;

import org.server.View;

public class HttpRouter {
  private HttpServer server;

  public HttpRouter(HttpServer server) {
    this.server = server;
  }

  public void route(String path, View view) {
    this.server.createContext(path, view);
  }
}
