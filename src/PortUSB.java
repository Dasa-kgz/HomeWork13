public class PortUSB {
   private double Type;
   private char idPort;

    public PortUSB(double type, char idPort) {
        Type = type;
        this.idPort = idPort;
    }

    @Override
    public String toString() {
        return "PortUSB{" +
                "Type=" + Type +
                ", idPort=" + idPort +
                '}';
    }
}
