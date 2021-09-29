package org.WebServer.server.;

import com.sun.net.httpserver.HttpServer;

import org.WebServer.server.Viewer.View;

public class Router {
  private HttpServer server;

  public Router(HttpServer server) {
    this.server = server;
  }

  public void route(String path, View view) {
    this.server.createContext(path, view);
  }
}
