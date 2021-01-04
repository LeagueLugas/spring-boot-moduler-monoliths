package com.example.order;

import com.example.common.context.beans.Published;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/order")
@RestController
public class OrderController {

    @GetMapping
    public String order() {
        return "ordered!";
    }
}
