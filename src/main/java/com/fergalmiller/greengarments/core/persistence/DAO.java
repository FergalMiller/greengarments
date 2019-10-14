package com.fergalmiller.greengarments.core.persistence;

import java.util.Optional;

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

    public <Entity> Entity persist(Entity entity)
    {
        entityManager.persist(entity);
        return entity;
    }

    public <Entity> Optional<Entity> find(final Class<Entity> entityClass, final long uniqueIdentifier)
    {
        return Optional.ofNullable(entityManager.find(entityClass, uniqueIdentifier));
    }

    public <Entity> void delete(final Class<Entity> entityClass, final long uniqueIdentifier)
    {
        entityManager.remove(find(entityClass, uniqueIdentifier).orElseThrow(() -> new ObjectNotFoundException(uniqueIdentifier)));
    }

    public <Entity> Entity update(final Entity entity)
    {
        return entityManager.merge(entity);
    }
}
