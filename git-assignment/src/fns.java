import javax.lang.model.util.ElementScanner6;
import java.util.Map;
import java.util.TreeMap;

public class fns {
    public static void main(String[] args) throws Exception {
        fibonacci(7);
        System.out.println();
        fizzbuzz(15);
        System.out.println();
        frequencyOfWords();
    }

    public static void fibonacci(int n) {
        int a = 1, b = 1, c;
        System.out.print(a + " ");
        System.out.print(b + " ");
        for (int i = 3; i <= n; i++) {
            c = a + b;
            a = b;
            b = c;
            System.out.print(c + " ");
        }
    }

    public static void fizzbuzz(int n) {
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0)
                System.out.print("FIZZBUZZ ");
            else if (i % 3 == 0)
                System.out.print("FIZZ ");
            else if (i % 5 == 0)
                System.out.print("BUZZ ");
            else
                System.out.print(i + " ");

        }
    }

    public static void frequencyOfWords(){
        String str="quick fox lazy dog quick donkey fire fox";
        System.out.println(str);
        String[] sArr=str.split(" ");
        Map<String, Integer> m=new TreeMap<>();

        for(int i=0;i<sArr.length;i++) {
            if (m.containsKey(sArr[i])) {
                m.put(sArr[i], m.get(sArr[i]) + 1);
            } else {
                m.put(sArr[i], 1);
            }
        }
        for(Map.Entry<String,Integer> e: m.entrySet()) {
            System.out.print(e.getKey()+": "+e.getValue()+" ");
        }
    }
}
