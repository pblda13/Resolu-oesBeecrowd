package beecrowd.exercicios.iniciante;

public class beecrowd_1097 {
    public static void main(String[] args) {

        int j = 7;

        for (int i = 1; i <= 9; i += 2) {
            for (int count = 0; count < 3; count++) {
                System.out.println("I=" + i + " J=" + j);
                j--;
            }
            j += 5;
        }
    }
}
