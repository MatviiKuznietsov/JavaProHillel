package server;

import com.github.javafaker.Faker;

import java.io.*;
import java.net.*;
import java.util.*;
import java.util.concurrent.*;

public class Server {

    private static final int PORT = 9000;
    private static final int THREAD_POOL_SIZE = 10;


    private static ExecutorService executorService = Executors.newFixedThreadPool(THREAD_POOL_SIZE);

    public static void main(String[] args) {
        try (ServerSocket serverSocket = new ServerSocket(PORT)) {
            System.out.println("Server started on port " + PORT);

            while (true) {
                Socket clientSocket = serverSocket.accept();
                ConnectionHandler handler = new ConnectionHandler(clientSocket);
                ConnectionHandler.activeConnections.add(handler);
                executorService.execute(handler);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}