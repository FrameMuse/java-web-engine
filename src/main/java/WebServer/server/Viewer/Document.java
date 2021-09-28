package org.server.Viewer;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Document {
  private File file;
  private Scanner reader;

  public Document(String path) throws FileNotFoundException {
    this.file = new File(path);
    this.reader = new Scanner(this.file);
  }

  public String read() throws IOException {
    String document = "";
    while (this.reader.hasNextLine()) {
      String line = this.reader.next();

      document += line;
    }
    this.reader.close();

    return document;
  }
}
