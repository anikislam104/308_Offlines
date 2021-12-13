package Offline2;

import java.util.Scanner;

public class mainClass {
    public static void main(String[] args) {
        String input;
        Scanner s1=new Scanner(System.in);
        input=s1.nextLine();
        //System.out.println(input);
        String[] strings;
        strings=input.split("\\.");
        //System.out.println(strings[1]);
        //System.out.println(strings.length);
        if(strings[1].equals("c")){
            Parser parser=new C();
            System.out.println("Parser name is C");
            System.out.println("Font:"+parser.getFont());
        }
        else if (strings[1].equals("cpp")){
            Parser parser=new CPP();
            System.out.println("Parser name is CPP");
            System.out.println("Font:"+parser.getFont());
        }
        else{
            Parser parser=new Python();
            System.out.println("Parser name is Python");
            System.out.println("Font:"+parser.getFont());
        }
    }
}
