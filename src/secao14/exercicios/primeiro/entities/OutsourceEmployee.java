package secao14.exercicios.primeiro.entities;

public class OutsourceEmployee extends Employee {
    private Double additionalCharge;

    public OutsourceEmployee(){super();}

    public OutsourceEmployee(Double additionalCharge) {
        this.additionalCharge = additionalCharge;
    }

    public OutsourceEmployee(String name, Integer hours, Double valuePeHour, Double additionalCharge) {
        super(name, hours, valuePeHour);
        this.additionalCharge = additionalCharge;
    }

    @Override
    public Double payment() {
        return super.payment() * 1.1 + additionalCharge;
    }

    @Override
    public String toString() {
        return "OutsourceEmployee{" +
                "additionalCharge=" + additionalCharge +
                '}';
    }
}
