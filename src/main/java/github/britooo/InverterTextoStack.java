package github.britooo;

public class InverterTextoStack {
    public static String inverter(String input) {
        /*
            É óbvio que não precisamos de uma pilha para resolver esse
            problema, porém, precisamos desenvolver nosso raciocínio lógico!

            Então, não fique pilhado, use a classe Pilha.
        */

        Integer tamanho = input.length();

        Pilha<String> pilha = new Pilha<String>(tamanho);

        for (int i = 0; i < tamanho; i++) {
            System.out.println(String.valueOf(input.charAt(i)));
            pilha.push(String.valueOf(input.charAt(i)));
        }

        System.out.println(pilha.toString());

        String textoInvertido = "";

        while (!pilha.isEmpty()) {
            textoInvertido += pilha.pop();
        }

        return textoInvertido;
    }
}
