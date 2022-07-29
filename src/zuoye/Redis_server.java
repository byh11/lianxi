package zuoye.zuoye1;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Redis_server {

    Map<Integer,Socket> map=new ConcurrentHashMap<>();

    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(6370);
        ExecutorService service= Executors.newFixedThreadPool(3);
        while (true) {
            Socket socket = serverSocket.accept();
            service.submit(new ClientHandler(socket));
        }

    }
}


class ClientHandler extends Thread {
    private final Socket socket;

    public ClientHandler(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
            String msg = null;
            String s="";
            exit:
            while ((msg = reader.readLine()) != null) {
                System.out.println("get message from client: " + msg);
                String r=xxx(msg);
                if(r!=""){
                    writer.write(r);
                    writer.flush();
                }
            }
            socket.close();
            writer.close();
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    HashMap<String,String> map=new HashMap<>();
    int a;
    String[] m=new String[10];
    int n=0;
    public String xxx(String msg){
        String r="";
        if (msg.contains("*")) {
            a=Integer.valueOf(String.valueOf(msg.split("\\*")[1]));
            a*=2;
            return "";
        }
        if(a%2!=0){
            m[n++]=msg;
        }
        a--;
        if(a==0){
            if(m[0].equals("set")){
                map.put(m[1],m[2]);
                System.out.println(m[1]);
                r="+\"ok\"\r\n";
                m=new String[10];
                n=0;
            }else if(m[0].equals("get")){
                System.out.println(map.get(m[1])+111);
                r="+"+map.get(m[1])+"\r\n";
                m=new String[10];
                n=0;
            }
        }
        return r;
    }



}
