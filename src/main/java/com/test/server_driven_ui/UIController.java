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



        //text view 1
        LinkedHashMap<String,Object> exampleTextView = new LinkedHashMap<>();
        exampleTextView.put("type","TextView");
        exampleTextView.put("layout_width","match_parent");
        exampleTextView.put("layout_height","wrap_content");
        exampleTextView.put("text","@{username}");
        exampleTextView.put("gravity","center");
        exampleTextView.put("textColor","#ff0000");
        exampleTextView.put("elevation","4dp");

        //text view 2 which is to be below text view 1
        LinkedHashMap<String,Object> exampleTextView2 = new LinkedHashMap<>();
        exampleTextView2.put("type","TextView");
        exampleTextView2.put("layout_width","match_parent");
        exampleTextView2.put("layout_height","wrap_content");
        exampleTextView2.put("text","@{userlastname}");
        exampleTextView2.put("gravity","center");
        exampleTextView2.put("textColor","#ff0000");
        exampleTextView2.put("elevation","4dp");

        //text view 1 and 2 grouped as list of hashmap to be used in inner layout
        List<LinkedHashMap<String,Object>> childrenList = new ArrayList<>();

        //text view 1 and 2 add gareko
        childrenList.add(exampleTextView);
        childrenList.add(exampleTextView2);

        // inner layout hashmap ///list nabanai kana chadaina raixa
        List<LinkedHashMap<String,Object>> childrenLayoutList = new ArrayList<>();

        //inner layout green color wala
        LinkedHashMap<String,Object> exampleLayout2 = new LinkedHashMap<>();
        exampleLayout2.put("type","LinearLayout");
        exampleLayout2.put("layout_width","400dp");
        exampleLayout2.put("layout_height","200dp");
        exampleLayout2.put("background","#00FF11");
        exampleLayout2.put("orientation","vertical");
        exampleLayout2.put("layout_marginTop","32dp");
        exampleLayout2.put("layout_gravity","center");
        exampleLayout2.put("children",childrenList);

        //adding inner layout in list of hashmap ///again, hashmap ko list nabanaikana chalena
        childrenLayoutList.add(exampleLayout2);

        //root layout which contains inner layout and inner layout contains two textview
        LinkedHashMap<String,Object> exampleLayout = new LinkedHashMap<>();
        exampleLayout.put("type","LinearLayout");
        exampleLayout.put("layout_width","match_parent");
        exampleLayout.put("layout_height","match_parent");
        exampleLayout.put("background","#0088FF");
        exampleLayout.put("orientation","vertical");
        exampleLayout.put("children",childrenLayoutList);


        //data wala hashmap
        LinkedHashMap<String,String> exampleData = new LinkedHashMap<>();
        exampleData.put("username","saurav");
        exampleData.put("userlastname","munankarmi");

        return new ResponseEntity<Response>(new Response(exampleLayout, exampleData), HttpStatus.OK);
    }
}
