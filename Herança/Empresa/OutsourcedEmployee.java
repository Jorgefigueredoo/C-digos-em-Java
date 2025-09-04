package Herança.Empresa;

public class OutsourcedEmployee extends Employe {

    private double addtionlCharge;

    public OutsourcedEmployee() {
        super();
    }

    public OutsourcedEmployee(String name, Integer hours, double valuePerHour, double addtionlCharge) {
        super(name, hours, valuePerHour);
        this.addtionlCharge = addtionlCharge;
    }

    public double getAddtionlCharge() {
        return addtionlCharge;
    }

    public void setAddtionlCharge(double addtionlCharge) {
        this.addtionlCharge = addtionlCharge;
    }

    @Override
    public double payment() {
        return super.payment() + addtionlCharge * 1.1;
    }
}
