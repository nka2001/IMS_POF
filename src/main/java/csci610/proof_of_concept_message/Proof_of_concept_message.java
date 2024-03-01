/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package csci610.proof_of_concept_message;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

/**
 *
 * @author nicka
 */
public class Proof_of_concept_message {

    public static void main(String[] args) {
        
        
        final int PORT = 12000;
        
        
        try{
            
            ServerSocket s = new ServerSocket(PORT);
            System.out.println("server started");
            
            
            Socket client = s.accept();
            
            BufferedReader in = new BufferedReader(new InputStreamReader(client.getInputStream()));
            PrintWriter out = new PrintWriter(client.getOutputStream(), true);
            
            String message = in.readLine();
            System.out.println("client says: " + message);
            
            out.println("message received by server");
            
            
            
            
        } catch (IOException e){
            System.out.println("error");
        }
        
        
        
        
    }
}
