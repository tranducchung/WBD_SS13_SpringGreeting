package Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/greeting")
@Controller
public class GreetingController {
    @GetMapping
    public String greeting(){
        return "index";
    }
}
