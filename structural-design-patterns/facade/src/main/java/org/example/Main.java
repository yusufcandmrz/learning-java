package org.example;

import java.sql.Connection;

public class Main {
    public static void main(String[] args) {
        /*
        MySqlHelper mySqlHelper = new MySqlHelper();
        Connection mySqlConnection = MySqlHelper.getMySqlConnection();
        mySqlHelper.generateSqlHTMLReport("users", mySqlConnection);

        OracleHelper oracleHelper = new OracleHelper();
        Connection oracleConnection = OracleHelper.getOracleConnection();
        oracleHelper.generateOraclePDFReport("users", oracleConnection);
        */

        HelperFacade.generateReport(HelperFacade.DBType.MYSQL, HelperFacade.ReportType.HTML, "users");
        HelperFacade.generateReport(HelperFacade.DBType.ORACLE, HelperFacade.ReportType.PDF, "users");
    }
}