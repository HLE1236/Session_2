public class Vector{
    private double x, y, z;
    public Vector(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }
    public Vector add(Vector other) {
        return new Vector(
            this.x + other.x,
            this.y + other.y,
            this.z + other.z
        );
    }
    public Vector subtract(Vector other) {
        return new Vector(
            this.x - other.x,
            this.y - other.y,
            this.z - other.z
        );
    }
    public Vector multiply(double s) {
        return new Vector(
            this.x * s,
            this.y * s,
            this.z * s
        );
    }
    public double dotProduct(Vector other) {
        return (this.x * other.x) + (this.y * other.y) + (this.z * other.z);
    }
    public String toString() {
        return String.format("(%.2f, %.2f, %.2f)", x, y, z);
    }
    public static void main(String[] args) {
        Vector v1 = new Vector(1, 2, 3);
        Vector v2 = new Vector(4, 5, 6);

        System.out.println("v1 + v2 = " + v1.add(v2));
        System.out.println("v1 - v2 = " + v1.subtract(v2));
        System.out.println("v1 * 2 = " + v1.multiply(2));
        System.out.println("v1 . v2 = " + v1.dotProduct(v2));
    }
}
