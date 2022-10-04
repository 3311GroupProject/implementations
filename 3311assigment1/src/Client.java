
public class Client {
	static Login proxy;
	
	
	public static void executeLogin()
	{
		proxy = new Proxy();
		proxy.getInstance();
		proxy.LoginService();
	}
		public static void main(String[] args) {
			executeLogin();
		}
}
