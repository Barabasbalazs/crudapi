package balazs.learning.crudapi.repo;

import org.springframework.context.annotation.Configuration;
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.boot.jdbc.DataSourceBuilder;
//Bean is just a class with only private members and getter setters, 
//also implements Serializable
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Primary;
//import javax.sql.DataSource;

@Configuration
public class DataSourceConfiguration {
    //commented out since this creates errors for the test at the moment
    /* 
    @Value("${db.driver:org.h2.Driver}")
    String driverClassName;
    @Value("${db.url}")
    String url;
    @Value("${db.username:sa}")
    String username;
    @Value("${db.password:#{null}}")
    String password;

    @Bean
    @Primary
    DataSource dataSource() {
        return DataSourceBuilder.create()
        .driverClassName(driverClassName)
        .url(url)
        .username(username)
        .password(password)
        .build();
    }
    */
}
