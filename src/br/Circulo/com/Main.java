package br.Circulo.com;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar ao usuário que forneça o raio e a cor do círculo
        System.out.print("Digite o raio do círculo: ");
        double raio = scanner.nextDouble();
        scanner.nextLine();
        System.out.print("Digite a cor do círculo: ");
        String cor = scanner.nextLine();

        // Criar um objeto Circulo usando o método construtor
        Circulo circulo = new Circulo(raio, cor);

        // Exibir características do círculo
        System.out.println("\nCaracterísticas do Círculo:");
        circulo.exibirCaracteristicas();

        // Exibir área e perímetro do círculo (opcional)
        System.out.println("\nÁrea do Círculo: " + circulo.calcularArea());
        System.out.println("Perímetro do Círculo: " + circulo.calcularPerimetro());

        scanner.close(); // Fechar o scanner
    }
}