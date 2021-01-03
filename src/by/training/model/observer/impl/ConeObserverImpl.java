package by.training.model.observer.impl;

import by.training.exception.ServiceException;
import by.training.model.entity.Cone;
import by.training.model.entity.ConeProperty;
import by.training.model.observer.ConeEvent;
import by.training.model.observer.Observer;
import by.training.model.service.ConeService;
import by.training.model.warehouse.ConePropertyWarehouse;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ConeObserverImpl implements Observer {

    private static final Logger logger = LogManager.getLogger();

    @Override
    public void parameterChanged(ConeEvent event){
        Cone cone = event.getSource();
        ConeService coneService = new ConeService();
            try {
                double coneVolume = coneService.calculateVolume(cone);
                double coneSquare = coneService.calculateSquare(cone);
                ConeProperty coneProperty = new ConeProperty(coneVolume, coneSquare);
                ConePropertyWarehouse.getInstance().put(cone.getId(), coneProperty);
            } catch (ServiceException e) {
                logger.info("Exception with service", e);
            }
    }
}

