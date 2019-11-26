package com.fergalmiller.greengarments.controller.base;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/decorator")
public class DecoratorController
{
    @RequestMapping(value = "/common")
    public String commonDecorator()
    {
        return "core/decorator-common";
    }
}
