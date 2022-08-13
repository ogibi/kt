package calc;
import java.util.ArrayList;
import java.util.Scanner;


class Main {

    public static void main(String[] args) throws Exception {
        while (true) {
            Scanner x = new Scanner(System.in);  // Create a Scanner object
            System.out.println("Введите операцию");

            String i = x.nextLine();
            String arab = "0123456789";
            String znak = "+-*/";

            int res2 = 0;
            ArrayList<Integer> ali = new ArrayList<Integer>();
            String g = i.trim();
            String f = "\\+";

            if (g.contains("-")) {
                f = "\\-";
            } else if (g.contains("*")) {
                f = "\\*";
            } else if (g.contains("/")) {
                f = "\\/";
            }

            String[] num = g.split(f);
                for (int k = 0; k < num.length; k++) {
                    if (num[k].equals("I")) {
                        int w_int = Romanian.I.getTr();
                        ali.add(w_int);
                    } else if (num[k].equals("II")) {
                        int w_int = Romanian.II.getTr();
                        ali.add(w_int);
                    } else if (num[k].equals("III")) {
                        int w_int = Romanian.III.getTr();
                        ali.add(w_int);
                    } else if (num[k].equals("IV")) {
                        int w_int = Romanian.IV.getTr();
                        ali.add(w_int);
                    } else if (num[k].equals("V")) {
                        int w_int = Romanian.V.getTr();
                        ali.add(w_int);
                    } else if (num[k].equals("VI")) {
                        int w_int = Romanian.VI.getTr();
                        ali.add(w_int);
                    } else if (num[k].equals("VII")) {
                        int w_int = Romanian.VII.getTr();
                        ali.add(w_int);
                    } else if (num[k].equals("VIII")) {
                        int w_int = Romanian.VIII.getTr();
                        ali.add(w_int);
                    } else if (num[k].equals("IX")) {
                        int w_int = Romanian.V.getTr();
                        ali.add(w_int);
                    } else if (num[k].equals("X")) {
                        int w_int = Romanian.X.getTr();
                        ali.add(w_int);
                    }
                }

            if (!i.contains("1") && !i.contains("2") && !i.contains("3") && !i.contains("4") && !i.contains("5") && !i.contains("6") && !i.contains("7") && !i.contains("8") && !i.contains("9")) {
                if (i.contains("+")) {
                    res2 = ali.get(0) + ali.get(1);
                } else if ((i.contains("-"))) {
                    res2 = ali.get(0) - ali.get(1);
                } else if ((i.contains("*"))) {
                    res2 = ali.get(0) * ali.get(1);
                } else if ((i.contains("/"))) {
                    res2 = ali.get(0) / ali.get(1);
                }
            }
                String p = String.valueOf(res2);
                if (res2 == 1){
                    p = Romanian.I.name();
                }
                else if (res2 == 2) {
                p = Romanian.II.name();
                }
                else if (res2 == 3) {
                p = Romanian.III.name();
                }
                else if (res2 == 4) {
                p = Romanian.IV.name();
                }
                else if (res2 == 5) {
                p = Romanian.V.name();
                }
                else if (res2 == 6) {
                p = Romanian.VI.name();
                }
                else if (res2 == 7) {
                p = Romanian.VII.name();
                }
                else if (res2 == 8) {
                p = Romanian.VIII.name();
                }
                else if (res2 == 9) {
                p = Romanian.IX.name();
                }
                else if (res2 == 10) {
                p = Romanian.X.name();
                }
                else if (res2 == 11){
                p = Romanian.X.name() + Romanian.I.name();
                }
                else if (res2 == 12){
                p = Romanian.X.name() + Romanian.II.name();
                }
                else if (res2 == 13){
                p = Romanian.X.name() + Romanian.III.name();
                }
                else if (res2 == 14){
                p = Romanian.X.name() + Romanian.I.name() + Romanian.V.name();
                }
                else if (res2 == 15){
                p = Romanian.X.name() + Romanian.V.name();
                }
                else if (res2 == 16){
                p = Romanian.X.name() + Romanian.V.name() + Romanian.I.name();
                }
                else if (res2 == 17){
                p = Romanian.X.name() + Romanian.V.name() + Romanian.II.name();
                }
                else if (res2 == 18){
                p = Romanian.X.name() + Romanian.V.name() + Romanian.III.name();
                }
                else if (res2 == 19){
                p = Romanian.X.name() + Romanian.I.name() + Romanian.X.name();
                }
                else if (res2 == 20){
                p = Romanian.X.name() + Romanian.X.name();
                }
                else if (res2 <= 0  && !i.contains("1") && !i.contains("2") && !i.contains("3") && !i.contains("4") && !i.contains("5") && !i.contains("6") && !i.contains("7") && !i.contains("8") && !i.contains("9")){
                    if (!i.isEmpty())
                p = ("Результатом работы калькулятора с римскими числами могут быть только положительные числа");
                }
                System.out.println(p);



            for (int ar = 0; ar < arab.length(); ar++) {
                String s = String.valueOf(ar);
                if (i.contains("I") && i.contains(s)) {
                    throw new Exception("используются одновременно разные системы счисления");
                } else if (i.contains("V") && i.contains(s)) {
                    throw new Exception("используются одновременно разные системы счисления");
                } else if (i.contains("X") && i.contains(s)) {
                    throw new Exception("используются одновременно разные системы счисления");
                }
            }
            int charsum = 0;
            for (int ch = 0; ch < znak.length(); ch++) {
                char c = znak.charAt(ch);
                String s = String.valueOf(c);
                for (int k = 0; k < i.length(); k++) {
                    String[] w = i.split("");
                    if (w[k].contains(s)) {
                        charsum += 1;
                    }
                }
                if (charsum > 1) {
                    throw new Exception("формат математической операции не удовлетворяет заданию - два операнда и один оператор (+, -, /, *)");
                }
            }


            for (int k = 0; k < i.length(); k++) {
                if (i.contains("+") && !i.contains("I") && !i.contains("V") && !i.contains("X"))  {
                    String[] w = i.split("\\+");
                    for (String element : w) {
                        element = element.trim(); // убрать пробелы
                        for (int xr = 0; xr < w.length; xr++) {
                            int w_int = Integer.parseInt(element);
                            if (w_int > 10) {
                                throw new Exception("Число(а) вне диапозона от 1 до 10");
                            }
                        }
                    }
                } else if (i.contains("-") && !i.contains("I") && !i.contains("V") && !i.contains("X")) {
                    String[] w = i.split("\\-");
                    for (String element : w) {
                        element = element.trim(); // убрать пробелы
                        for (int xr = 0; xr < w.length; xr++) {
                            int w_int = Integer.parseInt(element);
                            if (w_int > 10) {
                                throw new Exception("Число(а) вне диапозона от 1 до 10");
                            }
                        }
                    }
                } else if (i.contains("/") && !i.contains("I") && !i.contains("V") && !i.contains("X")) {
                    String[] w = i.split("\\/");
                    for (String element : w) {
                        element = element.trim(); // убрать пробелы
                        for (int xr = 0; xr < w.length; xr++) {
                            int w_int = Integer.parseInt(element);
                            if (w_int > 10) {
                                throw new Exception("Число(а) вне диапозона от 1 до 10");
                            }
                        }
                    }
                } else if (i.contains("*") && !i.contains("I") && !i.contains("V") && !i.contains("X")) {
                    String[] w = i.split("\\*");
                    for (String element : w) {
                        element = element.trim(); // убрать пробелы
                        for (int xr = 0; xr < w.length; xr++) {
                            int w_int = Integer.parseInt(element);
                            if (w_int > 10) {
                                throw new Exception("Число(а) вне диапозона от 1 до 10");
                            }
                        }
                    }
                }
            }

            for (int k = 0; k < i.length(); k++) {
                String w = i.trim(); // убрать пробелы
                if (w.length() <= 2) {
                    throw new Exception("Введено только первое число");
                }
            }

            if (i.isEmpty()){
                throw new Exception("Пустая строка");
            }

            else calc(i);
        }
    }

    public static String calc(String input){
        int res = 0;

        if (input.contains("+") && !input.contains("I") && !input.contains("V") && !input.contains("X")) {
            String[] num = input.split("\\+");
            ArrayList<Integer> al = new ArrayList<Integer>();
            for (String element : num) {
                element = element.trim(); // убрать пробелы
                    int element_int = Integer.parseInt(element); //string to int
                    al.add(element_int); // adding each element to ArrayList
                }
                res = al.get(0) + al.get(1);
            }

        else if (input.contains("-") && !input.contains("I") && !input.contains("V") && !input.contains("X")) {
            String[] num = input.split("\\-");
            ArrayList<Integer> al = new ArrayList<Integer>();
            for (String element : num) {
                element = element.trim(); // убрать пробелы
                int element_int = Integer.parseInt(element); //string to int
                al.add(element_int); // adding each element to ArrayList
            }
            res = al.get(0) - al.get(1);
        }

        else if (input.contains("*") && !input.contains("I") && !input.contains("V") && !input.contains("X")) {
            String[] num = input.split("\\*");
            ArrayList<Integer> al = new ArrayList<Integer>();
            for (String element : num) {
                element = element.trim(); // убрать пробелы
                int element_int = Integer.parseInt(element); //string to int
                al.add(element_int); // adding each element to ArrayList
            }
            res = al.get(0) * al.get(1);
        }

        else if (input.contains("/") && !input.contains("I") && !input.contains("V") && !input.contains("X")) {
            String[] num = input.split("\\/");
            ArrayList<Integer> al = new ArrayList<Integer>();
            for (String element : num) {
                element = element.trim(); // убрать пробелы
                int element_int = Integer.parseInt(element); //string to int
                al.add(element_int); // adding each element to ArrayList
            }
            res = al.get(0) / al.get(1);
        }

        System.out.println(res);
        return input;
    }

}
