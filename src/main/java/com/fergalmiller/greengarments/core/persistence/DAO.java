package com.fergalmiller.greengarments.core.persistence;

import java.util.List;
import java.util.Optional;

import javax.annotation.Nonnull;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.fergalmiller.greengarments.core.persistence.exception.ObjectNotFoundException;

@Repository
public class DAO
{
    @PersistenceContext
    private EntityManager entityManager;

    public EntityManager getEntityManager()
    {
        return entityManager;
    }

    @Nonnull
    public <Entity> Entity persist(@Nonnull Entity entity)
    {
        entityManager.persist(entity);
        return entity;
    }

    @Nonnull
    public <Entity> Optional<Entity> find(@Nonnull final Class<Entity> entityClass, final long uniqueIdentifier)
    {
        return Optional.ofNullable(entityManager.find(entityClass, uniqueIdentifier));
    }

    public <Entity> void delete(@Nonnull final Class<Entity> entityClass, final long uniqueIdentifier)
    {
        entityManager.remove(find(entityClass, uniqueIdentifier).orElseThrow(() -> new ObjectNotFoundException(uniqueIdentifier)));
    }

    @Nonnull
    public <Entity> Entity update(@Nonnull final Entity entity)
    {
        return entityManager.merge(entity);
    }

    @SuppressWarnings("unchecked")
    @Nonnull
    public <Entity> List<Entity> list(@Nonnull final Class<Entity> entityClass)
    {
        return entityManager.createQuery("SELECT x FROM " + entityClass.getSimpleName() + " x").getResultList();
    }
}
