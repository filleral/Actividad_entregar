
package dao;

import org.springframework.jdbc.datasource.DriverManagerDataSource;

public class ConectarDB {
    public DriverManagerDataSource conectar (){
        DriverManagerDataSource datasource = new DriverManagerDataSource();
        datasource.setDriverClassName("com.mysql.jdbc.Driver");
        datasource.setUrl("jdbc:mysql://localhost:3306/prueba");
        datasource.setUsername("root");
        datasource.setPassword("");
        
        return datasource;
    }
}
