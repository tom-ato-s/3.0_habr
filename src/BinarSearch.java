//import java.util.Arrays;
//
//public class BinarSearch {
//
//    static int n; // кол-во элементов в массиве
//    private int key_; // искомое значение
//    int up = 100;
//    int doun = 1;
//    int arr_[] ;  // массив случайных чисел
//    int arrSort[]; // отсортированный массив
//    int l = arr_.length;
//
//    int Search(int key_, int n) { // конструктор
//        int index = 0;
//        this.key_ = key_;
//        this.n = n;
//        random_(n); // заполнение массива случафйными числами
//       arrSort =  sortArr(arr_);
//       int ret = 0;
//        int middle = l/2;
//        int begin = 0;
//        int end = l-1;
//        int rem = end-begin;
//        if(rem>=0) {
//            if (arrSort[middle] > key_) {
//                begin = begin;
//                end = middle;
//                rem = end - begin;
//                middle = middle / 2;
//                Search(key_, n/2);
//            } else {
//                if (arrSort[middle] < key_) {
//                    begin = middle+1;
//                    end = end;
//                    rem = end - begin;
//                    middle = middle + middle / 2;
//                    Search(key_, n/2);
//                } else ret =middle;
//            }
//        }else {if(l!= 0) ret = begin;
//              else System.out.println("массив пуст");
//              ret = -1;
//              }
//
////        for(int i = 0; i<n; i++) {
////            if(arr_[i] == key_) {index = i; break;}
////            else index = 0;
////        }
//       return ret; }
//
//
//    public int[] sortArr(int arr[]) {
//        int arrSort[] = new int[n];
//        this.arrSort= arrSort;
//        printArr(arr);
//        Arrays.stream(arr).sorted();
//        printArr(arr);
//        return arr;
//    }
//
//    public void printArr(int arr[]) {
//        int le = arr.length;
//        for(int i = 0; i< le; i++) {
//            System.out.print(arr[i]);
//        }
//        System.out.println( "");
//    }
//
//    public void random_(int n) {
//        this.n = n;
//        int arr_[] = new int[n];
//        this.arr_= arr_;
//        for(int i= 0; i<n; i++) {
//                     arr_[i] = i;
// //           arr_[i] = doun+(int)((up-doun)*Math.random());
//            //           System.out.print(arr_[i] + " ");
//        } // System.out.println(" ");
//    }
//
////    public static void main(String[] args) {
////
////        final long startTime = System.currentTimeMillis();
////        Search r =new Search();
////             r.random_(5);
////        int k = 20;
////        int index_ =  r.Search(k, 20);
////        System.out.println("key_" + k + " елементов  n = " + n + " index = " + index_);
////        final long endTime = System.currentTimeMillis();
////        System.out.println("Total execution time " + (endTime-startTime));
//
////    }
//}
