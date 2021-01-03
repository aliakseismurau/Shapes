package by.training.model.service;

import by.training.exception.ServiceException;
import by.training.model.entity.Cone;
import by.training.model.entity.Point3D;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ConeService {

    private static final Logger logger = LogManager.getLogger();

    public double calculateHeight(Cone cone) throws ServiceException {
        double coneHeight;
        Point3D foundationCenter = cone.getFoundationCenter();
        Point3D peak = cone.getPeak();
        if (foundationCenter.getX() == peak.getX() && foundationCenter.getY() == peak.getY()){
            coneHeight = Math.abs(foundationCenter.getZ() - peak.getZ());
        } else if (foundationCenter.getX() == peak.getX() && foundationCenter.getZ() == peak.getZ()){
            coneHeight = Math.abs(foundationCenter.getY() - peak.getY());
        } else if (foundationCenter.getY() == peak.getY() && foundationCenter.getZ() == peak.getZ()){
            coneHeight = Math.abs(foundationCenter.getX() - peak.getX());
        } else {
            throw new ServiceException("Cone has invalid parameters");
        }
        return coneHeight;
    }

    public double calculateBackSide(Cone cone) throws ServiceException{
        double coneBackSide = Math.sqrt(Math.pow(calculateHeight(cone), 2) + Math.pow(cone.getRadius(), 2));
        return coneBackSide;
    }

    public double calculateSquare(Cone cone) throws ServiceException {
        double foundationSquare = Math.PI * Math.pow(cone.getRadius(), 2);
        double backSquare = Math.PI * cone.getRadius() * calculateBackSide(cone);
        double coneSquare = foundationSquare + backSquare;
        return coneSquare;
    }

    public double calculateVolume(Cone cone) throws ServiceException {
        double coneVolume = Math.PI * Math.pow(cone.getRadius(), 2) * calculateHeight(cone) / 3;
        return coneVolume;
    }

    public boolean isConeOnAxis(Cone cone){
        boolean result = false;
        StringBuilder loggerOutput = new StringBuilder();
        if (cone.getFoundationCenter().getX() == 0) {
            result = true;
            loggerOutput.append("Base planes on X ");
        }
        if (cone.getFoundationCenter().getY() == 0) {
            result = true;
            loggerOutput.append(" Base planes on Y ");
        }
        if (cone.getFoundationCenter().getZ() == 0) {
            result = true;
            loggerOutput.append(" Base planes on Z");
        }
        logger.info(loggerOutput);
        return result;
    }
}

