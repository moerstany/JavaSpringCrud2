package controllers;

import dao.BuyersDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/buyers")
public class PeopleController {
    private final BuyersDao buyersDao;
    @Autowired
    public PeopleController(BuyersDao buyersDao) {
        this.buyersDao = buyersDao;
    }

    @GetMapping
    public String index(Model model){
        //получаем всех людей из базы
        model.addAttribute("webapp", buyersDao.index());
        return "webapp/index";
    }

    @GetMapping("/{id}")
    public String show(@PathVariable("id")int id, Model model){
        //получим 1 человека по id из базы
        model.addAttribute("webapp", buyersDao.show(id));
        return "webapp/show";
    }
}
