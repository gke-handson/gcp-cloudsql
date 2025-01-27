package org.chintanu.gcp_cloudsql;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportRuntimeHints;

@SpringBootApplication
@ImportRuntimeHints(GcpCloudSqlRuntimeHints.class)
public class GcpCloudsqlApplication {

	public static void main(String[] args) {
		SpringApplication.run(GcpCloudsqlApplication.class, args);
	}

}
