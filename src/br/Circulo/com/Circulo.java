package br.Circulo.com;

// Definição da classe Circulo
class Circulo {
    // Atributos privados
    private double raio;
    private String cor;

    // Método construtor
    public Circulo(double raio, String cor) {
        this.raio = raio;
        this.cor = cor;
    }

    // Métodos para calcular área e perímetro do círculo (opcional)
    public double calcularArea() {
        return Math.PI * raio * raio;
    }

    public double calcularPerimetro() {
        return 2 * Math.PI * raio;
    }

    // Método para exibir características do círculo
    public void exibirCaracteristicas() {
        System.out.println("Raio: " + raio);
        System.out.println("Cor: " + cor);
    }
}