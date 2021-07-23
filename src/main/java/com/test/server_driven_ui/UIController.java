package com.test.server_driven_ui;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1")
public class UIController {

    @GetMapping("/ui")
    public ResponseEntity<?> getUI(){
        ExampleLayout exampleLayout = new ExampleLayout(
                "TextView",
                "300dp",
                "300dp",
                "@{username}"
        );

        ExampleData exampleData = new ExampleData(
                "saurav"
        );

        return new ResponseEntity<Response>(new Response(exampleLayout, exampleData), HttpStatus.OK);
    }
}
