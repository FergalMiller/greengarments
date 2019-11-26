package com.fergalmiller.greengarments.core.config;

import org.sitemesh.builder.SiteMeshFilterBuilder;
import org.sitemesh.config.ConfigurableSiteMeshFilter;

public class CustomSiteMeshFilter extends ConfigurableSiteMeshFilter
{
    @Override
    protected void applyCustomConfiguration(final SiteMeshFilterBuilder builder)
    {
        builder.addDecoratorPath("/*", "/decorator/common")
                .addExcludedPath("/admin/*");
    }
}
