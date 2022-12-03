import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import java.util.Scanner;

class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        try {
            if (s.length() == 3) {
                String[] mat = s.split("");
                int a = Integer.parseInt(mat[0]);
                int b = Integer.parseInt(mat[2]);
                String c = String.valueOf(s.charAt(1));
                if ((a > 0 && a < 10) && (b > 0 && b < 10)) {
                    if (c.equals("*")  || c.equals("/") || c.equals("+") || c.equals("-")) {
                        eval(s);
                    } else {
                        System.out.println("Error");
                    }
                } else {
                    System.out.println("int more 10 or less 0 ");
                }
            } else if (s.length() == 5) {
                String[] mat = s.split("");
                int a = Integer.parseInt(mat[0]);
                int b = Integer.parseInt(mat[2]);
                int d = Integer.parseInt(mat[4]);
                String c = String.valueOf(s.charAt(1));
                String c1 = String.valueOf(s.charAt(3));
                if ((a > 0 && a < 10) && (b > 0 && b < 10) && (d > 0 && d < 10)) {
                    if ((c.equals("*") || c.equals("/") || c.equals("+") || c.equals("-")) && (c1.equals("*") || c1.equals("/") || c1.equals("+") || c1.equals("-"))) {
                        eval(s);
                    } else {
                        System.out.println("Error");
                    }
                } else {
                    System.out.println("int more 10 or less 0 ");
                }
            }
        } catch (Exception e) {
            System.out.println();
        }

    }

    public static void eval(String s) {
        try {
            ScriptEngineManager manager = new ScriptEngineManager();
            ScriptEngine engine = manager.getEngineByName("js");
            Object result = engine.eval(s);
            System.out.println(result);
        } catch (Exception e) {
            System.out.println("ddfdf");
        }

    }
}





