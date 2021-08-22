package com.example.todolist;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class DemoController {

    @Autowired
    UserRepository repos;


    @GetMapping
    public ModelAndView getadd(@ModelAttribute("formModel") List lists, ModelAndView mav) {

        Iterable<List> list = repos.findAll();
        mav.addObject("data", list);
        mav.setViewName("home");
        return mav;
    }

    @PostMapping
    @Transactional(readOnly = false)
    public ModelAndView postadd(@ModelAttribute("formModel") List list, ModelAndView mav) {

        repos.saveAndFlush(list);
        return new ModelAndView("redirect:/");
    }
}
