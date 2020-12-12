package pl.coderslab.entity;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbUtil {

    public static final String DB_URL = "jdbc:mysql://localhost:3306/workshop2?useSSL=false&characterEncoding=utf8&serverTimezone=UTC";
    private static final String DB_USER = "root";
    private static final String DB_PASS = "coderslab";

    public static Connection getConnection() throws SQLException {

        return DriverManager.getConnection(DB_URL, DB_USER, DB_PASS);

    }


}
/*
utworzenie bazy danych

CREATE DATABASE workshop2
CHARACTER SET utf8mb4
COLLATE utf8mb4_unicode_ci;

utworzenie tabeli users
create table users (
    id int(11) primary key auto_increment,
    username varchar(255) default null,
    email varchar(255) default null unique,
    password varvhar(60) default null
)


 */