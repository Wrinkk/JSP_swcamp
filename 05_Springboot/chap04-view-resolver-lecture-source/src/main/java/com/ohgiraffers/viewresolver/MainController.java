package com.ohgiraffers.viewresolver;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/*")       //  '/' 도메인과 상관없이 첫번째 경로상의 depth를 처리해주는 컨트롤러
public class MainController {

    /* 설명.
     *  ViewResolver인터페이스를 구현한 ThymeleafViewResolver가 현재 처리하게 된다.
     *  접두사(prefix): resources/templates/
     *  접미사(suffix): .html
     *  핸들러 메소드가 반환하는 String 값 앞 뒤에 접두사와 접미사가 붙어 view를 찾게 된다.
    * */
    @RequestMapping(value = {"/","/main"})
    public String main() {
        return "main";
    }
}
