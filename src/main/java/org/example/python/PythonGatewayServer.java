package org.example.python;

import py4j.GatewayServer;

public class PythonGatewayServer {

  /**
   * This method starts the python gateway server.
   */
  public static void main(String[] args) {
    GatewayServer gatewayServer = new GatewayServer();
    gatewayServer.start();
    System.out.println("Gateway Server Started");
  }
}
