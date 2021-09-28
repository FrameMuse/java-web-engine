package org.server.Viewer;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.server.Router.Handler;

public class View extends Handler {
  private Document document;

  public View(String path) throws FileNotFoundException {
    this.document = new Document("src/app/views/" + path + ".view.html");
  }

  public String read() throws IOException {
    return this.document.read();
  }
}
