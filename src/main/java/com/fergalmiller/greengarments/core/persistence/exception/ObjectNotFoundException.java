package com.fergalmiller.greengarments.core.persistence.exception;

import org.jetbrains.annotations.NotNull;

public class ObjectNotFoundException extends RuntimeException
{
    public ObjectNotFoundException(@NotNull final Object o)
    {
        super("Could not find object " + o + " (hashcode " + o.hashCode() + ").");
    }
}
