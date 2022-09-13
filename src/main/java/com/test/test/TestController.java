package com.test.test;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import java.net.Inet4Address;
import java.net.UnknownHostException;

@Controller
public class TestController {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String home(Model model) throws UnknownHostException {
        String hostAddress = Inet4Address.getLocalHost().getHostAddress();
        String lastAddress = hostAddress.split("\\.")[3];

        model.addAttribute("index", "hello world !!!");
        model.addAttribute("hostAddress", lastAddress);

        return "index";
    }
}
