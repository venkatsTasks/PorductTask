package com.agilisium.task.Productdetails.model;

public class Dbconfig {
    private String dataSourceURL;
    private String dbUserName;
    private String dbPassword;
    private String dbDriver;

    public Dbconfig(String dataSourceURL, String dbUserName, String dbPassword, String dbDriver) {
        this.dataSourceURL = dataSourceURL;
        this.dbUserName = dbUserName;
        this.dbPassword = dbPassword;
        this.dbDriver = dbDriver;
    }

    public String getDataSourceURL() {
        return dataSourceURL;
    }

    public void setDataSourceURL(String dataSourceURL) {
        this.dataSourceURL = dataSourceURL;
    }

    public String getDbUserName() {
        return dbUserName;
    }

    public void setDbUserName(String dbUserName) {
        this.dbUserName = dbUserName;
    }

    public String getDbPassword() {
        return dbPassword;
    }

    public void setDbPassword(String dbPassword) {
        this.dbPassword = dbPassword;
    }

    public String getDbDriver() {
        return dbDriver;
    }

    public void setDbDriver(String dbDriver) {
        this.dbDriver = dbDriver;
    }

    @Override
    public String toString() {
        return "Dbconfig{" +
                "dataSourceURL='" + dataSourceURL + '\'' +
                ", dbUserName='" + dbUserName + '\'' +
                ", dbPassword='" + dbPassword + '\'' +
                ", dbDriver='" + dbDriver + '\'' +
                '}';
    }
}
