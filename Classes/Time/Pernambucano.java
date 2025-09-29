package Classes.Time;

public class Pernambucano {

    private String time;
    private int titulos;

    public Pernambucano(String time, int titulos) {
        this.time = time;
        this.titulos = titulos;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public int getTitulos() {
        return titulos;
    }

    public void setTitulos(int titulos) {
        this.titulos = titulos;
    }

}
