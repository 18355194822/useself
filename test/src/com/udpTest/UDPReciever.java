package com.udpTest;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class UDPReciever {
	public static void main(String[] args)  throws Exception{
		DatagramSocket socket = new DatagramSocket(8888);
		DatagramPacket packet = new DatagramPacket(new byte[1024], 1024);
		while(true) {
			socket.receive(packet);
			byte arr[] = packet.getData();
			int len = packet.getLength();
			String ip = packet.getAddress().getHostAddress();
			int port = packet.getPort();
			System.out.println(ip+":"+port+":"+new String(arr,0,len));
		}
		//socket.close();
	}
}
