package Entities;

import java.util.Date;

public class HourContract {
    private Date Date;
    private Double valuePerHour;
    private Integer hours;

    public HourContract(){

    }
    public HourContract(Date Date, Double valuePerHour, Integer hours){

    }

    public java.util.Date getDate() {
        return Date;
    }

    public void setDate(java.util.Date date) {
        Date = date;
    }

    public Double getValuePerHour() {
        return valuePerHour;
    }

    public void setValuePerHour(Double valuePerHour) {
        this.valuePerHour = valuePerHour;
    }

    public Integer getHours() {
        return hours;
    }

    public void setHours(Integer hours) {
        this.hours = hours;
    }
    public double totalValue(){
        return valuePerHour * hours;
    }
}
