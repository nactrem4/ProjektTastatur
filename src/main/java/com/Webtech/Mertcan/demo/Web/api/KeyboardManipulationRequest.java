package com.Webtech.Mertcan.demo.Web.api;

public class KeyboardManipulationRequest {

    private String keyboardName;
    private String keyboardBeschreibung;
    private Integer keyboardPreis;

    public KeyboardManipulationRequest(String keyboardName, String keyboardBeschreibung, Integer keyboardPreis) {
        this.keyboardName = keyboardName;
        this.keyboardBeschreibung = keyboardBeschreibung;
        this.keyboardPreis = keyboardPreis;
    }
    public KeyboardManipulationRequest() {}

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
