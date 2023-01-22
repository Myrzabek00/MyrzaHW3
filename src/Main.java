public class Main {
    public static void main(String[] args) {
        int a = 0;
        int b = 0;
        double S = 0;
        double randomNumbers []={4.7f, 6.1f, -2.4f, 7.7f, 11.2f, -10.5f, 2.7f, 6.3f, -38.2f, -17.8, -3.9f, 21.1f, 8.5f, -2.4f, 19.4};
        for (double f : randomNumbers)
            {
                if (f<0){
                    a++;
                }
                if (a>0 && f>0){
                    S=S+f;
                    b++;
                }
                System.out.println(S + "/" + b + "=" + (S/b));
        }
        System.out.println("------------------------");
        int M[] = {6, 4, -7, 7, -3, -10, 5};
        









    }
}
