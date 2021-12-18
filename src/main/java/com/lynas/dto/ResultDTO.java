package com.lynas.dto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "result")
@XmlAccessorType(XmlAccessType.FIELD)
public class ResultDTO {
    private String name;
    private double run100Meter;
    private double longJump;
    private double shotPut;
    private double highJump;
    private double run400Meter;
    private double hurdles110Metres;
    private double discusThrow;
    private double poleVault;
    private double javelinThrow;
    private double run1500Meter;
    private Double totalScore;
    private String place;

    public ResultDTO() {
    }

    public ResultDTO(String name, double run100Meter, double longJump, double shotPut, double highJump,
                  double run400Meter, double hurdles110Metres, double discusThrow, double poleVault,
                  double javelinThrow, double run1500Meter) {
        this.name = name;
        this.run100Meter = run100Meter;
        this.longJump = longJump;
        this.shotPut = shotPut;
        this.highJump = highJump;
        this.run400Meter = run400Meter;
        this.hurdles110Metres = hurdles110Metres;
        this.discusThrow = discusThrow;
        this.poleVault = poleVault;
        this.javelinThrow = javelinThrow;
        this.run1500Meter = run1500Meter;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getRun100Meter() {
        return run100Meter;
    }

    public void setRun100Meter(double run100Meter) {
        this.run100Meter = run100Meter;
    }

    public double getLongJump() {
        return longJump;
    }

    public void setLongJump(double longJump) {
        this.longJump = longJump;
    }

    public double getShotPut() {
        return shotPut;
    }

    public void setShotPut(double shotPut) {
        this.shotPut = shotPut;
    }

    public double getHighJump() {
        return highJump;
    }

    public void setHighJump(double highJump) {
        this.highJump = highJump;
    }

    public double getRun400Meter() {
        return run400Meter;
    }

    public void setRun400Meter(double run400Meter) {
        this.run400Meter = run400Meter;
    }

    public double getHurdles110Metres() {
        return hurdles110Metres;
    }

    public void setHurdles110Metres(double hurdles110Metres) {
        this.hurdles110Metres = hurdles110Metres;
    }

    public double getDiscusThrow() {
        return discusThrow;
    }

    public void setDiscusThrow(double discusThrow) {
        this.discusThrow = discusThrow;
    }

    public double getPoleVault() {
        return poleVault;
    }

    public void setPoleVault(double poleVault) {
        this.poleVault = poleVault;
    }

    public double getJavelinThrow() {
        return javelinThrow;
    }

    public void setJavelinThrow(double javelinThrow) {
        this.javelinThrow = javelinThrow;
    }

    public double getRun1500Meter() {
        return run1500Meter;
    }

    public void setRun1500Meter(double run1500Meter) {
        this.run1500Meter = run1500Meter;
    }

    public Double getTotalScore() {
        return totalScore;
    }

    public void setTotalScore(Double totalScore) {
        this.totalScore = totalScore;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    @Override
    public String toString() {
        return "Result{" +
                "name='" + name + '\'' +
                ", run100Meter=" + run100Meter +
                ", longJump=" + longJump +
                ", shotPut=" + shotPut +
                ", highJump=" + highJump +
                ", run400Meter=" + run400Meter +
                ", hurdles110Metres=" + hurdles110Metres +
                ", discusThrow=" + discusThrow +
                ", poleVault=" + poleVault +
                ", javelinThrow=" + javelinThrow +
                ", run1500Meter=" + run1500Meter +
                ", totalScore=" + totalScore +
                ", place='" + place + '\'' +
                '}';
    }
}
