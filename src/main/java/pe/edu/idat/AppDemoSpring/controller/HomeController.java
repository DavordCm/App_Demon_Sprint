package pe.edu.idat.AppDemoSpring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/Inicio")
    public String home(){
        return "Home";
    }
}
