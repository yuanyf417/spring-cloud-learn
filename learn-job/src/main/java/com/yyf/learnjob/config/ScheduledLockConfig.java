package com.yyf.learnjob.config;

import com.zaxxer.hikari.HikariDataSource;
import com.zaxxer.hikari.hibernate.HikariConnectionProvider;
import net.javacrumbs.shedlock.core.LockProvider;
import net.javacrumbs.shedlock.provider.jdbctemplate.JdbcTemplateLockProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;
import java.util.TimeZone;

/**
 * description
 *
 * @author YYF 2024/10/09 2024/10/9.
 */
@Configuration
public class ScheduledLockConfig {

    @Autowired
    private HikariDataSource dataSource;

    @Bean
    public LockProvider lockProvider() {
        return new JdbcTemplateLockProvider(JdbcTemplateLockProvider.Configuration.builder()
                .withJdbcTemplate(new JdbcTemplate(dataSource))
                .withTimeZone(TimeZone.getTimeZone("UTC"))
                .build());
    }
}
