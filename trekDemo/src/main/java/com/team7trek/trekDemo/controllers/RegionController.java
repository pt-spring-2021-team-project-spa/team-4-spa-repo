package com.team7trek.trekDemo.controllers;


import com.team7trek.trekDemo.RegionRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

@Controller
public class RegionController {
    @Resource
    private RegionRepository regionRepo;

    @RequestMapping("/regions")
    public String displayRegion(Model model) {
        model.addAttribute("regions", regionRepo.findAll());
        return "regionsView";
    }
}
