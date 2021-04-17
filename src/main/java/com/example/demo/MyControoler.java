package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MyControoler {

    @Autowired
    private PizzaAction pizzaAction;

    @GetMapping(path = "/add")
    public @ResponseBody String add(@RequestParam String name,
                                    @RequestParam String who,
                                    @RequestParam Integer size) {
        Pizza pizza = new Pizza();
        pizza.setName(name);
        pizza.setMaker(who);
        pizza.setSize(size);
        pizzaAction.save(pizza);
        return "Saved pizza!!!";
    }

    @GetMapping(path = "/all")
    public @ResponseBody Iterable<Pizza> getAll() {
        return pizzaAction.findAll();
    }
}
