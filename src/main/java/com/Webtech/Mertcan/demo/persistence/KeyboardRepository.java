package com.Webtech.Mertcan.demo.persistence;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface KeyboardRepository  extends JpaRepository<KeyboardEntity, Long> {

    List<KeyboardEntity> findAllByKeyboardName(String firstName);

}
