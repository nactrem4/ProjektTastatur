package com.Webtech.Mertcan.demo.service;

import com.Webtech.Mertcan.demo.Web.api.Keyboard;
import com.Webtech.Mertcan.demo.persistence.KeyboardEntity;
import org.springframework.stereotype.Service;

@Service
public class KeyboardTransformer{

  public Keyboard transformEntity(KeyboardEntity keyboardEntity) {
        return new Keyboard(
                keyboardEntity.getId(),
                keyboardEntity.getKeyboardName(),
                keyboardEntity.getKeyboardBeschreibung(),
                keyboardEntity.getKeyboardPreis()
        );
    }
}
