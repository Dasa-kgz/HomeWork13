public class Ram {
    int volume;
    String Manufacturer;

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
