
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        Assento[] assentos = new Assento[20];

        // Inicializa os 20 assentos
        for (int i = 0; i < assentos.length; i++) {
            assentos[i] = new Assento(i + 1);
        }

        int opcao;

        do {
            mostrarSala(assentos);

            System.out.println("\n===== MENU DO CINEMA =====");
            System.out.println("1 - Reservar assento");
            System.out.println("2 - Cancelar reserva");
            System.out.println("3 - Encerrar");
            System.out.print("Escolha uma opção: ");

            opcao = scn.nextInt();

            switch (opcao) {

                case 1:
                    System.out.print("Digite o número do assento: ");
                    int numeroReserva = scn.nextInt();

                    if (numeroReserva < 1 ||
                            numeroReserva > assentos.length) {
                        System.out.println("Número inválido!");
                    } else if (
                            assentos[numeroReserva - 1].isOcupado()) {
                        System.out.println(
                                "Esse assento já está ocupado!");
                    } else {
                        assentos[numeroReserva - 1].reservar();
                        System.out.println(
                                "Reserva realizada com sucesso!");
                    }
                    break;

                case 2:
                    System.out.print(
                            "Digite o número do assento para cancelar: ");
                    int numeroCancelamento = scn.nextInt();

                    if (numeroCancelamento < 1 ||
                            numeroCancelamento > assentos.length) {
                        System.out.println("Número inválido!");
                    } else if (
                            !assentos[numeroCancelamento - 1]
                                    .isOcupado()) {
                        System.out.println(
                                "Esse assento não está reservado!");
                    } else {
                        assentos[numeroCancelamento - 1]
                                .cancelarReserva();
                        System.out.println(
                                "Reserva cancelada com sucesso!");
                    }
                    break;

                case 3:
                    System.out.println("Encerrando o sistema...");
                    break;

                default:
                    System.out.println("Opção inválida!");
            }

        } while (opcao != 3);

        scn.close();
    }

    public static void mostrarSala(Assento[] assentos) {

        int ocupados = 0;

        System.out.println("\n==============================");
        System.out.println("        SALA DE CINEMA");
        System.out.println("==============================");
        System.out.println("\n             TELA\n");

        for (int i = 0; i < assentos.length; i++) {

            String status = assentos[i].isOcupado()
                    ? "[ X ]" : "[ D ]";

            System.out.printf("%02d %s  ",
                    assentos[i].getNumero(), status);

            if (assentos[i].isOcupado()) {
                ocupados++;
            }

            if ((i + 1) % 5 == 0) {
                System.out.println();
            }
        }

        System.out.println("\n[D] Disponível   [X] Ocupado");
        System.out.println("Assentos disponíveis: "
                + (assentos.length - ocupados));
        System.out.println("Assentos ocupados: " + ocupados);
    }
}

class Assento {

    private int numero;
    private boolean ocupado;

    public Assento(int numero) {
        this.numero = numero;
        this.ocupado = false;
    }

    public int getNumero() {
        return numero;
    }

    public boolean isOcupado() {
        return ocupado;
    }

    public void reservar() {
        this.ocupado = true;
    }

    public void cancelarReserva() {
        this.ocupado = false;
    }
}
