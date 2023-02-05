package dao;

import models.Buyers;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

import java.util.ArrayList;
import java.util.List;
@Component
public class BuyersDao {
    private List <Buyers> buyers;
    {
        buyers = new ArrayList<>();
        buyers.add(new Buyers(1,"Никита","Орлов","23@ya.ru","Владимир","Россия"));
        buyers.add(new Buyers(2,"Юлия","Мельникова","25@ya.ru","Сочи","Россия"));
    }

    public List<Buyers> index() {
        return buyers;
    }
    public Buyers show (int id){
        return buyers.stream().filter(buyers -> buyers.getId()==id).findAny().orElse(null);
    }
}
