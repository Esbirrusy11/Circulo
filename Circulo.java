public class Circulo {
    double radio;

    public Circulo(double radio){
        if (radio<0){
            this.radio=0;
        }
        else {
            this.radio=radio;
        }
    }

    public double getRadio() {
        return radio;
    }

    public double getArea(){
        double Area;
        Area=radio*radio*Math.PI;
        return Area;
    }
}

class Cilindro extends Circulo{
   double altura;

    public Cilindro(double radio, double altura) {
        super(radio);
        if (altura<0){
            this.altura=0;
        }else {
            this.altura = altura;
        }
    }

    public double getAltura() {
        return altura;
    }

    public double getVolumen(){
        double Volumen;
        Volumen=getArea()*altura;
        return Volumen;
    }
}
