package by.training.model.repository;

import by.training.model.entity.Cone;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;

public class ConeRepository {

    private List<Cone> coneList = new ArrayList<>();

    public boolean add(Cone cone) {
        return coneList.add(cone);
    }

    public boolean remove(Object o) {
        return coneList.remove(o);
    }

    public boolean addAll(Collection<? extends Cone> c) {
        return coneList.addAll(c);
    }

    public void sort(Comparator<? super Cone> c) {
        coneList.sort(c);
    }

    public Cone get(int index) {
        return coneList.get(index);
    }

    public Cone set(int index, Cone element) {
        return coneList.set(index, element);
    }

    public void add(int index, Cone element) {
        coneList.add(index, element);
    }

    public Cone remove(int index) {
        return coneList.remove(index);
    }
}
