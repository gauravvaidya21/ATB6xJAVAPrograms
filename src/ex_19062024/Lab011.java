package ex_19062024;

public class Lab011 {

    public static void main(String[] args) {

        //relational operators

        int age2=98;

        int age3=89;

        boolean result= age2>  age3;

        System.out.println(result);

        boolean result1 = age2>= age3;

        System.out.println(result1);


        boolean result2 = age2<= age3;

        System.out.println(result2);

        boolean result4 = age2< age3;

        System.out.println(result4);

        int ja=19;
        int ba=19;

        boolean result5 = ja<= ba;

        System.out.println(result5);

        System.out.println(ja==ba);

        System.out.println('A'==65); //ascii value

        System.out.println('A'!=65);

        System.out.println(!(56>90)); // not->false== true

        System.out.println(!(56<90)); //not-> true== false

        System.out.println(!!(56>90));// not->(true)->not->false==false

        System.out.println(!!!(56>90));


    }
}
