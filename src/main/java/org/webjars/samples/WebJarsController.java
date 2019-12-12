package org.webjars.samples;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class WebJarsController {

    @GetMapping("/")
    public String welcome() {
        return "index";
    }
}
