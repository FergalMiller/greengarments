package com.fergalmiller.greengarments.core.persistence.service;

import java.util.Optional;

import org.jetbrains.annotations.Contract;
import org.springframework.transaction.annotation.Transactional;

import com.fergalmiller.greengarments.core.persistence.DAO;
import com.fergalmiller.greengarments.core.persistence.exception.ObjectNotFoundException;

@Transactional
public abstract class AbstractCRUDService<Entity> implements CRUDService<Entity>
{
    private DAO dao;

    @Override
    public Entity create(final Entity entity)
    {
        return dao.persist(entity);
    }

    @Override
    public Optional<Entity> find(final long uniqueKey)
    {
        return dao.find(getEntityClass(), uniqueKey);
    }

    @Override
    public Entity update(final Entity entity)
    {
        return dao.update(entity);
    }

    @Override
    public boolean delete(final long uniqueKey)
    {
        try
        {
            dao.delete(getEntityClass(), uniqueKey);
            return true;
        }
        catch (final ObjectNotFoundException objectNotFound)
        {
            return false;
        }
    }

    @Contract(pure = true)
    public final DAO getDao()
    {
        return dao;
    }

    @SuppressWarnings("unchecked")
    private Class<Entity> getEntityClass()
    {
        return (Class<Entity>) getClass().getTypeParameters()[0].getClass();
    }
}
