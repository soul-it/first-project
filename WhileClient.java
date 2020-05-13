package com.briup.day19;
/**
 * 客户端聊天实现
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;
import java.util.Scanner;

public class WhileClient {
public static void main(String[] args) {
	Socket socket=null;
	try {
		socket=new Socket(InetAddress.getByName("127.0.0.1"), 10001);
		
		InputStream is = socket.getInputStream();
		OutputStream os = socket.getOutputStream();
		PrintWriter pw = new PrintWriter(os);
		BufferedReader br = new BufferedReader(new InputStreamReader(is));
		Scanner scanner = new Scanner(System.in);
		System.out.println("请开始你的聊天");
		while(true) {
			pw.println(scanner.nextLine());
			pw.flush();
			System.out.println("Server:"+br.readLine());
		}
		
		
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
}
}
