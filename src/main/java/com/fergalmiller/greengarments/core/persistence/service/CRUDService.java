package com.fergalmiller.greengarments.core.persistence.service;

import java.util.Optional;

public interface CRUDService<Entity>
{
    Entity create(final Entity entity);

    Entity update(final Entity entity);

    Optional<Entity> find(final long uniqueIdentifier);

    boolean delete(final long uniqueIdentifier);
}
