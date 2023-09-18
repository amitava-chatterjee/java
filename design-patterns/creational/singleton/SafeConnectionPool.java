public class SafeConnectionPool {

	private static SafeConnectionPool safeConnectionPool;

	private SafeConnectionPool() {
		if (safeConnectionPool != null) {
			throw new RuntimeException("Instance already created");
		}
	}

	public static SafeConnectionPool getInstance() {
		if (safeConnectionPool == null) {
			synchronized(SafeConnectionPool.class) {
				safeConnectionPool = new SafeConnectionPool();
			}
		}

		return safeConnectionPool;
	}

}
