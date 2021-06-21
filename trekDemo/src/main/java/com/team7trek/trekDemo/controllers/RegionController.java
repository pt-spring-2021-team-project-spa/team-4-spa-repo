package com.team7trek.trekDemo.controllers;

import com.team7trek.trekDemo.models.Region;
import com.team7trek.trekDemo.repositories.RegionRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import javax.annotation.Resource;
import java.util.Optional;



import com.team7trek.trekDemo.repositories.RegionRepository;
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

    @GetMapping("regions/{title}")
    public String displayRegionById(@PathVariable String title, Model model) {
        Optional<Region> retrievedRegion = regionRepo.findByTitle(title);
        Region region = retrievedRegion.get();
        model.addAttribute("region",region);
        return "regionView";
    }
}

}

