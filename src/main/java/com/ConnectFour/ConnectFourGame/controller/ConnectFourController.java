package com.ConnectFour.ConnectFourGame.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import com.ConnectFour.ConnectFourGame.service.ConnectFourService;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ConnectFourController {

    @Autowired
    private ConnectFourService connectFourService;

    @GetMapping()
    public String showPlaygame(Model model) {
        model.addAttribute("currentPlayer", String.valueOf(connectFourService.getCurrentPlayer()));
        model.addAttribute("board", connectFourService.getBoard());
        model.addAttribute("invalidMove", connectFourService.getInvalidMove());
        return "index";
    }

    @PostMapping()
    public String switchPlayer(@RequestParam("column") int column) {
        connectFourService.makeMove(column);
        connectFourService.switchPlayer();
        return "redirect:/";
    }

}
