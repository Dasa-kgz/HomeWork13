public class VRAM {
    int volume;
    String manufacturer;

    public VRAM(int volume, String manufacturer) {
        this.volume = volume;
        this.manufacturer = manufacturer;
    }

    @Override
    public String toString() {
        return "VRAM{" +
                "volume=" + volume +
                ", manufacturer='" + manufacturer + '\'' +
                '}';
    }
}
