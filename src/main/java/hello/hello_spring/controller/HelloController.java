package hello.hello_spring.controller;

import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

// Controller 역할을 담당하는 클래스를 지정하기 위한 annotation
@Controller
public class HelloController {

    // View의 hello 기능에 반응하기 위한 annotation
    @GetMapping("hello")
    public String hello(Model model) {
        // Model 클래스는 MVC 패턴에서의 그 Model을 의미
        model.addAttribute("data", "hello!!");
        // 여기서 hello는 View에 있는 hello.html 파일을 의미함
        return "hello";
    }

    // @RequestParam은 외부(View)에서 파라미터를 받아올 때 사용
    @GetMapping("hello-mvc")
    public String helloMvc(@RequestParam("name") String name, Model model) {
        model.addAttribute("name", name);
        return "hello-template";
    }
}
