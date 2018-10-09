package zag.lab2;

public class Leg {
    double length, size;
    String form;

    public Leg(double length, double size, String form) {
        this.length = length;
        this.size = size;
        this.form = form;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public String getForm() {
        return form;
    }

    public void setForm(String form) {
        this.form = form;
    }

    @Override
    public String toString() {
        return "Leg{" +
                "length=" + length +
                ", size=" + size +
                ", form='" + form + '\'' +
                '}';
    }
}
