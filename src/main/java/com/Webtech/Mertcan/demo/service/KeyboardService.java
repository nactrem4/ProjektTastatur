package com.Webtech.Mertcan.demo.service;

import com.Webtech.Mertcan.demo.Web.api.Keyboard;
import com.Webtech.Mertcan.demo.Web.api.KeyboardManipulationRequest;
import com.Webtech.Mertcan.demo.persistence.KeyboardEntity;
import com.Webtech.Mertcan.demo.persistence.KeyboardRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class KeyboardService {

    private final KeyboardRepository keyboardRepository;
    private final KeyboardTransformer keyboardTransformer;

    public KeyboardService(KeyboardRepository keyboardRepository, KeyboardTransformer keyboardTransformer) {
        this.keyboardTransformer = keyboardTransformer;
        this.keyboardRepository = keyboardRepository;
    }


    public List<Keyboard> findAll() {
        List<KeyboardEntity> keyboards = keyboardRepository.findAll();
        return keyboards.stream()
                .map(keyboardTransformer::transformEntity)
                .collect(Collectors.toList());
    }

    public Keyboard findById(Long id) {
        var keyboardEntity = keyboardRepository.findById(id);
        return keyboardEntity.map(keyboardTransformer::transformEntity).orElse(null);
    }

    public Keyboard create(KeyboardManipulationRequest request) {
        var keyboardEntity = new KeyboardEntity(request.getKeyboardName(), request.getKeyboardBeschreibung(), request.getKeyboardPreis());
        keyboardEntity = keyboardRepository.save(keyboardEntity);
        return keyboardTransformer.transformEntity(keyboardEntity);
    }

    public Keyboard update(Long id, KeyboardManipulationRequest request) {
        var keyboardEntityOptional = keyboardRepository.findById(id);
        if (keyboardEntityOptional.isEmpty()) {
            return null;
        }

        var keyboardEntity = keyboardEntityOptional.get();
        keyboardEntity.setKeyboardName(request.getKeyboardName());
        keyboardEntity.setKeyboardBeschreibung(request.getKeyboardBeschreibung());
        keyboardEntity.setKeyboardPreis(request.getKeyboardPreis());
        keyboardEntity = keyboardRepository.save(keyboardEntity);

        return keyboardTransformer.transformEntity(keyboardEntity);
    }

    public boolean deleteById(Long id) {
        if (!keyboardRepository.existsById(id)) {
            return false;
        }

        keyboardRepository.deleteById(id);
        return true;
    }
}
