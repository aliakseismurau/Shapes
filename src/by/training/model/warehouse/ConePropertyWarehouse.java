package by.training.model.warehouse;

import by.training.model.entity.ConeProperty;

import java.util.HashMap;
import java.util.Map;

public class ConePropertyWarehouse {

    private static final ConePropertyWarehouse instance = new ConePropertyWarehouse();

    private final Map<Long, ConeProperty> conePropertyMap = new HashMap<>();

    public static ConePropertyWarehouse getInstance(){
        return instance;
    }

    public int size() {
        return conePropertyMap.size();
    }

    public ConeProperty get(Long id) {
        return conePropertyMap.get(id);
    }

    public void put(Long id, ConeProperty property) {
        conePropertyMap.put(id, property);
    }

    public void remove(Long id) {
        conePropertyMap.remove(id);
    }
}
