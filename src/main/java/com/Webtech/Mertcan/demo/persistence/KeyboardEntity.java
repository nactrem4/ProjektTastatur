package com.Webtech.Mertcan.demo.persistence;


import jakarta.persistence.*;

@Entity(name = "keyboards")
public class KeyboardEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;

    @Column(name = "keyboard_name")
    private String keyboardName;

    @Column(name = "keyboard_beschreibung")
    private String keyboardBeschreibung;

    @Column(name = "keyboard_preis")
    private Integer keyboardPreis;

    public KeyboardEntity(String keyboardName, String keyboardBeschreibung, Integer keyboardPreis) {
        this.keyboardName = keyboardName;
        this.keyboardBeschreibung = keyboardBeschreibung;
        this.keyboardPreis = keyboardPreis;
    }

    protected KeyboardEntity(){}

    public long getId() {
        return id;
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
