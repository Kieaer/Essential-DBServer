import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;

public class Server implements Runnable {
    ServerSocket serverSocket;
    ArrayList<Service> list = new ArrayList<>();

    @Override
    public void run() {
        try {
            serverSocket = new ServerSocket(6000);

            while (!Thread.currentThread().isInterrupted()) {
                try {
                    Socket socket = serverSocket.accept();
                    Service service = new Service(socket);
                    service.start();
                    list.add(service);
                } catch (SocketException s){
                    return;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public class Service extends Thread {
        public Socket socket;
        public BufferedReader in;
        public DataOutputStream os;
        public String ip;
        boolean shutdown = false;

        public Service(Socket socket){
            try {
                this.socket = socket;
                this.ip = socket.getInetAddress().toString();
                in = new BufferedReader(new InputStreamReader(socket.getInputStream(), StandardCharsets.UTF_8));
                os = new DataOutputStream(socket.getOutputStream());
            } catch (IOException e){
                interrupt();
            }
        }

        @Override
        public void run() {
            while(!shutdown){
                try{
                    String value = in.readLine();
                    switch (value){
                        case "banlist":
                            break;
                        case "player":
                            break;
                    }
                } catch (IOException e){
                    e.printStackTrace();
                }
            }
        }
    }
}
