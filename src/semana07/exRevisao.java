package semana07;

public class exRevisao {
    public static void main(String[] args) {
        double x = 10;
        double y = 15;
        double z = 1;
        System.out.println("Soma dos três valores: " + somarTresValores(x, y, z));
        System.out.println("Media dos três numeros: " + mediaTresValores(x, y, z));

        int n1 = 9;
        int n2 = 8;
        int n3 = 7;
        System.out.println("Maior valor: " + maiorValor(n1, n2, n3));
        System.out.println("Menor valor: " + menorValor(n1, n2, n3));
        for (int i = 0; i < 3; i++) {
            System.out.println("Arrays: " + devolveArray(x, y, z)[i]);         
        }
        System.out.println("Soma de Arrays: " + somaArray(x, y, z));
        System.out.println("Média dos 3 Array: " + mediaArray(x, y, z));
        System.out.println("Menor dos 3 Array: " + menorArray(x, y, z));
        System.out.println("Maior dos 3 Array: " + maiorArray(x, y, z));
    }

    public static double somarTresValores(double x, double y, double z){
        return x + y + z;
    }

    public static double mediaTresValores(double x, double y, double z){
        return (x + y + z) / 3;
    }

    public static int maiorValor(int x, int y, int z){
        if (x > y && x > z){
            return x;
        } else{
            if (y > x && y > z){
                return y;
            } else {
                return z;
            }
        }
    }

    public static int menorValor(int x, int y, int z){
        if (x < y && x < z){
            return x;
        } else{
            if (y < x && y < z){
                return y;
            } else {
                return z;
            }
        }
    }    

    public static double[] Array(double x, double y, double z){
        double[] array = new double [3];
        array[0] = x;
        array[1] = y;
        array[2] = z;
        return array;
    }

    public static double somaArray(double x, double y, double z){
        double[] array = new double [3];
        array[0] = x;
        array[1] = y;
        array[2] = z;

        return array[0] + array[1] + array[2];
    }

    public static double mediaArray(double x, double y, double z){
        double[] array = new double [3];
        array[0] = x;
        array[1] = y;
        array[2] = z;

        return (array[0] + array[1] + array[2]) / 3;
    }

    public static double menorArray(double x, double y, double z){
        double[] array = new double [3];
        array[0] = x;
        array[1] = y;
        array[2] = z;
        if (array[0] < array[1] && array[0] < array[2]){
            return array[0];
        } else{
            if (array[1] < array[0] && array[1] < array[2]){
                return array[1];
            } else {
                return array[2];
            }
        }
    }

    public static double maiorArray(double x, double y, double z){
        double[] array = new double [3];
        array[0] = x;
        array[1] = y;
        array[2] = z;
        if (array[0] > array[1] && array[0] > array[2]){
            return array[0];
        } else{
            if (array[1] > array[0] && array[1] > array[2]){
                return array[1];
            } else {
                return array[2];
            }
        }
    }
}
