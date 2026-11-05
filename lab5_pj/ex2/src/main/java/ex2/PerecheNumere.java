package main.java.ex2;


public class PerecheNumere {
    private int a;
    private int b;

    public PerecheNumere() {
    }

    public PerecheNumere(int a, int b) {
        super();
        this.a = a;
        this.b = b;
    }


    public int getA() {
        return a;
    }


    public void setA(int a) {
        this.a = a;
    }


    public int getB() {
        return b;
    }


    public void setB(int b) {
        this.b = b;
    }

    @Override
    public String toString() {
        return "(" + a + ", " + b + ")";
    }


    public boolean suntConsecutiveFibonacci() {
        if (a < 0 || b < 0) {
            return false;
        }
        int f1 = 0;
        int f2 = 1;
        while (f1 <= a || f1 <= b) {
            if ((f1 == a && f2 == b) || (f1 == b && f2 == a)) {
                return true;
            }
            int f3 = f1 + f2;
            f1 = f2;
            f2 = f3;
        }
        return false;
    }


    public int cmmmc() {
        if (a == 0 || b == 0) {
            return 0;
        }
        int x = a;
        int y = b;
        while (y != 0) {
            int r = x % y;
            x = y;
            y = r;
        }
        int cmmdc = x;
        return (a * b) / cmmdc;
    }


    public boolean auSumaCifrelorEgala() {
        int x = a < 0 ? -a : a;
        int y = b < 0 ? -b : b;

        int sumaA = 0;
        while (x != 0) {
            sumaA += x % 10;
            x /= 10;
        }

        int sumaB = 0;
        while (y != 0) {
            sumaB += y % 10;
            y /= 10;
        }

        return sumaA == sumaB;
    }


    public boolean auAcelasiNumarCifrePare() {
        int x = a < 0 ? -a : a;
        int y = b < 0 ? -b : b;

        int pareA = (x == 0) ? 1 : 0;
        while (x != 0) {
            if ((x % 10) % 2 == 0) {
                pareA++;
            }
            x /= 10;
        }

        int pareB = (y == 0) ? 1 : 0;
        while (y != 0) {
            if ((y % 10) % 2 == 0) {
                pareB++;
            }
            y /= 10;
        }

        return pareA == pareB;
    }
}