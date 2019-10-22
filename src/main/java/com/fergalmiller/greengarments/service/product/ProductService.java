package com.fergalmiller.greengarments.service.product;

import javax.annotation.Nonnull;

import org.springframework.stereotype.Service;

import com.fergalmiller.greengarments.controller.product.command.ProductCommand;
import com.fergalmiller.greengarments.core.persistence.service.AbstractCRUDService;
import com.fergalmiller.greengarments.model.product.Product;
import com.fergalmiller.greengarments.model.product.category.Category;
import com.fergalmiller.greengarments.model.product.size.Size;

@Service
public class ProductService extends AbstractCRUDService<Product>
{

    public Product create(@Nonnull final ProductCommand productCommand)
    {
        final Product product = new Product(
                productCommand.getSerialNo(),
                productCommand.getBrand(),
                productCommand.getProductName(),
                Size.valueOf(productCommand.getSize()),
                Category.valueOf(productCommand.getCategory()),
                productCommand.getSubcategory()
        );

        return create(product);
    }

}
