package top.vae1970.weibo.controller;

import com.alibaba.fastjson.JSONObject;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/login")
public class LoginController {

    @RequestMapping("")
    public Object login() {
        JSONObject a = new JSONObject();
        a.put("data","success1");
        return a;
    }

}
