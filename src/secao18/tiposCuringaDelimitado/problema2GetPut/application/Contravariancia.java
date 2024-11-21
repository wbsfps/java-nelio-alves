package secao18.tiposCuringaDelimitado.problema2GetPut.application;

import java.util.ArrayList;
import java.util.List;

public class Contravariancia {
    public static void main(String[] args) {
        List<Object> myObjs = new ArrayList<>();
        myObjs.add("Maria");
        myObjs.add("Bob");
        myObjs.add(1);

        List<? super Number> myNums = myObjs;

        myNums.add(5.5);
        myNums.add(3.14);

//        Number x = myNums.get(0);

    }
}
