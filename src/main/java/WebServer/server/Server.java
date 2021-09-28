package org.server;

import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

import com.sun.net.httpserver.HttpServer;

import org.server.Router.Handler;

import java.io.*;

public class Server {
  public static void main(String[] args) throws IOException {

    ServerSocket serverSocket = new ServerSocket(4000);
    Socket socket = new Socket("127.0.0.1", 4000);

    System.out.print(socket.getRemoteSocketAddress());
    // os
    BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
    try {
      while (true) {
        String cominginText = "";
        cominginText = in.readLine();
        System.out.println(cominginText);
      }
    } catch (IOException e) {
      System.out.print(socket.getPort());
      socket.close();
      serverSocket.close();

      throw e;
    }
  }
}

// public class Server {
// public static void main(String[] args) throws Exception {
// HttpServer server = HttpServer.create(new InetSocketAddress(8000), 1);

// server.createContext("/", new Handler());
// server.start();

// Server.displayServerStartup();
// }

// private static void displayServerStartup() {
// System.out.println(" +---------------------------------------+");
// System.out.println(" | |");
// System.out.println(" | Server is running |");
// System.out.println(" | Your website: http://localhost:8000 |");
// System.out.println(" | |");
// System.out.println(" +---------------------------------------+");
// }
// }