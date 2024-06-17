package com.Webtech.Mertcan.demo.Web.api;

public class Switch {

    private long id;
    private String switchName;
    private String switchBeschreibung;
    private Integer switchPreis;

    public Switch(long id, String switchName, String switchBeschreibung, Integer switchPreis){
        this.id = id;
        this.switchName = switchName;
        this.switchBeschreibung = switchBeschreibung;
        this.switchPreis = switchPreis;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getSwitchName() {
        return switchName;
    }

    public void setSwitchName(String switchName) {
        this.switchName = switchName;
    }

    public String getSwitchBeschreibung() {
        return switchBeschreibung;
    }

    public void setSwitchBeschreibung(String switchBeschreibung) {
        this.switchBeschreibung = switchBeschreibung;
    }

    public Integer getSwitchPreis() {
        return switchPreis;
    }

    public void setSwitchPreis(Integer switchPreis) {
        this.switchPreis = switchPreis;
    }
}
