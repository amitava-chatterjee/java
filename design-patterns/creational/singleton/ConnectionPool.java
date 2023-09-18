public class ConnectionPool {

	private static ConnectionPool connectionPool;

	private ConnectionPool() {
	}

	public static ConnectionPool getInstance() {
		if (connectionPool == null) {
			connectionPool = new ConnectionPool();
		}

		return connectionPool;
	}

}
