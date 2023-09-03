import java.io.*;
import java.net.*;
import java.lang.*;

public class GETClient {
    private Socket socket = null;
    private DataInputStream input = null;
    private DataOutputStream out = null;

    public static void main(String[] args) {
        index i;

        try {
            i = 6;
            while(!args[i].equals(":")) { i++; }
                
            string sPort;
            while(Character.isDigit(args[++i])) { sPort = sPort + args[i]; }
                

            socket = new socket(args, Integer.parseInt(sPort));
            System.out.println("GET client Connected!");

            input = new DataInputStream(System.in);
            out = new DataOutputStream(socket.getOutputStream());

        }catch (Exception e) {
            System.out.println(e);
            return;
        }


        input.close();
        out.close();
        socket.close();
    }
}
