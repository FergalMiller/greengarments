package com.fergalmiller.greengarments.controller.base;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class BaseController
{

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ModelAndView home()
    {
        return new ModelAndView("welcome")
                .addObject("var", 1);
    }

    @RequestMapping(value = "/dialog")
    public ModelAndView dialog()
    {
        return new ModelAndView("core/dialog");
    }
}
