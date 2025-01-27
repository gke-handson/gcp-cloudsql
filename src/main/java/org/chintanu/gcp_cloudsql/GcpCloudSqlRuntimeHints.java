package org.chintanu.gcp_cloudsql;

import org.springframework.aot.hint.RuntimeHints;
import org.springframework.aot.hint.RuntimeHintsRegistrar;

public class GcpCloudSqlRuntimeHints implements RuntimeHintsRegistrar {
    @Override
    public void registerHints(RuntimeHints hints, ClassLoader classLoader) {
        hints.resources().registerPattern("db/*");
        hints.resources().registerPattern("mysql-default-conf");
    }
}
