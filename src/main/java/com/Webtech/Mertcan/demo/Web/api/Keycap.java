package com.Webtech.Mertcan.demo.Web.api;

public class Keycap {
    private long id;
    private String keycapName;
    private String keycapBeschreibung;
    private Integer keycapPreis;

    public Keycap(long id, String keycapName, String keycapBeschreibung, Integer keycapPreis){
        this.id = id;
        this.keycapName = keycapName;
        this.keycapBeschreibung = keycapBeschreibung;
        this.keycapPreis = keycapPreis;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getKeycapName() {
        return keycapName;
    }

    public void setKeycapName(String keycapName) {
        this.keycapName = keycapName;
    }

    public String getKeycapBeschreibung() {
        return keycapBeschreibung;
    }

    public void setKeycapBeschreibung(String keycapBeschreibung) {
        this.keycapBeschreibung = keycapBeschreibung;
    }

    public Integer getKeycapPreis() {
        return keycapPreis;
    }

    public void setKeycapPreis(Integer keycapPreis) {
        this.keycapPreis = keycapPreis;
    }
}
