/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 * Represents an Indianapolis 500 winner's information.
 * 
 * @author Han
 */
public class IndyWinner {
    private int year;
    private String driver;
    private double averageSpeed;
    private String country;

    /**
     * Constructs an IndyWinner instance with the given details.
     *
     * @param year The year of the race.
     * @param driver The name of the winning driver.
     * @param averageSpeed The average speed during the race.
     * @param country The country of the winning driver.
     */
    public IndyWinner(int year, String driver, double averageSpeed, String country) {
        this.year = year;
        this.driver = driver;
        this.averageSpeed = averageSpeed;
        this.country = country;
    }

    public int getYear() { return year; }

    public String getDriver() { return driver; }

    public double getAverageSpeed() { return averageSpeed; }

    public String getCountry() { return country; }
}