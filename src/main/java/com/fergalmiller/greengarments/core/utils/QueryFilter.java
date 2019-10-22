package com.fergalmiller.greengarments.core.utils;

import java.util.List;

import org.jetbrains.annotations.Contract;

public class QueryFilter
{
    private List<ImmutablePair> filters;

    private class ImmutablePair
    {
        final String key;
        final Object value;
        @Contract(pure = true)
        ImmutablePair(final String key, final String value)
        {
            this.key = key; this.value = value;
        }
    }
}
