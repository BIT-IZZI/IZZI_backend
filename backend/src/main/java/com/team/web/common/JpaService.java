package com.team.web.common;

import java.util.Optional;

public interface JpaService<T> {
    public Iterable<T> findAll();
    public Optional<T> findById(String id);
}
