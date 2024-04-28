public class Main {
    public static void main(String[] args) {

    ContaBancaria contaBancariaTeste = new ContaBancaria("Jorge", 433);

        System.out.printf("Saldo inicial: %.2f\n", contaBancariaTeste.getSaldo());

        contaBancariaTeste.depositar(300);

        System.out.printf("Saldo após depósito: %.2f \n", contaBancariaTeste.getSaldo());

        contaBancariaTeste.sacar(100);

        System.out.printf("Saldo após o saque: %.2f\n", contaBancariaTeste.getSaldo());

        System.out.printf("Saldo final do Jorge: %.2f\n", contaBancariaTeste.getSaldo());

    }
}