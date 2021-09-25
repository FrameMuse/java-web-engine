package org.server.Viewer;

import java.io.FileNotFoundException;

import org.server.Router.Handler;

public class View extends Handler {
  public View(String path) {
    try {
      Document document = new Document("src/app/views/" + path + ".view.html");
      this.send(200, document.read());
    } catch (FileNotFoundException error) {
      this.send(404, error.getMessage());
    } catch (Exception error) {
      this.send(500, "ViewError: " + error.getMessage());
    }
  }
}
