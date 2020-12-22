package org.example.server;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class FibonacciCalculatorServer {
    public static void main(String[] args) throws IOException {
        FCalculator calculator = new FCalculator();
        ServerSocket servSocket = new ServerSocket(25999);
        while (true) {
            try (Socket socket = servSocket.accept();
                 PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
                 BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()))) {
                String line;
                while ((line = in.readLine()) != null) {
                    if (line.equals("end")) {
                        break;
                    }
                    try {
                        long userInput =  Integer.parseInt(line);
                        //out.println(calculator.calculateRecursively(userInput));
                        out.println(calculator.calculateGeneralWay(userInput));
                    } catch (NumberFormatException nfe){
                        out.println("Ошибка!");
                    }
                }
            } catch (IOException ex) {
                ex.printStackTrace(System.out);
            }
        }
    }


}