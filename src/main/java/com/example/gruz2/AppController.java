package com.example.gruz2;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AppController {

    @Autowired
    private GruzService gruzService;

    @RequestMapping("/")
    public String viewHomePage(Model model, @Param("keyword") String keyword) {
        List<Gruz> listGruz = gruzService.listAll(keyword);
        model.addAttribute("listGruz", listGruz);
        model.addAttribute("keyword", keyword);
        model.addAttribute("stat", gruzService.stat());
        return "index";
    }

    @RequestMapping("/add")
    public String showNewGruzForm(Model model) {
        Gruz gruz = new Gruz();
        model.addAttribute("gruz", gruz);
        return "add_gruz";
    }

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public String saveGruz(@ModelAttribute("gruz") Gruz gruz) {
        gruzService.save(gruz);
        return "redirect:/";
    }

    @RequestMapping("/edit/{id}")
    public ModelAndView showEditGruzForm(@PathVariable(name = "id") Long id) {
        ModelAndView mav = new ModelAndView("edit_gruz");
        Gruz gruz = gruzService.get(id);
        mav.addObject("gruz", gruz);
        return mav;
    }

    @RequestMapping("/delete/{id}")
    public String deleteПкгя(@PathVariable(name = "id") Long id) {
        gruzService.delete(id);
        return "redirect:/";
    }
}

