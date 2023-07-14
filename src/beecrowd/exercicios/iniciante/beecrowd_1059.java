package beecrowd.exercicios.iniciante;

import java.util.ArrayList;
import java.util.List;

public class beecrowd_1059 {
    public static void main(String[] args) {

        List<Integer> lista = new ArrayList<Integer>();

        for (int i = 0;i<= 100;i++){
            lista.add(i);
        }

        for (int pares:lista) {

            if (pares % 2 == 0){
                System.out.println(pares);
            }

        }
    }
}
