package by.training;

import by.training.exception.ServiceException;
import by.training.model.entity.Cone;
import by.training.model.entity.Point3D;
import by.training.model.service.ConeService;

public class main {
    public static void main(String[] args) throws ServiceException {
        Point3D foundationCenter = new Point3D(0.0, 0.0, 0.0);
        Point3D peak = new Point3D(0.0, 4.0, 0.0);
        double radius = 5.0;
        Cone cone = new Cone(foundationCenter, peak, radius);
        ConeService coneService = new ConeService();
        System.out.println(coneService.calculateVolume(cone));
    }
}
