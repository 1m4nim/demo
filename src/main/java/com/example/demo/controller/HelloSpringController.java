// package com.example.demo.controller;

// import org.springframework.stereotype.Controller;
// import org.springframework.web.bind.annotation.GetMapping;
// //import org.springframework.web.bind.annotation.RequestParam;

// @Controller
// public class HelloSpringController {

//     @GetMapping("/hello")
//     // public String getMethodName(@RequestParam String param) {
//     //     return new String();
//     // }

//     public String hello(){
//         //HTMLテンプレートにhello-spring.htmlを指定
//         return "hello-spring";
//     }
// }

package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloSpringController {

    /**
     * http://localhost:8080/hello にアクセスした時に実行される
     */
    @GetMapping("/hello")
    public String hello() {
        // templates/hello-spring.html を探しに行く
        return "hello-spring";
    }
}