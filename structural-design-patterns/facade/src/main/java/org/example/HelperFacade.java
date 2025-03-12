package org.example;

import java.sql.Connection;

public class HelperFacade {

    public static enum DBType {
        MYSQL,
        ORACLE
    }

    public static enum ReportType {
        HTML,
        PDF
    }

    public static void generateReport(DBType dbType, ReportType reportType, String tableName) {

        Connection connection = null;

        switch (dbType) {
            case MYSQL:
                connection = MySqlHelper.getMySqlConnection();
                MySqlHelper mySqlHelper = new MySqlHelper();
                switch (reportType) {
                    case HTML:
                        mySqlHelper.generateSqlHTMLReport(tableName, connection);
                        break;
                    case PDF:
                        mySqlHelper.generateSqlPDFReport(tableName, connection);
                        break;
                }
                break;
            case ORACLE:
                connection = OracleHelper.getOracleConnection();
                OracleHelper oracleHelper = new OracleHelper();
                switch (reportType) {
                    case HTML:
                        oracleHelper.generateOracleHTMLReport(tableName, connection);
                        break;
                    case PDF:
                        oracleHelper.generateOraclePDFReport(tableName, connection);
                        break;
                }
                break;
        }
    }
}
