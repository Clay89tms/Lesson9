public class Vector3D {
    private double ax;
    private double ay;
    private double az;
    private double bx;
    private double by;
    private double bz;
    static final String CONS = "Данные вектора <a> и <b> расположеных в трехмерной системе координат";

    public Vector3D() {
    }

    public Vector3D(double ax, double ay, double az, double bx, double by, double bz) {
        this.ax = ax;
        this.ay = ay;
        this.az = az;
        this.bx = bx;
        this.by = by;
        this.bz = bz;
    }

    public String param() {
        return "Данные вектора <a>: {" + this.ax + "; " + this.ay + "; " + this.az + "} \nДанные вектора <b>: {" + this.bx + "; " + this.by + "; " + this.bz + "}";
    }

    public String length() {
        double var10000 = Math.sqrt(Math.pow(this.ax, 2.0) + Math.pow(this.ay, 2.0) + Math.pow(this.az, 2.0));
        return "Длинна 1 вектора 2Д = " + var10000 + "\nДлинна 2 вектора 2Д = " + Math.sqrt(Math.pow(this.bx, 2.0) + Math.pow(this.by, 2.0) + Math.pow(this.bz, 2.0));
    }

    public String skalar() {
        double var10000 = this.ax * this.bx + this.ay * this.by;
        double var10001 = this.az * this.bz;
        return "Скалярное произведение 1 и 2 векторов = " + (var10000 + var10001);
    }

    public String plus() {
        double var10000 = this.ax + this.bx;
        return "Сумма 1 и 2 векторов = {" + var10000 + "; " + (this.ay + this.by) + "; " + (this.az + this.bz) + "}";
    }

    public String minus() {
        double var10000 = this.ax - this.bx;
        return "Разница 1 и 2 векторов = {" + var10000 + "; " + (this.ay - this.by) + "; " + (this.az - this.bz) + "}";
    }

    public static void mas(int n) {
        System.out.println("Создаем трехмерный массив векторов размером: " + n);
        int[][] vector3Dm = new int[n][3];

        for(int i = 0; i < vector3Dm.length; ++i) {
            System.out.print("{ ");

            for(int j = 0; j < vector3Dm[i].length; ++j) {
                vector3Dm[i][j] = (int)(-10.0 + Math.random() * 20.0);
                if (j != 0 && j != 1) {
                    System.out.print(vector3Dm[i][j] + " ");
                } else {
                    System.out.print(vector3Dm[i][j] + "; ");
                }
            }

            System.out.println("} \t" + (i + 1) + " Вектор");
        }

    }

    public void info() {
        System.out.println(this.param());
        System.out.println(this.length());
        System.out.println(this.skalar());
        System.out.println(this.plus());
        System.out.println(this.minus());
    }
}
