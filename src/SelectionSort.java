public class SelectionSort {
    static double[] list = {1,9,4.5,6.6,5.7,-4.5};

    public static void selectionSort(double[] list){
        for (int i = 0; i < list.length-1 ; i++) {
            double min = list[i];
            int index = i;

            for (int j = i+1; j < list.length ; j++) {
                if(min > list[j]){
                    min = list[j];
                    index = j ;
                }
            }
            if (index != i){
                list[index] = list[i];
                list[i] = min;
            }
        }
    }

    public static void main(String[] args) {
        selectionSort(list);
        for (int i = 0; i < list.length ; i++) {
            System.out.println(list[i] + "");
        }
    }
}
