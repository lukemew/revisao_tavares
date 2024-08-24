import java.util.Arrays;
import java.util.Comparator;


public class Main {
    public static void main(String[] args) {

        // Exercício 1
        // Retangulo retangulo1 = new Retangulo(2, 4);
        // retangulo1.exibirInformacoes();

        // Retangulo retangulo2 = new Retangulo(6, 4);


        // Exercício 2
        Retangulo[] retangulos = new Retangulo[5];
        retangulos[0] = new Retangulo(5, 8);
        retangulos[1] = new Retangulo(3,5);
        retangulos[2] = new Retangulo(6, 7);
        retangulos[3] = new Retangulo(1,5);
        retangulos[4] = new Retangulo(2,7);

        /*
        for (int i = 0; i < retangulos.length; i++) {
            retangulos[i].exibirInformacoes();
        }

        Retangulo maiorArea = retangulos[0];
        Retangulo menorPerimetro = retangulos[0];

        for(int i = 1; i< retangulos.length; i++) {
            if(retangulos[i].calcularArea() > maiorArea.calcularArea()) {
                maiorArea = retangulos[i];
            }
            if (retangulos[i].calcularPerimetro() < menorPerimetro.calcularPerimetro()) {
                menorPerimetro = retangulos[i];
            }
        }

        System.out.println("Retangulo de Maior Área:");
        maiorArea.exibirInformacoes();

        System.out.println("Retangulo de Menor Perimetro:");
        menorPerimetro.exibirInformacoes();
        */

        // Exercício 3
        Arrays.sort(retangulos, Comparator.comparingDouble(Retangulo::calcularArea));

        System.out.println("Retângulos ordenados por área:");
        for (Retangulo retangulo : retangulos) {
            retangulo.exibirInformacoes();
        }

        Retangulo[] retangulosExpandido = new Retangulo[10];
        System.arraycopy(retangulos, 0, retangulosExpandido, 0, retangulos.length);

        retangulosExpandido[5] = new Retangulo(4, 4);
        retangulosExpandido[6] = new Retangulo(7, 3);
        retangulosExpandido[7] = new Retangulo(6, 2);
        retangulosExpandido[8] = new Retangulo(5, 5);
        retangulosExpandido[9] = new Retangulo(8, 1);

        System.out.println("Retângulos após expansão do vetor:");
        for (Retangulo retangulo : retangulosExpandido) {
            retangulo.exibirInformacoes();
        }
    }
}
