package com.house.wym.controller;

import okhttp3.*;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: 刘浩然
 * @Date: 2021/2/3 14:02
 */
//@Controller
@RestController
public class loginController {
    //得到 openid
    @RequestMapping("/login")
    public String toOrderPage(@RequestParam(name = "code") String code)
    {
        String url = "https://api.weixin.qq.com/sns/jscode2session?appid=wxf97243092285bd2c&secret=378106c6f58b06345f772fbcf74b4ba9&js_code="
                + code +"&grant_type=authorization_code";

        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder()
                .url(url)
                .build();
        try (Response response = client.newCall(request).execute()) {
            String string = response.body().string();
            System.out.println("###########################"+string);
            String token = string.split(":")[2].split("}")[0];
            System.out.println("###########################"+token);
            return token;
        } catch (Exception e) {
             System.out.println("get code error");
        }
        return " ";
    }
}
