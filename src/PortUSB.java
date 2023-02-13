public class PortUSB {
   private double Type;
   private char idPort;

    public PortUSB(double type, char idPort) {
        Type = type;
        this.idPort = idPort;
    }

    public double getType() {
        return Type;
    }

    public void setType(double type) {
        Type = type;
    }

    public char getIdPort() {
        return idPort;
    }

    public void setIdPort(char idPort) {
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
