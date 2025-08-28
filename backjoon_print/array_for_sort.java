package backjoon_print;

public class array_for_sort {
    public static void main(String[] args){
        // 정렬
        int[] basket = {5, 3, 6, 1, 2, 4};
        for(int i = 0; i < basket.length - 1; i++){
            for(int j = i + 1; j < basket.length; j++){
                // basket[i] < basket[j] - 역순(내림) 정렬
                // 순차 정렬(오름)
                if(basket[i] > basket[j]) {
                    int tem = basket[i];
                    basket[i] = basket[j];
                    basket[j] = tem;
                }
            }
        }
        for(int i : basket){
            System.out.println(i);
        }

        System.out.println("==========");

        for(int k = 0; k < basket.length; k++){
            System.out.println(basket[k]);
        }
    }
}
