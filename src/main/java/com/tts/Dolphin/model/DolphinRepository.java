package com.tts.Dolphin.model;
import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DolphinRepository extends CrudRepository<Dolphin, Long> {
    List<Dolphin> findAll();
}