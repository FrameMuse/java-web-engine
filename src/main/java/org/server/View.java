package org.server;

import java.io.File;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.util.Scanner;

import org.server.Routing.Handler;

public class View extends Handler {
  public View(String path) {
    super(0, "");

    try {
      super.response = Document.read(path);
      super.status = 200;
    } catch (FileNotFoundException error) {
      super.response = "Routed file " + path + " not found";
      super.status = 404;
    } catch (Exception error) {
      super.response = "Internal server error";
      super.status = 500;
    }
  }

  public static class Document {
    public static String read(String path) throws IOException {
      File file = new File("src/app/views/" + path + ".view.html");
      Scanner reader = new Scanner(file);
      // while (reader.hasNextLine()) {
      // String line = reader.next();
      // System.out.println(line);
      // }
      String data = reader.next();
      reader.close();

      return data;
    }
  }
}
