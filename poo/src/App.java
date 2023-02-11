import model.Carro;

public class App {
    public static void main(String[] args) throws Exception {
        Carro bmw = new Carro("cinza", "bmw", 100.00);
        Carro fiatUno = new Carro("branco", "uno", 50.00);

        System.out.println(fiatUno.calcularValorTanqueCompleto(4.85));
        System.out.println(bmw.calcularValorTanqueCompleto(4.85));
    }
}
