package web.controller;

import web.service.CarServiceImpl;
import org.springframework.ui.Model;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller

public class CarsController {

    private final CarServiceImpl carServiceImpl;


    @Autowired
    public CarsController(CarServiceImpl carServiceImpl) {
        this.carServiceImpl = carServiceImpl;
    }

    @GetMapping("/cars")
    public String printCars(Model model, @RequestParam(value = "count", required = false) Integer count) {
        System.out.println(count == null);
        model.addAttribute("carsList", carServiceImpl.getCars(count));
        return "/cars";
    }
}
