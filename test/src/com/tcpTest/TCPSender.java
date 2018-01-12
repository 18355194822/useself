package com.tcpTest;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.SocketAddress;
import java.util.Scanner;

public class TCPSender {
	public static void main(String[] args)  throws Exception{
		Scanner scanner = new Scanner(System.in);
		Socket socket=null; 
        try { 
           //对服务端发起连接请求 
           socket=new Socket("localhost", 8080); 
            
           //接受服务端消息并打印 
           InputStream is=socket.getInputStream();
           byte b[]=new byte[1024]; 
            
           //给服务端发送信息 
           while(true) {
        	   is.read(b); 
        	   System.out.println("客户端收到的信息："+new String(b)); 
	   			String str = scanner.nextLine();
	   			if("quit".equals(str)) {
	   				break;
	   			}else {
	   				OutputStream os=socket.getOutputStream(); 
	   				os.write(str.getBytes()); 
	   			}
	   		}
       } catch (IOException e) { 
           // TODO Auto-generated catch block 
           e.printStackTrace(); 
       } 
	}
}
