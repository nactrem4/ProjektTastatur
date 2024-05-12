package com.Webtech.Mertcan.demo.Web.api;

public class Keyboard {

    private long id;
    private String keyboardName;
    private String keyboardBeschreibung;
    private Integer keyboardPreis;

    public Keyboard(long id, String keyboardName, String keyboardBeschreibung, Integer keyboardPreis){
        this.id = id;
        this.keyboardName = keyboardName;
        this.keyboardBeschreibung = keyboardBeschreibung;
        this.keyboardPreis = keyboardPreis;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getKeyboardName() {
        return keyboardName;
    }

    public void setKeyboardName(String keyboardName) {
        this.keyboardName = keyboardName;
    }

    public String getKeyboardBeschreibung() {
        return keyboardBeschreibung;
    }

    public void setKeyboardBeschreibung(String keyboardBeschreibung) {
        this.keyboardBeschreibung = keyboardBeschreibung;
    }

    public Integer getKeyboardPreis() {
        return keyboardPreis;
    }

    public void setKeyboardPreis(Integer keyboardPreis) {
        this.keyboardPreis = keyboardPreis;
    }
}
