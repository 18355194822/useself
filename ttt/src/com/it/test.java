package com.it;
public class test {
	public static void main(String[] args) {
		Person person = new Man();
		
//		person.eat("苹果");
//		System.out.println(person.name);
//		person.zhuanqian("赚钱");
//		System.out.println(person.xiongji);
		
		
		for(int i=11;i<51;i++) {
//			System.out.println("curl -XPUT  -H \"Content-Type: application/json\" -d '{\"expectStatus\":1}' 'http://33.195.240.170:8001/shrekapi/control/"+i+"'");
//			System.out.println("sleep 0.5 ");
			
			
//			System.out.println("curl -XPUT \"http://33.195.240.170:8001/shrekapi/api/changeCamera?guid=vehicle_0000"+i+"@idst:1949&newCamera=17090803391310235592@33.195.3.104:7100\"");
//			System.out.println("sleep 0.5 ");
			
			String  a ="";
			if(i<10) {
				a = "00"+i;
			}else if(10<=i && i<100) {
				a = "0"+i;
			}else {
				a = ""+i;
			}
			System.out.println("cp  320599003.dat  320599"+a+".dat");
			System.out.println("sleep 0.1 ");
//			System.out.println("echo \"dt  shrek_smart_city_personnel   personnel_00"+a+"\" | ./bin/datahubcmd");
//			System.out.println("sleep 0.5 ");
			
			//ipc_his000001~ipc_his000200
//			System.out.println("echo \"cd ipc_his000"+a+"@idst:1949 smart_city ipc_his000"+a+" --create-topic\" | ./bin/datahubcmd");
//			System.out.println("sleep 0.5 ");
			
		}
	}
}
