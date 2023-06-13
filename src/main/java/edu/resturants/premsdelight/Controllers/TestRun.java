package edu.resturants.premsdelight.Controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestRun {

    @RequestMapping("/display")
    public String Display()
    {
        return "<h1> This is working fine go for it 2 </h1>";
    }
}
