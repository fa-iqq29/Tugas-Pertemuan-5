/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pertemuankelima;

class InsufficientBalanceException extends Exception {
    public InsufficientBalanceException(String message) {
        super(message);
    }
}

public class PenerapanException {
    public static void transaksi(double saldo, double tarikTunai) 
        throws InsufficientBalanceException {
        
        if (tarikTunai > saldo) {
            throw new InsufficientBalanceException(
                "Saldo tidak cukup. Saldo Anda: " + saldo + ", jumlah penarikan: " + tarikTunai
            );
        }
        System.out.println("Penarikan berhasil! Sisa saldo: " + (saldo - tarikTunai));
    }

    public static void main(String[] args) {
        try {
            transaksi(50000, 100000); 
        } catch (InsufficientBalanceException e) {
            System.out.println("Caught Exception: " + e.getMessage());
        }
    }
}
