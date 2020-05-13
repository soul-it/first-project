//模拟登陆
import java.util.Scanner;
import javax.security.auth.login.LoginException;
public class login {
	String name="tpm";
	String password="xxxx";
public login(String name,String password) throws LoginException
{
	if(this.name.equals(name))
	{
		if(this.password.equals(password))
		{
			System.out.println("登陆异常");
		}
		else {
			throw new LoginException("密码错误");
		}
	}else
	{
		throw new LoginException("用户名错误");
	}
}
public static void main(String[] args) {
	System.out.println("请输入用户名");
	Scanner scanner=new Scanner(System.in);
	String name=scanner.nextLine();
	System.out.println("请输入密码");
	Scanner scanner1=new Scanner(System.in);
	String password=scanner1.nextLine();
	try {
		new login(name,password);
	}catch(LoginException e) {
		System.out.println(e.getMessage());
		main(null);//循环执行main方法
	}finally {
		System.out.println("你可以强制退出");
	}
}
}
