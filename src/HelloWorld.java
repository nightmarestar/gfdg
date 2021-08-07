public class HelloWorld {
    public static void main(String[] args){
        /*
        //定义byte类型的变量
        byte b = 10;
        System.out.println(b);

        //定义short类型的变量
        short s = 100;
        System.out.println(s);

        //定义int类型的变量
        int i = 1000;
        System.out.println(i);

        //定义long类型的变量
        long l = 10000000000l;
        System.out.println(l);

        //定义float类型的变量
        float f = 3.14f;
        System.out.println(f);

        //定义double类型的变量
        double d = 13.14;
        System.out.println(d);

        //定义char类型的变量
        char c = 'h';
        System.out.println(c);

        //定义boolean类型的变量
        boolean bb = false;
        System.out.println(bb);
         */
        /*
        //自动类型转换
        double d = 10;
        System.out.println(d);

        //强制类型转换
        int i = (int)88.88;
        System.out.println(i);
         */

        /*
        //自增自减运算符
        //参与操作使用
        int i = 10;
        int j = i++;            //先将i赋值给j，再执行自增操作
        int k = ++i;            //i由11自增为12，再进行赋值操作
        System.out.println(j);  //输出10
        System.out.println(k);  //输出12

        int x = 10;
        int y = x--;            //先将x赋值给y，再执行自减操作
        int z = --x;            //x由9自减为8，再进行赋值操作
        System.out.println(y);  //输出10
        System.out.println(z);  //输出8
         */

        //三元运算符
        int weight1 = 180;
        int weight2 = 200;
        System.out.println((weight1 < weight2)?true:false);

        int height1 = 150;
        int height2 = 165;
        int height3 = 210;
        int a = height1 > height2 ? height1 : height2;
        System.out.println(a);
        System.out.println(a > height3 ? a :height3);

    }
}
