package by.training.model.factory;

import by.training.model.entity.Shape3D;

import java.util.List;

public interface ShapeFactory<T extends Shape3D> {

    T createInstance(List<Double>values);
}
