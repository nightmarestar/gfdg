package PokerDemo;

import java.util.ArrayList;
import java.util.Collections;

public class PokerDemo {
    public static void main(String[] args) {
        //创建一个牌盒
        ArrayList<String> poker = new ArrayList<>();

        String[] color = {"♦️","♣️","♥️","♠️"};
        /*for (int i = 0; i < color.length; i++) {
            System.out.println(color[i]);
        }*/
        String[] number = {"3","4","5","6","7","8","9","10","J","Q","K","A","2"};

        //将扑克牌装入牌盒
        for (int i = 0; i < color.length; i++) {
            for (int j = 0; j < number.length; j++) {
                poker.add(color[i]+number[j]);
            }
        }
        poker.add("小王");
        poker.add("大王");
        //System.out.println(poker);

        //将牌打散，使用Collections的shuffle()方法
        Collections.shuffle(poker);
        //System.out.println(poker);

        //创建三位玩家
        ArrayList<String> zhangsan = new ArrayList<>();
        ArrayList<String> lisi = new ArrayList<>();
        ArrayList<String> wangwu = new ArrayList<>();
        ArrayList<String> dipai = new ArrayList<>();

        //发牌，遍历集合给三个玩家发牌
        for (int i = 0; i < poker.size(); i++) {
            String s = poker.get(i);
            if(i < 3){
                dipai.add(s);
            }else if(i % 3 == 0){
                zhangsan.add(s);
            }else if(i % 3 == 1){
                lisi.add(s);
            }else if(i % 3 == 2){
                wangwu.add(s);
            }

        }

        //看牌，遍历集合，查看每位玩家手中的牌
        System.out.println("张三："+zhangsan);
        System.out.println("李四："+lisi);
        System.out.println("王五："+wangwu);
        System.out.println("底牌："+dipai);

    }
}
