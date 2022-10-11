package org.astraukh.admin.monitor.starter.config;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("org.astraukh.admin.monitor")
@EnableAdminServer
public class MainConfig {

}
