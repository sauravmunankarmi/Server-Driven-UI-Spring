package com.test.server_driven_ui;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;

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



        LinkedHashMap<String,Object> exampleTextView = new LinkedHashMap<>();
        exampleTextView.put("type","TextView");
        exampleTextView.put("layout_width","match_parent");
        exampleTextView.put("layout_height","wrap_content");
        exampleTextView.put("text","@{username}");
//        exampleTextView.put("singleLine","@bool/true");
        exampleTextView.put("gravity","center");
        exampleTextView.put("textColor","#ff0000");
        exampleTextView.put("elevation","4dp");

        LinkedHashMap<String,Object> exampleTextView2 = new LinkedHashMap<>();
        exampleTextView2.put("type","TextView");
        exampleTextView2.put("layout_width","match_parent");
        exampleTextView2.put("layout_height","wrap_content");
        exampleTextView2.put("text","@{userlastname}");
//        exampleTextView2.put("singleLine","@bool/true");
        exampleTextView2.put("gravity","center");
        exampleTextView2.put("textColor","#ff0000");
        exampleTextView2.put("elevation","4dp");

        List<LinkedHashMap<String,Object>> childrenList = new ArrayList<>();

        childrenList.add(exampleTextView);
        childrenList.add(exampleTextView2);

        LinkedHashMap<String,Object> exampleLayout = new LinkedHashMap<>();
        exampleLayout.put("type","LinearLayout");
        exampleLayout.put("layout_width","match_parent");
        exampleLayout.put("layout_height","match_parent");
        exampleLayout.put("background","#0088FF");
        exampleLayout.put("orientation","vertical");
        exampleLayout.put("children",childrenList);



        LinkedHashMap<String,String> exampleData = new LinkedHashMap<>();
        exampleData.put("username","saurav");
        exampleData.put("userlastname","munankarmi");

        return new ResponseEntity<Response>(new Response(exampleLayout, exampleData), HttpStatus.OK);
    }
}
