package com.sf298.phototrove.controller;

import com.sf298.phototrove.repository.ChangesRepository;
import com.sf298.phototrove.service.ChangesService;
import lombok.val;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/cars")
public class TestController {

    @Value("${access.password}")
    public String pword;

    @Autowired
    public ChangesService changesService;

    @GetMapping("/test")
    public String test1() {
        return "Hello World!";
    }

    @GetMapping(value = "/{name}")
    public String init(@PathVariable("name") String name, Model model) {
        System.out.println(pword);
        model.addAttribute("name", name);

        val changes = changesService.findAll();
        model.addAttribute("changes", changes);
        return "car-page";
    }

}
