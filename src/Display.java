public class Display {
    String manufacturer;
    double Diagonal;
    String MatrixType;

    public Display(String manufacturer, double diagonal, String matrixType) {
        this.manufacturer = manufacturer;
        Diagonal = diagonal;
        MatrixType = matrixType;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public double getDiagonal() {
        return Diagonal;
    }

    public void setDiagonal(double diagonal) {
        Diagonal = diagonal;
    }

    public String getMatrixType() {
        return MatrixType;
    }

    public void setMatrixType(String matrixType) {
        MatrixType = matrixType;
    }

    @Override
    public String toString() {
        return "Display{" +
                "manufacturer='" + manufacturer + '\'' +
                ", Diagonal=" + Diagonal +
                ", MatrixType='" + MatrixType + '\'' +
                '}';
    }
}
