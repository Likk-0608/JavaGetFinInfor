package test.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import test.entity.Title;
import test.service.CommonService;

import javax.persistence.criteria.CriteriaBuilder;
import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class CommonController {
    @Autowired
    public CommonService commonservice;

    @RequestMapping(value = "/", method = {RequestMethod.POST, RequestMethod.GET})
    public String login() {return "/login/login"; }

    @PostMapping(value = "/stuinforlist")
    @ResponseBody
    public Map getStuinforList(HttpServletRequest request){
//        int page = Integer.parseInt(request.getParameter("page"));
//        int pageSzie = Integer.parseInt(request.getParameter("rows"));
//        int startRecord = (page - 1)* pageSzie + 1;
        List<Title> titleList = commonservice.titleinfo();
        Map resultMap = new HashMap();
//        resultMap.put("total", 20);
        resultMap.put("rows",titleList);
        return resultMap;
    }

}
