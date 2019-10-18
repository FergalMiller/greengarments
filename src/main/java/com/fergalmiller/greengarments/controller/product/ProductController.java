package com.fergalmiller.greengarments.controller.product;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.google.common.collect.ImmutableMap;

@Controller
@RequestMapping(value = "/product")
public class ProductController
{

    @RequestMapping(value = "/list")
    public ModelAndView list()
    {
        return new ModelAndView("product/list");
    }

    @RequestMapping(value = "/show")
    public String show()
    {
        return "s";
    }

    @RequestMapping(value = "/map")
    public Map<String, String> list2()
    {
        return ImmutableMap.of("Hello", "value");
    }

    @RequestMapping(value = "/welcome")
    public ModelAndView list3()
    {
        return new ModelAndView("welcome");
    }

    @RequestMapping(value = "html")
    public ModelAndView html()
    {
        return new ModelAndView("product/tml");
    }
}
