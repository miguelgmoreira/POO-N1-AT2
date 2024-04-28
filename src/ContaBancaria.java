public class ContaBancaria {
    private String titular;
    private double saldo;

    ContaBancaria(String titular, double saldo) {
        this.titular = titular;
        this.saldo = saldo;
    };

    public String getTitular() {
        return this.titular;
    };

    public void setTitular(String titular) {
      this.titular = titular;
    };

    public double getSaldo() {
        return this.saldo;
    };

    public void depositar(double valor) {
        if(valor > 0) {
        this.saldo += valor;
        System.out.printf("Valor depositado: %.2f\n", valor);
        }
        else {
            System.out.println("O valor do depósito deve ser maior que zero!\n");
        }
    }

    public boolean sacar(double valor) {
        if(valor > 0) {
            if(saldo >= valor) {
            this.saldo -= valor;
            System.out.printf("Valor do saque: %.2f\n", valor);
            return true;
            } else {
                System.out.println("Saldo insuficiente para o saque!\n");
                return false;
            }

        }
        else {
            System.out.println("O valor do saque deve ser maior que zero!\n");
            return false;
        }
    }
}
