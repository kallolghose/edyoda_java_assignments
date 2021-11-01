package revision.conditions;

public class PracticeFor {

    public void donotKnowWhatClassObject(Object obj){
        //Some functionality
    }

    public int findSumOfArray(int [] arr){
        int length = arr.length;
        int sum = 0;
        //for(initialization; condition, increment/decrement)
        for(int i = 0; i < length; i = i + 1){
            sum = sum + arr[i];
        }
        return sum;
    }

    public void printRightTrianglePattern(int n){
        for(int i = 1; i <= n; i++){
            for (int k = 1; k <= i; k++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }

}
