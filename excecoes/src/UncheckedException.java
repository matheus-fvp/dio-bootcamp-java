import javax.swing.JOptionPane;

public class UncheckedException {
    public static void main(String[] args) throws Exception {
        String a = JOptionPane.showInputDialog("Numerador: ");
        String b = JOptionPane.showInputDialog("Denominador: ");

        try {
            int resultado = dividir(Integer.parseInt(a), Integer.parseInt(b));
            System.out.println("Resultado: " + resultado);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Entrada inválida, informe um número inteiro! " + e.getMessage());
        } catch(ArithmeticException e) {
            JOptionPane.showMessageDialog(null, "Impossivel dividir um número por 0! " + e.getMessage());
        } finally {
            System.out.println("Chegou no finally!");
        }
        
        System.out.println("O codigo continua ....");
    }

    public static int dividir(int a, int b) {
        return a / b;
    }
}

