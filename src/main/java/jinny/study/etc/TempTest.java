package jinny.study.etc;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

public class TempTest {

    public static void main(String[] args) {

//        int buyInType = 6;
//        int num = buyInType & 64;
//
//        System.out.println(num);
//
//        String emoji = "\uD83C\uDDF9\uD83C\uDDED WEPC $30, $10,000 GTD \uD83C\uDDF9\uD83C\uDDED";
//        System.out.println(emoji);
//
//
//        Java01_Fundtion classe = new Java01_Fundtion();
//        System.out.println(classe.getClass().getName());
//        System.out.println(classe.getClass().getSimpleName());

//        String normal = "Zodiac Bounty 105";
//        String normal2 = "Zodiac Bounty a105";
//        String cny = "Zodiac Bounty ¥105";
//
//        System.out.println(normal.getBytes(Charset.forName("UTF-8")));
//
//        System.out.println(normal.length());
//        System.out.println(normal2.length());
//        System.out.println(cny.length());


//        emojiTest();


        String brandname = "brand aabb";
        System.out.println(brandname + " | " + brandname.indexOf("brand aa"));


//        numberAccTest();

        streamForeachTest();
    }

    private static void emojiTest() {
        String name = "\uD83C\uDDF9\uD83C\uDDED WEPC $10, $5,000 GTD \uD83C\uDDF9\uD83C\uDDED ";
        System.out.println(name);
        if(name.startsWith("\uD83C")) {
            System.out.println("emoji");
        } else {
            System.out.println("not emoji");
        }
    }


    private static void numberAccTest() {

        long num1 = 10450;

        System.out.println((num1/2));

        double num2 = 10.255;

        DecimalFormat dollarFormatter = new DecimalFormat("$#,###.###");

        System.out.println(dollarFormatter.format(num2));

    }

    private static void streamForeachTest() {
        List<String> testList = new ArrayList<>();
        testList.add("A");
        testList.add("B");
        testList.add("C");
        testList.add("D");
        testList.add("E");

        testList.stream().forEach(d -> {
            System.out.println(d);
            if (d.equals("B")) {
                System.out.println("pass");
            }
        });
    }

}