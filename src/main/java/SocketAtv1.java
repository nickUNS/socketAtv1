import java.net.Socket;
import java.io.PrintWriter;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
//test comment, hi
public class SocketAtv1 {
    public static void main(String[] args) {
    try {
        Socket sock = new Socket("www.google.com.br", 80);
        PrintWriter out = new PrintWriter(sock.getOutputStream(), true);
        BufferedReader in = new BufferedReader(new InputStreamReader(sock.getInputStream()));
        String linha = "";
        out.println("GET / HTTP/1.0\n");
        while ((linha = in.readLine()) != null) {
            System.out.println("echo: " + linha);
        }
        System.out.println("Endereco e porta: " + sock.getRemoteSocketAddress());
        } catch ( IOException e ) {
            System.err.println( "Problemas de IO" );
        }
    }
}
