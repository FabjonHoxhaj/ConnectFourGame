package com.ConnectFour.ConnectFourGame.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import com.ConnectFour.ConnectFourGame.service.ConnectFourService;
import org.springframework.ui.Model;

@Controller
public class ConnectFourController {

    @Autowired
    private ConnectFourService connectFourService;

    @GetMapping()
    public String indexHTML() {
        return "index";
    }

    @PostMapping()
    public String makeMove(@RequestBody String column) {
        return "test";
    }

}
