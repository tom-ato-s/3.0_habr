// class Search {
//
//    static int n; // кол-во элементов в массиве
//    private int key_; // искомое значение
//    int up = 100;
//    int doun = 1;
//    int arr_[] ;  // массив случайных чисел
//
//
//
//   int Search(int key_, int n) { // конструктор
//       int index = 0;
//        this.key_ = key_;
//        this.n = n;
//        random_(n); // заполнение массива случафйными числами
//        for(int i = 0; i<n; i++) {
//            if(arr_[i] == key_) {index = i; break;}
//            else index = 0;
//              }
//    return index;}
//
//   public void random_(int n) {
//        this.n = n;
//       int arr_[] = new int[n];
//        this.arr_= arr_;
//        for(int i= 0; i<n; i++) {
// //          arr_[i] = i;
//            arr_[i] = doun+(int)((up-doun)*Math.random());
// //           System.out.print(arr_[i] + " ");
//        } // System.out.println(" ");
//    }
//
//     public static void main(String[] args) {
//       final long startTime = System.currentTimeMillis();
//       Search r =new Search();
// //      r.random_(5);
//        int k = 20;
//       int index_ =  r.Search(k, 200_000_000);
//        System.out.println("key_" + k + " елементов  n = " + n + " index = " + index_);
//        final long endTime = System.currentTimeMillis();
//         System.out.println("Total execution time " + (endTime-startTime));
//    }
//
//}
