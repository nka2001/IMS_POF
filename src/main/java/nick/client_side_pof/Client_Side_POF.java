/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package nick.client_side_pof;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 *
 * @author Nick
 */
public class Client_Side_POF {

    public static void main(String[] args) {
        
        final String SERVER = "DESKTOP-6CBE75G";
        final int port = 12000;
        
        try{
            
            Socket s = new Socket(SERVER, port);
            
            BufferedReader in = new BufferedReader(new InputStreamReader(s.getInputStream()));
            PrintWriter out = new PrintWriter(s.getOutputStream(), true);
            
            out.println("Hi from client");
            
            String response = in.readLine();
            System.out.println("server says: " + response);
            
            
            
        } catch (UnknownHostException e){
            System.err.println("unknwon host");
        } catch (IOException e){
            System.out.println("error connecting to server");
        }
        
        
        
    }
}
