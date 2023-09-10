package leetcode.solutions.easy.old._1342_StepstoReduceaNumbertoZero;

public class ReduceANumberToZero {
    public static void main(String[] args) {
        System.out.println(numberOfSteps(14));
    }

    public static int numberOfSteps(int num) {
        int stepsCount = 0;

        while(num > 0){
            num = (num%2 == 0) ? num/2 : num - 1;
            stepsCount++;
        }

        return stepsCount;
    }

//    public static int numberOfSteps(int num) {
//        int stepsCount = 0;
//        return processNum(num, stepsCount);
//    }

    public static int processNum(int num, int stepsCount){

        if(num == 0){
            return stepsCount;
        }

        if(num%2 == 0){
            processNum(num/2, ++stepsCount);
        } else {
            processNum(--num, ++stepsCount);
        }

       return stepsCount;
    }
}
