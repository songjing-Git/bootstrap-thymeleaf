package com.controller.functionMenu.personnelMgr;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@Slf4j
public class persController {

    /**
     * 内部推荐
     * @return
     */
    @RequestMapping("/InternalRecommendation")
    public String InternalRecommendation(){
        return "functionMenu/personnelMgr/InternalRecommendation";
    }

    /**
     * 内部调动
     * @return
     */
    @RequestMapping("/innerMobilization")
    public String InternalReferral(){
        return "functionMenu/personnelMgr/laborRelation/innerMobilization";
    }


    /**
     * 劳动关系
     * @return
     */
    @RequestMapping("/laborRelation")
    public String innerMobilization(){
        return "functionMenu/laborRelation";
    }

    @RequestMapping("/success")
    public String success(){
        log.debug("=========success");
        return "functionMenu/personnelMgr/laborRelation/innerMobilization";
    }
}
