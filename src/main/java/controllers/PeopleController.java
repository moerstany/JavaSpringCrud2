package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/people")
public class PeopleController {

    @GetMapping
    public String index(Model model){
        //получаем всех людей из базы
        return null;
    }

    @GetMapping("/{id}")
    public String show(@PathVariable("id")int id, Model model){
        //получим 1 человека по id из базы
        return null;
    }
}
