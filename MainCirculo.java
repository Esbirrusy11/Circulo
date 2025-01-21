public class MainCirculo {
    public static void main(String[] args) {
        Circulo Circulo=new Circulo(6.5);
        System.out.println("Área-----> "+Circulo.getArea());

        Cilindro Cilindro=new Cilindro(6.5,7);
        System.out.println("Volumen-----> "+Cilindro.getVolumen());
    }
}
