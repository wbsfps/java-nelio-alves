package secao18.tiposCuringaDelimitado.problema2GetPut.application;

import java.util.ArrayList;
import java.util.List;

public class Covariancia {
    public static void main(String[] args) {
        // Covariância

        List<Integer> myInts = new ArrayList<>();
        myInts.add(1);
        myInts.add(2);
        
        List<? extends Number> list = myInts;
        Number x = list.get(0);
        System.out.println(x);
//        list.add(0);
    }
}
