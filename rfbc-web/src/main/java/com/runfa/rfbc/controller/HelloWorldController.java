package com.runfa.rfbc.controller;

import com.runfa.rfbc.demo.Trader;
import com.runfa.rfbc.demo.Transaction;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toList;

@Controller
public class HelloWorldController {
        @GetMapping("/hello")
        public String sayHello() {

            return "index";
        }
}
