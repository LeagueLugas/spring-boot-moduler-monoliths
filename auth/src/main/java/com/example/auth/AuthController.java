package com.example.auth;

import com.example.common.context.beans.Published;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/auth")
@RestController
@Published
public class AuthController {

    @GetMapping
    public String auth() {
        return "Now, you authenticated!!";
    }

}
