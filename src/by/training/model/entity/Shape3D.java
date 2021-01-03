package by.training.model.entity;

import by.training.util.IdGenerator;

public abstract class Shape3D {
    private final long id;

    public Shape3D() {
        id = IdGenerator.getId();
    }

    public long getId() {
        return id;
    }
}
