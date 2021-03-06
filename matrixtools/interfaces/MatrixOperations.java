package matrixtools.interfaces;

public interface MatrixOperations {
    public double determinant();
    public double[][] transpose();
    public double[][] inverse();
    public double matrixNorm();
    public double lpNorm(int p);
    public double trace();
    //more operations coming
}
