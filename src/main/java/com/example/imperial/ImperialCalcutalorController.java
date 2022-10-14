package com.example.imperial;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
@RestController

public class ImperialCalcutalorController {
    ImperialCalculator a= new ImperialCalculator();

    @RequestMapping("/Red")
    public String Red(String green) {
        return a.Red(green);
    }

}
