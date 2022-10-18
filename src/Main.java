public class Main {
    public static void main(String[] args) {
        Vector2D vector2D = new Vector2D(5.0, -4.0, 3.0, -1.0);
        vector2D.param();
        vector2D.length();
        vector2D.skalar();
        vector2D.plus();
        vector2D.minus();
        Vector2D.mas(8);
        System.out.println("\nДанные вектора <a> и <b> расположеных в двумерной системе координат");
        vector2D.info();
        System.out.println();

        Vector3D vector3D = new Vector3D(9.0, 2.0, -3.0, 4.0, -2.0, 8.0);
        vector3D.param();
        vector3D.length();
        vector3D.skalar();
        vector3D.plus();
        vector3D.minus();
        Vector3D.mas(8);
        System.out.println("\nДанные вектора <a> и <b> расположеных в трехмерной системе координат");
        vector3D.info();
    }
}