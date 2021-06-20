package com.team7trek.trekDemo.controllers;
import com.team7trek.trekDemo.models.Trek;
import com.team7trek.trekDemo.repositories.TrekRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import javax.annotation.Resource;
import java.util.Optional;
@Controller
public class TrekController {
    @Resource
    private TrekRepository trekRepo;
    @RequestMapping("/treks")
    public String displayTreks(Model model) {
        model.addAttribute("treks", trekRepo.findAll());
        return "treksView";
    }
    @GetMapping("trek/{title}")
    public String displayTrekByTitle(@PathVariable String title, Model model) {
        Optional<Trek> retrievedTrek = trekRepo.findByTitle(title);
        Trek trek = retrievedTrek.get();
        model.addAttribute("trek", trek);
        return "trekView";
    }
}