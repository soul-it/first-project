package com.briup.day19;
/**
 * 服务器聊天实现
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;
public class WhileServer {
	public static void main(String[] args) {
		ServerSocket server=null;
		Socket socket=null;
		try {
			server=new ServerSocket(10001);
			socket = server.accept();
			InputStream is = socket.getInputStream();
			OutputStream os = socket.getOutputStream();
			PrintWriter pw=new PrintWriter(os);
			BufferedReader br=new BufferedReader(new InputStreamReader(is));
			Scanner s=new Scanner(System.in);
			while(true) {
				System.out.println("client:"+br.readLine());
				pw.println(s.nextLine());
				pw.flush();
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
