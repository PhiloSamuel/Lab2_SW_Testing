import java.util.ArrayList;

public class max_min {
//
//    public int getMax(int [] arr) {
//        int max = 0;
//
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] > max) {
//                max = arr[i];
//            }
//        }
//        return max;
//    }
//
//    public int getMin(int [] arr) {
//        int min = arr[0];
//
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] < min) {
//                min = arr[i];
//            }
//        }
//        return min;
//    }


    public Integer getMax(ArrayList<Integer> arr){
        if(arr.size() == 0){
        return null;
    }
        if(arr.size() == 1){
            return arr.get(0);
        }
        Integer max = arr.get(0);
        for(int i = 1; i < arr.size(); i++){
            if(arr.get(i) > max){
                max = arr.get(i);
            } }
        return max; }
    public Integer getMin(ArrayList<Integer> arr){
        if(arr.size() == 0){
        return null;
    }
        if(arr.size() == 1){
            return arr.get(0);
        }
        Integer min = arr.get(0);
        for(int i = 1; i < arr.size(); i++){
            if(arr.get(i) < min){
                min = arr.get(i);
            } }
        return min; }

    public static void main(String[] args) {

//        int [] myArr = {10,2,4,6,21};
        max_min x = new max_min();

//        System.out.println("Max = "+ x.getMax(myAarr));
//        System.out.println("Min = "+ x.getMin(myArr));
    }
}




