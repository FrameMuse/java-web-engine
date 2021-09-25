package org.routes;

import org.server.Viewer.View;
import org.server.Router.HttpRouter;

public class OriginRoutes {
  public static void apply(HttpRouter router) {
    router.route("/", new View("index"));
  }
}
