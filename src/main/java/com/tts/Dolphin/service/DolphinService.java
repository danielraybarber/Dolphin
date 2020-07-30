package com.tts.Dolphin.service;

import java.util.List;

import com.tts.Dolphin.model.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class DolphinService {
	

	    @Autowired
	    private DolphinRepository dolphinRepository;

	    @Autowired
	    public DolphinService(DolphinRepository dolphinRepository) {
	        this.dolphinRepository = dolphinRepository;
	    }

	    public List<Dolphin> findAll() {
	        List<Dolphin> dolphinList = (List<Dolphin>) dolphinRepository.findAll();
	        return dolphinList;
	    }

	    public void save(Dolphin dolphin) {
	        dolphinRepository.save(dolphin);
	    }
	    
}

