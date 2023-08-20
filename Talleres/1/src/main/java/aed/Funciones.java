package aed;


class Funciones {
    int cuadrado(int x) {
        return x*x;
    }

    double distancia(double x, double y) {
        return Math.sqrt(x*x + y*y);
    }

    /*boolean esPar(int n) {
        if(n % 2 == 0) {
            return true;
        }
        else {
            return false;
        }
    }
*/
    boolean esPar(int n) {
        return (n % 2 == 0);
    }

    boolean esBisiesto(int n) {
        return (n % 4 == 0 && n % 100 != 0) || n % 400 == 0;
    }

    int factorialIterativo(int n) {
        int sum = 1;
        while(n > 0) {
            sum = sum * n;
            n = n -1;
        }
        return sum;
    }

    int factorialRecursivo(int n) {
        if(n==0) {
            return 1;
        }
        else {
            return n * factorialRecursivo(n-1);
        }
        
    }

    boolean esPrimo(int n) {
        if(n == 0 || n == 1) {
            return false;
        }
        int index = n - 1;
        while(index > 1) {
            if(n % index == 0) {
                return false;
            }
            index = index - 1;
        }
        return true;
    }

    int sumatoria(int[] numeros) {
        if(numeros.length == 0) {
            return 0;
        }
        int sum = 0;
        for(int i = 0; i < numeros.length; i++) {
            sum = sum + numeros[i];
        }
        return sum;
    }

    int busqueda(int[] numeros, int buscado) {
        for(int i = 0; i < numeros.length; i++) {
            if(numeros[i] == buscado) {
                return i;
            }
        }
        return -1;
    }

    boolean tienePrimo(int[] numeros) {
        for(int i = 0; i < numeros.length; i++) {
            if(esPrimo(numeros[i])) {
                return true;
            }
        }
        return false;
    }

    boolean todosPares(int[] numeros) {
        for(int i = 0; i < numeros.length; i++) {
            if(!esPar(numeros[i])) {
                return false;
            }
        }
        return true;
    }

    boolean esPrefijo(String s1, String s2) {
        if(s1.toCharArray().length > s2.toCharArray().length) {
            return false;
        }

        for(int i = 0; i < s1.toCharArray().length ; i++) {
            if(s2.toCharArray()[i] != s1.toCharArray()[i]) {
                return false;
            }
        }
        return true;
    }

    boolean esSufijo(String s1, String s2) {
        char[] firstWord = s1.toCharArray();
        char[] secondWord = s2.toCharArray(); 
        for(int i = 0; i < firstWord.length / 2; i++) {
            char tempLetter = firstWord[i];
            firstWord[i] = firstWord[firstWord.length-1-i];
            firstWord[firstWord.length-1-i] = tempLetter;

        }

        for(int i = 0; i < secondWord.length / 2; i++) {
            char tempLetter = secondWord[i];
            secondWord[i] = secondWord[secondWord.length-1-i];
            secondWord[secondWord.length-1-i] = tempLetter;

        }
        String reversedFirstWord = new String(firstWord); 
        String reversedSecondWord = new String(secondWord);  

        if(esPrefijo(reversedFirstWord, reversedSecondWord)) {
            return true;
        }
        else {
            return false;
        }

    }
}
