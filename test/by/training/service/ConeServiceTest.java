package by.training.service;


import by.training.exception.ServiceException;
import by.training.model.entity.Cone;
import by.training.model.entity.Point3D;
import by.training.model.service.ConeService;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ConeServiceTest {

    ConeService coneService = new ConeService();

    Point3D foundationCenter;
    Point3D peak;
    double radius;
    Cone cone;


    @BeforeTest
    public void fillingInfo() {
        foundationCenter = new Point3D(0.0, 0.0, 0.0);
        peak = new Point3D(0.0, 4.0, 0.0);
        radius = 5.0;
        cone = new Cone(foundationCenter, peak, radius);
    }

    @Test
    public void testCalculateHeight() throws ServiceException {
        double actual = coneService.calculateHeight(cone);
        double expected = 4.0;
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void testCalculateBackSide() throws ServiceException {
        double actual = coneService.calculateBackSide(cone);
        double expected = 6.4031242374328485;
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void testCalculateSquare() throws ServiceException {
        double actual = coneService.calculateSquare(cone);
        double expected = 179.11985666145375;
        Assert.assertEquals(actual, expected);
    }


    @Test
    public void testCalculateVolume() throws ServiceException {
        double actual = coneService.calculateVolume(cone);
        double expected = 104.71975511965978;
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void testIsConeOnAxis(){
        boolean actual = coneService.isConeOnAxis(cone);
        boolean expected = true;
        Assert.assertEquals(actual, expected);
    }
}
