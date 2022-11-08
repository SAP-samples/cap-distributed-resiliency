package my.bookshop.health;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.LinkedHashMap;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.actuate.endpoint.annotation.Endpoint;
import org.springframework.boot.actuate.endpoint.annotation.ReadOperation;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.stereotype.Component;

/**
 * Custom app actuator implementation.
 */
@Component
@ConditionalOnClass(Endpoint.class)
@Endpoint(id = "dbmonitor", enableByDefault = true)
public class DBMonitor {
	@Autowired
	private DataSource dataSource;

	@ReadOperation
	public Map<String, Object> info() {
		Map<String, Object> info = new LinkedHashMap<>();

		info.put("Version", "1.0.0");
		try {
			DatabaseMetaData databaseMetaData = dataSource.getConnection().getMetaData();

			info.put("Active Host", getHost());
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return info;
	}

	private String getHost() {
		String host = null;
		Connection connection = null;
		try {
			connection = dataSource.getConnection();
			Statement stmt = connection.createStatement();
			ResultSet resultSet = stmt.executeQuery(
					"select inet_server_addr()");
			resultSet.next();
			host = resultSet.getString(1);

		} catch (Exception ex) {
			// TODO
		} finally {
			try {
				connection.close();
			} catch (Exception e) {
			}
		}
		return host;
	}
}
