import java.util.*;


public class Main {
    public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！
        Scanner sc = new Scanner(System.in);
        String count = sc.nextLine();
        
        //cardset
        int[][] cardnumbers = new int[4][4];
        for(int i = 0; i < 4; i++){
            String temp = sc.nextLine();
            String[] line_numbers = temp.split(" ",0);
            int[] numbers = new int[4];
            for(int j = 0; j < 4; j++){
                numbers[j] = Integer.valueOf(line_numbers[j]);
            }
            cardnumbers[i] = numbers;
        }
        //bingo number
        int number = -1;
        while(sc.hasNextInt()){
            
            number = sc.nextInt();
            replace_number(number,cardnumbers);
        }
        
        if(is_reach(cardnumbers)){
        }else{
            System.out.println("no");
        }
        
    }
    public static boolean is_reach(int[][] cardnumbers){
        int temp = 0;
        int temp2 = 0;
        int temp3 = 0;
        
        for(int n = 0; n < 4; n++){
            if(cardnumbers[0][n] != 0)temp++;
            if(cardnumbers[n][0] != 0)temp2++;
            if(cardnumbers[n][n] != 0)temp3++;
        }
        
        if(temp == 1){
            for(int n = 0; n < 4; n++){
                if(cardnumbers[0][n] != 0)System.out.println(cardnumbers[0][n]);
            }
            return true;
        }
        
        if(temp2 == 1){
            for(int n = 0; n < 4; n++){
                if(cardnumbers[n][0] != 0)System.out.println(cardnumbers[n][0]);
            }
            return true;
        }
        
        if(temp3 == 1){
            for(int n = 0; n < 4; n++){
                if(cardnumbers[n][n] != 0)System.out.println(cardnumbers[n][n]);
            }
            return true;
        }
        
        return false;
    }
    public static boolean is_bingo(int[][] cardnumbers){
        int temp = 0;
        int temp2 = 0;
        int temp3 = 0;
        
        for(int n = 0; n < 4; n++){
            temp = temp + cardnumbers[0][n];
            temp2 = temp2 + cardnumbers[n][0];
            temp3 = temp3 + cardnumbers[n][n];
        }
        
        System.out.println(temp);
        System.out.println(temp2);
        System.out.println(temp3);
            
            
        if(temp == 0)return true;
        if(temp2 == 0)return true;
        if(temp3 == 0)return true;
        
        return false;
    }
    public static int[][] replace_number(int number,int[][] cardnumbers){
        for(int i = 0; i < cardnumbers.length; i++){
            for(int j = 0; j < cardnumbers[i].length; j++){
                if(cardnumbers[i][j] == number)cardnumbers[i][j] = 0;
            }
        }
        return cardnumbers;
    }
}