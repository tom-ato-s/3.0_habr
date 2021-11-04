//https://habr.com/ru/post/440436/
//        Практические задачи по Java
//
//        3.0. Двоичный поиск
//
//        Задача:
//
//        Напишите метод, который проверяет, входит ли в массив заданный элемент или нет.
//        Используйте перебор и двоичный поиск для решения этой задачи.
//        Сравните время выполнения обоих решений для больших массивов (например, 100000000 элементов).


import java.util.Arrays;

class Search_ {
    static int n = 200_000_000; // кол-во элементов в массиве
    static int up = 100;
    static int doun = 1;

   public static int Search(double[] arr, double key) {
        for(int i = 0; i<n; i++) {
            if(arr[i] == key) return i;
        }return -1;
    }

   public static int BinarySearch(double[] arr, double key) {
       int l = arr.length;
return BinarySearchIn(arr, key, 0, l-1);
    }

    private static int BinarySearchIn(double[] arr, double key, int begin, int end) {
        int midle = (end + begin)/2;
 //       System.out.print(midle+ " ");
        if(end<begin) {//делить нечего
            return -1;
        }
        if(key == arr[midle])
            return midle;

        else { if(key<arr[midle]) {
                return BinarySearchIn( arr, key, begin, midle-1);
             } else {
                return BinarySearchIn(arr, key, midle+1, end);
            }
        }

    }

    public static double[] random_(int n) {
        double[] arr = new double[n];
        for(int i= 0; i<n; i++) {
//         arr[i] = i;

 //        arr[i] = doun+(int)((up-doun)*Math.random());
 //           if(arr[i] == 50) System.out.print(i + " ");
            arr[i] = Math.random();
 //           System.out.print(arr[i] + " ");
        }
 //       System.out.println(" ");
        return arr;
    }

//    public void printArr(double arr[]) {
//        int le = arr.length;
//        for(int i = 0; i< le; i++) {
//            System.out.print(arr[i]);
//        }
//        System.out.println( "");
//    }

    public static void main(String[] args) {
        final long startTime00 = System.currentTimeMillis();
      double[] array = random_(n);
        final long finTime00 = System.currentTimeMillis()-startTime00;
        System.out.println(finTime00);

        final long startTime0 = System.currentTimeMillis();
       Arrays.sort(array);
        final long finTime0 = System.currentTimeMillis()-startTime0;
        System.out.println(finTime0);

        final long startTime1 = System.currentTimeMillis();
        System.out.println("Search " + Search(array,  0.1));
        final long finTime1 = System.currentTimeMillis()-startTime1;
        System.out.println(finTime1);

        final long startTime2 = System.currentTimeMillis();
        System.out.println("BinarySearch " + BinarySearch(array, 0.1));
        final long finTime2 = System.currentTimeMillis()-startTime2;
        System.out.println(finTime2);



    }
    }
