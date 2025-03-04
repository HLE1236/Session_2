class Circle {
    private double r;
    public void setR (double r) {
        this.r = r;
    }
    public double getArea() {
        return r * r * 3.14;
    }
    public double getPa () {
        return 2 * r * 3.14;
    }
}
class Square {
    private double side;
    public void setSide(double side) {
        this.side = side;
    }
    public double getArea () {
        return side*side;
    }
    public double getPa () {
        return 4*side;
    }
}