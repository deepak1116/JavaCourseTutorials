package controlflow;

public class ExamplesBreakAndContinue {
    public static void main(String[] args) {
        //Continue example
        int[] nrs1 = {0,1,2,3,4,5};
        for (int nr:nrs1){
            if (nr % 2 == 0){
                continue;
            }
            System.out.println(nr);
        }






        //Break example
        int[] nrs = {1,2,3,4,5,6,7,8,9,7,10};
        int index = -1;
        int search = 7;

        for (int i =0 ; i < nrs.length ; i++){
            if (nrs[i] == search) {
                index = i;
                break;
            }
        }
        System.out.println(index);
    }
}
