package com.tcpTest;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPReciever {
	public static void main(String[] args) {
		String msg = "";
		ServerSocket serverSocket = null;
		Socket socket = null;
		try {
			//构造ServerSocket实例，指定端口监听客户端的连接请求
			serverSocket = new ServerSocket(8080);
			//建立跟客户端的连接
			socket = serverSocket.accept();
			//向客户端发送消息
			OutputStream os = socket.getOutputStream();
			InputStream is = socket.getInputStream();
			
			while(true) {
				os.write("已接受数据。".getBytes());
				byte b[] = new byte[1024];
				is.read(b);
				System.out.println("服务端收到的信息："+new String(b));
			}
		} catch (Exception e) {
			try {
				serverSocket.close();
				socket.close();
			} catch (Exception e1) {
			}
		}finally {
			try {
				serverSocket.close();
				socket.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}
	}
}
