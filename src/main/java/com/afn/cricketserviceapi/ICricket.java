package com.afn.cricketserviceapi;

import java.util.Collection;

public interface ICricket<T> {
    public void save(T t);

    public Collection<T> viewAll();

    public void update(T t);

    public void delete(T t);
}
