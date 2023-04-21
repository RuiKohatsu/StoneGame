public class Main {
    public static void main(String[] args) {
        System.out.println("""
                ------------------------------
                石取りゲームを開始します。""");
        var stone = StoneGame.stoneInit();
        var getLimit = StoneGame.getLimit();
        String[] member = StoneGame.nameInput();
        var symbol = StoneGame.symbolInit();
        var turn = 0;


//        System.out.println("石の総数："+ stone + "個");
//        System.out.println("１度に取れる石の数：" + getLimit + "個");
        System.out.println("------------------------------");

        System.out.println("残り："+ stone + "個");
        for(var i = 0; i < stone; i++){
            System.out.print(symbol);
        }
        System.out.println("");
        System.out.println("------------------------------");


        while(true){
            stone = StoneGame.stoneGet(member, stone, turn, getLimit);

            if(stone <= 0){
                if(turn == 0){
                    System.out.println("勝者："+ member[member.length - 1]);
                    System.out.println("敗者："+ member[0]);
                }else {
                    System.out.println("勝者：" + member[turn - 1]);
                    System.out.println("敗者："+ member[turn]);
                }
                break;
            }
            System.out.println("残り：" + stone + "個");

            for(var i = 0; i < stone; i++){
                System.out.print(symbol);
            }
            System.out.println("");
            System.out.println("------------------------------");

            if(turn == member.length-1){
                turn = 0;
            }else{
                turn += 1;
            }

        }

    }
}