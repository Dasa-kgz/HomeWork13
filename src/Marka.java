public class Marka {
    String manufacturer;
    String type;

    public Marka(String manufacturer, String type) {
        this.manufacturer = manufacturer;
        this.type = type;
    }

    @Override
    public String toString() {
        return "Marka{" +
                "manufacturer='" + manufacturer + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
