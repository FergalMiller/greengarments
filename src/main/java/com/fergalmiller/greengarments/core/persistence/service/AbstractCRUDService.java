package com.fergalmiller.greengarments.core.persistence.service;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;
import java.util.Optional;

import org.jetbrains.annotations.Contract;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.fergalmiller.greengarments.core.persistence.DAO;
import com.fergalmiller.greengarments.core.persistence.exception.ObjectNotFoundException;

@Transactional
public abstract class AbstractCRUDService<Entity> implements CRUDService<Entity>
{
    @Autowired
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

    @Transactional(readOnly = true)
    public List<Entity> listAll()
    {
        return dao.list(getEntityClass());
    }

    @Contract(pure = true)
    public final DAO getDao()
    {
        return dao;
    }

    @SuppressWarnings("unchecked")
    private Class<Entity> getEntityClass()
    {
        Class<?> clazz = getClass();
        while (clazz != null)
        {
            final Type type = clazz.getGenericSuperclass();
            if (type instanceof ParameterizedType)
            {
                return (Class<Entity>) ((ParameterizedType) type).getActualTypeArguments()[0];
            }
        }
        throw new RuntimeException("No parameterized type found for class!");
    }

}
