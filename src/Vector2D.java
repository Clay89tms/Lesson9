public class Vector2D {
    private double ax;
    private double ay;
    private double bx;
    private double by;
    static final String CONS = "Данные вектора <a> и <b> расположеных в двумерной системе координат";

    public Vector2D() {
    }

    public Vector2D(double ax, double ay, double bx, double by) {
        this.ax = ax;
        this.ay = ay;
        this.bx = bx;
        this.by = by;
    }

    public String param() {
        return "Данные вектора <a>: {" + this.ax + "; " + this.ay + "} \nДанные вектора <b>: {" + this.bx + "; " + this.by + "}";
    }

    public String length() {
        double var10000 = Math.sqrt(Math.pow(this.ax, 2.0) + Math.pow(this.ay, 2.0));
        return "Длинна 1 вектора 2Д = " + var10000 + "\nДлинна 2 вектора 2Д = " + Math.sqrt(Math.pow(this.bx, 2.0) + Math.pow(this.by, 2.0));
    }

    public String skalar() {
        double var10000 = this.ax * this.bx;
        double var10001 = this.ay * this.by;
        return "Скалярное произведение 1 и 2 векторов = " + (var10000 + var10001);
    }

    public String plus() {
        double var10000 = this.ax + this.bx;
        return "Сумма 1 и 2 векторов = {" + var10000 + "; " + (this.ay + this.by) + "}";
    }

    public String minus() {
        double var10000 = this.ax - this.bx;
        return "Разница 1 и 2 векторов = {" + var10000 + "; " + (this.ay - this.by) + "}";
    }

    public static void mas(int n) {
        System.out.println("Создаем двумерный массив векторов размером: " + n);
        int[][] vector2Dm = new int[n][2];

        for(int i = 0; i < vector2Dm.length; ++i) {
            System.out.print("{ ");

            for(int j = 0; j < vector2Dm[i].length; ++j) {
                vector2Dm[i][j] = (int)(-10.0 + Math.random() * 20.0);
                if (j == 0) {
                    System.out.print(vector2Dm[i][j] + "; ");
                } else {
                    System.out.print(vector2Dm[i][j] + " ");
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
