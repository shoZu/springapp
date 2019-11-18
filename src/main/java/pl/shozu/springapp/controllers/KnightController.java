package pl.shozu.springapp.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import pl.shozu.springapp.domain.Knight;
import pl.shozu.springapp.services.KnightService;

import java.util.List;


@Controller
public class KnightController {

    @Autowired
    KnightService service;

    @RequestMapping("/knights")
    public ModelAndView getKnights(){
        ModelAndView model = new ModelAndView("knights");
        List<Knight> knights = service.getKnights();
        model.addObject("knights", knights );
        return model;
    }
}
