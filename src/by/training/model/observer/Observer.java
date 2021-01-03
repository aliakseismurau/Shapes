package by.training.model.observer;

import by.training.exception.ServiceException;

public interface Observer {
    void parameterChanged(ConeEvent event);
}
