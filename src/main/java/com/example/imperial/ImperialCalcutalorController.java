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

    @RequestMapping("/Orange")
    public String Orange(String blue){
        return a.Orange(blue);
    }

    @RequestMapping("/Yellow")
    public String Yellow(String purple){
        return a.Yellow(purple);
    }
   @RequestMapping("/Purple")
    public String Purple(String yellow){
        return a.Purple(yellow);
   }
}
