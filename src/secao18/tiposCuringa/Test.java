package secao18.tiposCuringa;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<?> myObjs = new ArrayList<>();
        List<Integer> myNumbers = new ArrayList<>();
        myObjs = myNumbers;

        Object obj;
        Integer x = 10;
        obj = x;
    }
}
