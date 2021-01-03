package by.training.model.factory.impl;

import by.training.model.entity.Cone;
import by.training.model.entity.Point3D;
import by.training.model.factory.ShapeFactory;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.List;
import java.util.Optional;

public class ConeFactoryImpl implements ShapeFactory<Cone> {

    @Override
    public Cone createInstance(List<Double> values) {
        Point3D foundationCenter = new Point3D(values.get(0), values.get(1), values.get(2));
        Point3D peak = new Point3D(values.get(3), values.get(4), values.get(5));
        double radius = values.get(6);
        return new Cone(foundationCenter, peak, radius);
    }
}
