package secao18.genericsDelimitados.problema1.model.service;

import java.util.List;

public class CalculationService {


    public static Integer max(List<Integer> list) {
        if (list.isEmpty()) {
            throw new IllegalStateException("List is empty");
        }

        Integer max = list.get(0);

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) > max) {
                max = list.get(i);
            }
        }
        return max;
    }
}
