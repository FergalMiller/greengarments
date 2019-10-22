package com.fergalmiller.greengarments.controller.product;

import java.util.Arrays;
import java.util.Map;

import javax.annotation.Nonnull;
import javax.validation.Valid;

import org.jetbrains.annotations.Contract;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.fergalmiller.greengarments.controller.product.command.ProductCommand;
import com.fergalmiller.greengarments.model.product.Product;
import com.fergalmiller.greengarments.model.product.category.Category;
import com.fergalmiller.greengarments.model.product.size.Size;
import com.fergalmiller.greengarments.service.product.ProductService;
import com.google.common.collect.ImmutableMap;

@Controller
@RequestMapping(value = "/product")
public class ProductController
{
    final private ProductService productService;

    @Contract(pure = true)
    @Autowired
    public ProductController(@Nonnull final ProductService productService)
    {
        this.productService = productService;
    }

    @RequestMapping(value = "/list")
    public ModelAndView list()
    {
        return new ModelAndView("product/list")
                .addObject("products", productService.listAll());
    }

    @GetMapping(value = "/creation-form")
    public ModelAndView creationForm()
    {
        return new ModelAndView("product/creation-form")
                .addObject("sizes", Arrays.asList(Size.values()))
                .addObject("categories", Arrays.asList(Category.values()));
    }

    @PostMapping(value = "/create")
    @ResponseBody
    public Map<String, Object> create(@Valid final ProductCommand productCommand,
                                      @Nonnull final BindingResult bindingResult)
    {
        if (!bindingResult.hasErrors())
        {
            final Product product = productService.create(productCommand);
            return ImmutableMap.of(
                    "message", "Successful",
                    "object", product);
        }

        return ImmutableMap.of(
                "message", "Unsuccessful: One or more inputs invalid.",
                "errors", bindingResult.getAllErrors());
    }
}
