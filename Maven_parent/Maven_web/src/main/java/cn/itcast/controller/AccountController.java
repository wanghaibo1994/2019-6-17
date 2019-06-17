package cn.itcast.controller;


import cn.itcast.domain.Account;
import cn.itcast.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;


import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@Controller
@RequestMapping("/account")
public class AccountController {
    @Autowired
    private AccountService accountService;

    @RequestMapping("/findAll")
    public String findAll(Model model){
        List<Account> list = accountService.findAll();
        model.addAttribute("list",list);
        return "list";
    }

    /*@RequestMapping("login")
    public void login(String username, String password){
        System.out.println(username+" : "+password);

    }*/

    @RequestMapping("/login")
    public void login(String username, String password, HttpServletRequest request, HttpServletResponse response){
        response.setContentType("text/html;charset=utf-8");
        try {
            if (username.equals("zhangsan")){
                if (password.equals("123")){
                    response.sendRedirect(request.getContextPath()+"/account/findAll");
                }else {
                    response.getWriter().write("密码错误");
                }
            }else {
                response.getWriter().write("账户错误");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @RequestMapping(value = "/testAjax",
            method = RequestMethod.POST, produces = "application/json;charset=UTF-8",
            consumes = "application/x-www-form-urlencoded;charset=UTF-8")
    @ResponseBody
    public Account testAjax(Account account){
        System.out.println(account);
        return account;
    }
}
