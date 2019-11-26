package com.fergalmiller.greengarments.controller.base;

import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping(value = "/decorator")
public class DecoratorController
{
    @RequestMapping(value = "/common")
    public String commonDecorator()
    {
        return "core/decorator-common";
    }
}
