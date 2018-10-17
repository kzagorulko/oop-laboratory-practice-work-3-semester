package lab3.zagorulko;

public abstract class Dish {
    private String name, material;

    public Dish() {
        this.name = "Unknown";
        this.material = "Unknown";
    }

    public Dish(String name) {
        this.name = name;
        this.material = "Unknown";
    }

    public Dish(String name, String matrial) {
        this.name = name;
        this.material = matrial;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    @Override
    public String toString() {
        return "Dish{" +
                "name='" + name + '\'' +
                ", material='" + material + '\'' +
                '}';
    }
}
