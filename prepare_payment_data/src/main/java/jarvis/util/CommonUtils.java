package jarvis.util;

public class CommonUtils {
	public static void closeResources(AutoCloseable... closeableResource) {
		if (closeableResource == null || closeableResource.length == 0) {
			return;
		}
		for (AutoCloseable closeable : closeableResource) {
			if (closeable != null) {
				try {
					closeable.close();
				} catch (Exception e) {
					closeable = null;
				}
			}
		}
	}
}
