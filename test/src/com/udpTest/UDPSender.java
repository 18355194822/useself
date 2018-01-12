package com.udpTest;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.util.Scanner;

public class UDPSender {
	public static void main(String[] args)  throws Exception{
		Scanner scanner = new Scanner(System.in);
		DatagramSocket socket = new DatagramSocket();
		//socket.bind(new SocketAddress(new InetSocketAddress(8888)));;
		while(true) {
			String str = scanner.nextLine();
			if("quit".equals(str)) {
				break;
			}else {
				DatagramPacket packet = new DatagramPacket(str.getBytes(), str.getBytes().length, InetAddress.getByName("127.0.0.1"),8888);
				socket.send(packet);
			}
		}
		socket.close();
		System.out.println("===============");
	}
}
