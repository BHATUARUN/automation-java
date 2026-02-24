package test;

public class assignq11 {
    public static void main(String[] args) {

        int count = 0;
        int num = 2;
        int sum = 0;

        while(count < 100) {

            int flag = 0;

            for(int i=2; i<num; i++){
                if(num % i == 0){
                    flag = 1;
                    break;
                }
            }

            if(flag == 0){
                sum = sum + num;
                count++;
            }

            num++;
        }

        System.out.println(sum);
    }
}