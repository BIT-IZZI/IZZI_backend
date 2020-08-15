package com.team.web.common;

public interface JpaService<T> {
    public Iterable<T> findAll();
}
