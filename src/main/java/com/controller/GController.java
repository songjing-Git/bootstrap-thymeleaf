package com.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@Slf4j
public class GController {

    @RequestMapping("InterCommend")
    public String InterCommend(){
        return "/functionMenu/personmgr/intercommend/InterCommend";
    }
}
