package server;

import com.github.javafaker.Faker;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

public class ConnectionHandler implements Runnable {
    public static Set<ConnectionHandler> activeConnections = new HashSet<>();
    private Socket clientSocket;
    private String clientName;
    private long connectionTime;

    public ConnectionHandler(Socket clientSocket) {
        Faker fakeName =new Faker();
        System.out.println();
        this.clientSocket = clientSocket;
        this.clientName = "Client-" + clientSocket.getLocalAddress();
        this.connectionTime = System.currentTimeMillis();
    }

    @Override
    public void run() {
        try {
            PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);
            BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));

            System.out.println(clientName + " connected at " + new Date(connectionTime));
            broadcast(clientName + " has joined the server.");

            String inputLine;
            while ((inputLine = in.readLine()) != null) {
                System.out.println(clientName + ": " + inputLine);
                broadcast(clientName + ": " + inputLine);
            }

            in.close();
            out.close();
            clientSocket.close();

            activeConnections.remove(this);
            System.out.println(clientName + " disconnected.");
            broadcast(clientName + " has left the server.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void broadcast(String message) {
        for (ConnectionHandler connection : activeConnections) {
            try {
                PrintWriter out = new PrintWriter(connection.clientSocket.getOutputStream(), true);
                out.println(message);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
