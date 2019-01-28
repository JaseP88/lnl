package lnl.boxing.demo.controllers;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import lnl.boxing.demo.models.Greeting;

@RestController
class SimpleController {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping("/greeting")
    @CrossOrigin
    public ResponseEntity<Greeting> greeting(@RequestParam(value="name", defaultValue="Bee") String name) {
        System.out.println("------------------------------------CONTROLLER------------------------------------");
        Greeting greeting = new Greeting(counter.incrementAndGet(), String.format(template, name));
        // return greeting;
        return ResponseEntity.ok()
        .header("Access-Control-Allow-Methods", "GET, POST, DELETE, PUT, OPTION")
        .body(greeting);
    }
}