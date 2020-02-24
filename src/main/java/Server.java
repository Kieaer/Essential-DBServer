import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketException;
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
        public Service(Socket socket){
            this.socket = socket;
        }
    }
}
