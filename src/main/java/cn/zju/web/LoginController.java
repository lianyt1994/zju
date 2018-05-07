package cn.zju.web;

import cn.zju.service.LoginService;
import cn.zju.utils.JedisUtils;
import cn.zju.utils.SessionUtils;
import org.apache.curator.framework.recipes.leader.LeaderSelector;
import org.apache.http.HttpResponse;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Controller
@RequestMapping(value = "/")
public class LoginController {

    @Autowired
    private LoginService loginService;

    @RequestMapping(value = "/login/login")
    public String goToLogin() {
        return "login/login";
    }

    @RequestMapping(value = "login/checkLogin")
    public String checkLogin(String returnUrl, HttpServletResponse response, String userName, String passWord, Model model) {
        Boolean result = loginService.checkUser(userName, passWord);
        if (result) {
            Cookie cookie = new Cookie("zjuUserName", userName);
            cookie.setMaxAge(-1);
            cookie.setPath("/");
            response.addCookie(cookie);
            if (returnUrl != null && returnUrl != "")
                return "redirect:" + returnUrl;
            else return "redirect:/buyGoods/buyGoods";
        }
        model.addAttribute("result", result);
        return "/login/login";
    }

    @RequestMapping(value = "/login/register")
    public String loginRegister(@RequestParam("userName") String userName, @RequestParam("passWord") String passWord, Model model) {
        Boolean aBoolean = loginService.insertNewUser(userName, passWord);
        if (!aBoolean) {
            model.addAttribute("result", aBoolean);
            return "login/register";
        } else return "/login/login";

    }

    @RequestMapping(value = "/login/gotoRegister")
    public String gotoRegister() {
        return "login/register";
    }

    @RequestMapping(value = "/login/userConfirm")
    public void userConfirm(@RequestParam("userName") String userName, HttpServletResponse response) {
        Boolean aBoolean = loginService.selectUserByName(userName);
        if (aBoolean) {
            JSONObject jsonObject = new JSONObject();
            jsonObject.put("userName", userName);
            response.setContentType("application/json;charset=UTF-8");
            try {
                response.getWriter().write(jsonObject.toString());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    @RequestMapping(value = "/login/singleLogin")
    public void singleLogin(HttpServletResponse response, HttpServletRequest request) {
        String sessionId = SessionUtils.getSessionId(request, response);
        Integer result = null;
        JSONObject jsonObject = new JSONObject();
        if (sessionId != null) {
            result = 1;
            jsonObject.put("userName",sessionId);
        } else {
            result = 0;
        }
        jsonObject.put("result", result);
        response.setContentType("application/json;charset=UTF-8");
        try {
            response.getWriter().write(jsonObject.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }

        /*String id = JedisUtils.getJedis().get("loginUser:" + userName);
        if (null != id){
            JSONObject jsonObject = new JSONObject();
            jsonObject.put("userName",userName);
            response.setContentType("application/json;charset=UTF-8");
            try {
                response.getWriter().write(jsonObject.toString());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }*/
    }

    @RequestMapping(value = "/login/layout")
    public String layout(HttpServletResponse response, HttpServletRequest request) {
        String userName = SessionUtils.getSessionId(request, response);
        JedisUtils.getJedis().del("loginUser:" + userName);
        return "/login/login";
    }

}
