import java.util.Scanner;
import java.util.Arrays;
public class StoneGame {
    public static int stoneGet(String[] member, int stone, int turn, int getLimit){
        String player = member[turn];
        System.out.println("プレイヤー" + player + "の番");
        System.out.println("石の数を入力してください。（1〜"+ getLimit +"まで入力可能です。）");
        var sc = new Scanner(System.in);

        while(true) {
            var s1 = sc.nextLine();
            var get = Integer.parseInt(s1);
            if (get > getLimit || get < 1) {
                System.out.println("1~"+ getLimit +"の間で入力してください。");
            } else {
                stone = stone - get;
                return stone;
            }
        }
    }

    public static int stoneInit(){
        System.out.println("石の総数を指定してください");
        var sc = new Scanner(System.in);
        while(true){
            var s1 = sc.nextLine();
            var stone = Integer.parseInt(s1);
            if (stone < 10 || stone > 100) {
                System.out.println("10~100の間で入力してください。");
            } else {
                return stone;
            }
        }
    }

    public static int getLimit(){
        System.out.println("1度にとれる石の数を指定してください");
        var sc = new Scanner(System.in);
        while(true){
            var s1 = sc.nextLine();
            var getLimit = Integer.parseInt(s1);
            if (getLimit < 1 || getLimit > 10) {
                System.out.println("1~10の間で入力してください。");
            } else {
                return getLimit;
            }
        }
    }
    public static String[] nameInput(){
        var sc = new Scanner(System.in);
        System.out.println("プレイヤーを指定してください");
        var name = sc.nextLine();
        String[] member = name.split(",");
        return member;
    }

    public static char symbolInit(){
        var sc = new Scanner(System.in);
        System.out.println("石の記号を指定してください");
        var symbol = sc.next().charAt(0);
        return symbol;

    }
}
