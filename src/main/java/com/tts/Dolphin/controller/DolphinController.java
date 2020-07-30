package com.tts.Dolphin.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.tts.Dolphin.model.Dolphin;
import com.tts.Dolphin.service.DolphinService;


@Controller
public class DolphinController {
    
	@Autowired
    private DolphinService dolphinService;

    @GetMapping(value = {"/"})
    public String getIndex(Model model) {
        List<Dolphin> dolphinList = dolphinService.findAll();
        model.addAttribute("dolphinList", dolphinList);
        return "index";
    }

    @GetMapping(value = {"/dolphins"})
    public String getdolphin(Model model) {
        List<Dolphin> dolphinList = dolphinService.findAll();
        model.addAttribute("dolphinList", dolphinList);
        return "dolphins";
    }

    @GetMapping(value = {"/name"})
    public String getdolphinForm(Model model) {
        model.addAttribute("dolphin", new Dolphin());
        return "name";
    }

    @PostMapping(value = "/dolphins")
    public String postdolphin(Dolphin dolphin, Model model) {
        dolphinService.save(dolphin);
        model.addAttribute("dolphin", new Dolphin());
        return "dolphins";
    }
}



