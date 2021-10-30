package revision.conditions;

public class PracticeVarargs {

    public void inputMultipleNumbers(int ...arg){

        for(int i=0; i<arg.length; i++){
            int num = arg[i];
            System.out.println(num);
        }

        //For each
        for(int num : arg){
            System.out.println(num);
        }
    }

}
