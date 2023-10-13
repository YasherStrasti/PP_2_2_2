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
        if (count == null) {
            model.addAttribute("carsList", carServiceImpl.getAllCars());
        } else {
            model.addAttribute("carsList", carServiceImpl.getCars(count));
        }
        System.out.println(count);
        return "/cars";
    }
}
