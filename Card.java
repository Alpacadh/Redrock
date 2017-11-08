import java.util.Random;

public class Card {
    public static void main(String[] args) {
        Poker poker = new Poker();
        System.out.println("洗牌前");
        poker.orgin();
        System.out.println("第一种方法洗牌后");
        poker.method1();
        System.out.println("第二种方法洗牌后");
        poker.method2();
        System.out.println("第三只方法洗牌后");
        poker.method3();
    }
}

class Poker {
    String card[] = new String[52];
    String[] point = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
    String[] suits = {"♥", "♦", "♠", "♣"};

    void orgin() {
        int a = 0;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 13; j++) {
                card[a] = suits[i] + point[j];
                System.out.print(" " + card[a]);
                a += 1;
            }
            System.out.println();
        }
    }

    void method1() {
        String card1[] = new String[52];
        for (int i = 0; i < 52; i++) {
            card1[i] = card[i];
        }
        int b = 0;
        for (int i = 0; i < 52; i += 2) {
            int a = 26;
            card[i] = card1[i / 2 + a];
            card[i + 1] = card1[i / 2];
            a--;
        }
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 13; j++) {
                System.out.print(" " + card[b]);
                b += 1;
            }
        }
        System.out.println();
    }

    void method2() {
        String card2[] = new String[52];
        int c = 0;
        for (int i = 0; i < 52; i++) {
            card2[i] = card[i];
        }
        for (int i = 51; i >= 0; i--) {
            int a = (int) (0 + Math.random() * (i - 1));
            String b = card[i];
            card[i] = card2[a];
            card2[a] = b;
        }
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 13; j++) {
                System.out.print(" " + card[c]);
                c += 1;

            }
        }
        System.out.println();
    }

    void method3() {
        Random rd = new Random();
        int b = 0;
        for (int i = 0; i < 52; i++) {
            int j = rd.nextInt(52);
            String temp = card[i];
            card[i] = card[j];
            card[j] = temp;
        }
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 13; j++) {
                System.out.print(" " + card[b]);
                b += 1;

            }
        }
    }
}







