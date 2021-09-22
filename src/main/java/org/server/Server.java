package org.server;

import java.net.InetSocketAddress;
import com.sun.net.httpserver.HttpServer;
import org.server.Routing.HttpRouter;

public class Server {

  public static void main(String[] args) throws Exception {
    HttpServer server = HttpServer.create(new InetSocketAddress(8000), 0);
    HttpRouter router = new HttpRouter(server);

    router.route("/", new View("/src/app/index.html"));

    server.setExecutor(null);
    server.start();
  }
}