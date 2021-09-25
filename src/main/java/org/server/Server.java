package org.server;

import java.net.InetSocketAddress;

import com.sun.net.httpserver.HttpServer;

import org.server.Router.HttpRouter;
import org.routes.OriginRoutes;

public class Server {
  public static void main(String[] args) throws Exception {
    HttpServer server = HttpServer.create(new InetSocketAddress(8000), 1);
    HttpRouter router = new HttpRouter(server);

    // OriginRoutes

    server.start();
  }

  public static class Executor {
    public void execute(Runnable r) {
      r.run();
    }
  }
}