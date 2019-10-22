/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recursividade;

/**
 *
 * @author mateu
 */
public class Recursividade {

    public int fatorial(int n) {

        if (n == 0) {
            return 1;
        }
        return n * fatorial(n - 1);
    }

    public int fibonacci(int num) {
        if (num == 1 || num == 2) {
            return 1;
        } else {
            return fibonacci(num - 1) + fibonacci(num - 2);
        }
    }

    public int func(int x) {

        if (x == 0) {
            return x;

        } else {
            x = x / 10;
            return func(x);
        }
    }
  

    public int funcSoma(int v[]) {
        int i = 0;
        int soma = 0;
        if (i > 10) {
            return 0;
        } 
        soma = soma + funcSoma(v[1+i]);
        return soma;

    }
    public int somaN(int n){
        int soma = 0;
        if(n == 1){
            return 1;
        }
        return soma = soma + somaN(n -1);
        
    }

}
