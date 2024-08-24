//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        // 1
        // Retangulo retangulo1 = new Retangulo(2, 4);
        // retangulo1.exibirInformacoes();

        // Retangulo retangulo2 = new Retangulo(6, 4);


        // 2
        Retangulo[] retangulos = new Retangulo[5];
        retangulos[0] = new Retangulo(5, 8);
        retangulos[1] = new Retangulo(3,5);
        retangulos[2] = new Retangulo(6, 7);
        retangulos[3] = new Retangulo(1,5);
        retangulos[4] = new Retangulo(2,7);


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

        // 3

    }
}