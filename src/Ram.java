public class Ram {
    private int volume;
    private String Manufacturer;

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public String getManufacturer() {
        return Manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        Manufacturer = manufacturer;
    }

    public Ram(int volume, String manufacturer) {
        this.volume = volume;
        Manufacturer = manufacturer;
    }


    @Override
    public String toString() {
        return "Ram{" +
                "volume=" + volume +
                ", Manufacturer=" + Manufacturer +
                '}';
    }
}
