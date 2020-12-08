/*  Calculate all permutations of coins (in array coins) which add up to the value N */


package algorithms;


public class CoinsSelection {
    public static int[] arr;
    public static int total;
    public static int[] coins = {5,10,20};
    public static int coins_length = 0;
    public static int matches = 0;

    public static void recurse(int pos){

        if(sum(arr)==total){

            return;
        }

        for(int j = pos; j < coins_length; j++){
            arr[j]=arr[j]+1;
            recurse(j);
            if(wt_sum(arr)==total) {
                matches++;
                for (int i= 0; i< arr.length; i++) {
                    System.out.println(arr[i]+" - coins of value : "+coins[i]);
                }
                System.out.println("---");
            }

            arr[j]=arr[j]-1;
        }
    }

    public static int sum(int[] arr){
        int sum = 0;
        for( int i = 0; i < arr.length; i++){
            sum = sum + arr[i];
        }
        return sum;
    }

    public static int wt_sum(int[] arr){
        int sum = 0;
        for( int i = 0; i < arr.length; i++){
            sum = sum + (arr[i]*coins[i]);
        }
        return sum;
    }


    public static void main(String[] args) {
        total = 40;
        coins_length = coins.length;
        arr = new int[coins_length];
        recurse(0);

        System.out.println("Matches : "+matches);
    }
}
