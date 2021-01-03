package by.training.model.entity;

import by.training.model.observer.ConeEvent;
import by.training.model.observer.Observable;
import by.training.model.observer.Observer;

import java.util.ArrayList;
import java.util.List;

public class Cone extends Shape3D implements Observable {
    private Point3D foundationCenter;
    private Point3D peak;
    private double radius;
    private List<Observer> observers = new ArrayList<>();

    public Cone(Point3D foundationCenter, Point3D peak, double radius) {
        this.foundationCenter = foundationCenter;
        this.peak = peak;
        this.radius = radius;
    }

    public Point3D getFoundationCenter() {
        return foundationCenter;
    }

    public void setFoundationCenter(Point3D foundationCenter) {
        this.foundationCenter = foundationCenter;
    }

    public Point3D getPeak() {
        return peak;
    }

    public void setPeak(Point3D peak) {
        this.peak = peak;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public void attach(Observer observer) {
        if(observer != null) {
            observers.add(observer);
        }
    }

    @Override
    public void detach(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        ConeEvent event = new ConeEvent(this);
        observers.forEach(observer -> observer.parameterChanged(event));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Cone cone = (Cone) o;

        if (Double.compare(cone.radius, radius) != 0) return false;
        if (foundationCenter != null ? !foundationCenter.equals(cone.foundationCenter) : cone.foundationCenter != null)
            return false;
        return peak != null ? peak.equals(cone.peak) : cone.peak == null;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = foundationCenter != null ? foundationCenter.hashCode() : 0;
        result = 31 * result + (peak != null ? peak.hashCode() : 0);
        temp = Double.doubleToLongBits(radius);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Cone{");
        sb.append("foundationCenter=").append(foundationCenter);
        sb.append(", peak=").append(peak);
        sb.append(", radius=").append(radius);
        sb.append('}');
        return sb.toString();
    }
}
