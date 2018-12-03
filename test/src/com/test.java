package com;

import java.util.ArrayList;
import java.util.List;


public class test {

	public static void main(String[] args) {
		
		System.out.println(Long.toHexString(Long.parseLong("1101",2)));

		byte byteArr[] = new byte[] {-23, -125, -83, -27, -70, -122, -27, -123, -76};
		String s = new String(byteArr);
		String str = new String("郭庆兴");
		byte strArr[] = str.getBytes();
		
		long l = 3333L;
		int i = (int)l;
//		System.out.println(l);
//		System.out.println(i);
		int mem = 8010424/1024;
		int a = mem%100;
		int b = mem -a;
		System.out.println(mem); 
		int c = (b*9/10)%100;
		System.out.println((b*9/10)-c); 
		int xmn = (b*9/10) - c;
		xmn = xmn*4/5;
		System.out.println(xmn - xmn%100); 
		
		List<String> tasks = new ArrayList<>();
		List<String> groupMachines = new ArrayList<>();
		groupMachines.add("ip=11");
		groupMachines.add("ip=22");
		groupMachines.add("ip=33");
		if (groupMachines.stream().filter(machine -> machine.equals("ip=22")).count() == 0) {//task不在有效机器上
            tasks.add("ip=22");
        }else {
        	tasks.add("task on timeout machine");
        }
		System.out.println("=====   "+tasks.get(0));
	}
}
