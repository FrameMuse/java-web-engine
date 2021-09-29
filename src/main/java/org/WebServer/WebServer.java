package org.WebServer;

import java.io.IOException;
import java.net.InetSocketAddress;

import com.sun.net.httpserver.HttpServer;

import org.WebServer.server.Router.Handler;

public class WebServer {
  public static void main(String[] args) throws IOException {
    InetSocketAddress address = new InetSocketAddress("localhost", 4000);
    HttpServer httpServer = HttpServer.create(address, 1);

    httpServer.createContext("/", new Handler());
    httpServer.start();
  }
}
