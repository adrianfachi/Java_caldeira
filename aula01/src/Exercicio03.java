public class Exercicio03 {
    public static void main(String[] args) {
        int[] numeros = new int[]{23, 10, 25};
        int maiorNumero = numeros[0];
        int menorNumero = numeros[0];
        double soma = 0.0;

        for(int i = 0; i < numeros.length; i++) {
            soma += numeros[i];
        }

        for(int i = 0; i < numeros.length; i++) {
            if (numeros[i] > maiorNumero) {
                maiorNumero = numeros[i];
            }
        }
        for(int i = 0; i < numeros.length; i++) {

            if (numeros[i] < menorNumero) {
                menorNumero = numeros[i];
            }
        }

        double media = soma / (double)numeros.length;
        System.out.println(media);
        System.out.println(maiorNumero);
        System.out.println(menorNumero);
    }
}
