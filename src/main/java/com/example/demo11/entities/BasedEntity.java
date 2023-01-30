package com.example.demo11.entities;

import java.io.Serializable;

public interface BasedEntity <T extends Serializable> {

    T getId();

    void setId(T id);
}
