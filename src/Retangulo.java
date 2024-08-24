public class Retangulo {
    public int largura;
    public int altura;

    public Retangulo(int altura, int largura) {
        this.altura = altura;
        this.largura = largura;
    }

    public int calcularArea() {
        return this.altura * this.largura;
    }

    public int calcularPerimetro() {
        return 2 * (this.altura + this.largura);
    }

    public void exibirInformacoes() {
        System.out.println("Exibindo informações do retangulo: ");
        System.out.println("Altura: " + this.altura);
        System.out.println("Largura: " + this.largura);
        System.out.println("Área: " + calcularArea());
        System.out.println("Perimetro: " + calcularPerimetro());

    }
}
