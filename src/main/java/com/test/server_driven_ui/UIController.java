package com.test.server_driven_ui;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.LinkedHashMap;

@RestController
@RequestMapping("api/v1")
public class UIController {

    @GetMapping("/ui")
    public ResponseEntity<?> getUI(){
//        ExampleLayout exampleLayout1 = new ExampleLayout(
//                "TextView",
//                "300dp",
//                "300dp",
//                "@{username}"
//
//        );
//
//        ExampleData exampleData1 = new ExampleData(
//                "saurav"
//        );

        LinkedHashMap<String,String> exampleLayout = new LinkedHashMap<>();
        exampleLayout.put("type","TextView");
        exampleLayout.put("layout_width","match_parent");
        exampleLayout.put("layout_height","wrap_content");
        exampleLayout.put("text","@{username}");
//        exampleLayout.put("singleLine","@bool/true");
        exampleLayout.put("gravity","center");
        exampleLayout.put("textColor","#ff0000");

        LinkedHashMap<String,String> exampleData = new LinkedHashMap<>();
        exampleData.put("username","saurav");

        return new ResponseEntity<Response>(new Response(exampleLayout, exampleData), HttpStatus.OK);
    }
}
