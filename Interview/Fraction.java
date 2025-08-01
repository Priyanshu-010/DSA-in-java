public class Fraction {

    public static Frac add(Frac f1, Frac f2){
        int num = f1.num * f1.den + f1.den * f2.num;
        int den = f1.den * f2.den;
        Frac f3 = new Frac(num, den);
        return f3;
    }
    public static class Frac{
        int num;
        int den;

        public int gcd(int num, int den){
            int min = Math.min(num, den);
            for (int i = min; i >= 1; i--) {
                if(num % i == 0 && den % i == 0) return i;
            }
            return min;
        }

        public Frac(int num, int den){
            this.num = num;
            this.den = den;
            simplify();
        }

        public void simplify(){
            int hcf = gcd(num, den);
            num /= hcf;
            den /= hcf;
        }
    }
    public static void main(String[] args) {
        Frac f1 = new Frac(35,21);
        System.out.println(f1.num + "/" + f1.den);
        Frac f2 = new Frac(7,3);
        System.out.println(f2.num + "/" + f2.den);
        Frac f3 = add(f1, f2);
        System.out.println(f3.num + "/" + f3.den);
    }
}
