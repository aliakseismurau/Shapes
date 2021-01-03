package by.training.model.entity;

public class ConeProperty {
    private double volume;
    private double square;

    public ConeProperty() {
        volume = 0;
        square = 0;
    }

    public ConeProperty(double volume, double square) {
        this.volume = volume;
        this.square = square;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public double getSquare() {
        return square;
    }

    public void setSquare(double square) {
        this.square = square;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ConeProperty that = (ConeProperty) o;

        if (Double.compare(that.volume, volume) != 0) return false;
        return Double.compare(that.square, square) == 0;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        temp = Double.doubleToLongBits(volume);
        result = (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(square);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("ConeProperty{");
        sb.append("volume=").append(volume);
        sb.append(", square=").append(square);
        sb.append('}');
        return sb.toString();
    }
}
