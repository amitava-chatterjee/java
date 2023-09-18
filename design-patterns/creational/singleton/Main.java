import java.lang.reflect.Constructor;

public class Main {

	public static void main(String args[]) throws Exception {
		ConnectionPool connectionPool1 = ConnectionPool.getInstance();
		ConnectionPool connectionPool2 = ConnectionPool.getInstance();
		ConnectionPool connectionPool3 = ConnectionPool.getInstance();
		ConnectionPool connectionPool4 = ConnectionPool.getInstance();

		System.out.println(connectionPool1.hashCode());
		System.out.println(connectionPool2.hashCode());
		System.out.println(connectionPool3.hashCode());
		System.out.println(connectionPool4.hashCode());
		System.out.println(connectionPool1 == connectionPool4);
		
		SafeConnectionPool s1 = SafeConnectionPool.getInstance();
		SafeConnectionPool s2 = SafeConnectionPool.getInstance();
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s1 == s2);

		Constructor<SafeConnectionPool> c = SafeConnectionPool.class.getDeclaredConstructor();
		c.setAccessible(true);
		// SafeConnectionPool s3 = c.newInstance(); // loophole fixed
	}

}
