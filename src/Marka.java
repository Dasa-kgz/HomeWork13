public class Marka {
    private String manufacturer;
    private String type;


    public Marka(String manufacturer, String type) {
        this.manufacturer = manufacturer;
        this.type = type;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
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
