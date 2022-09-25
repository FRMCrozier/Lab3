
import java.util.*;


public class Java3 {

    /**
     * Первое задание под вариантом 5 (номер по списку 3, номер группы 191):
     *Дано число N (1<= N => 26).
     * Вывести N последних строчных (т.е. маленьких) букв латинского алфавита в обратном порядке (начиная с буквы z). </>.
     */
    private static void First() {
        Random random = new Random();
        int N = random.nextInt(1,26);
        System.out.println(N + " characters from the end of alphabet in the reverse direction:");
        for (int i = 1; i <= N; i++){
            int res = (int)'z'-i+1;
            System.out.println((char)res);
        }

    }

    /**
     * Второе задание под вариантом 28 (номер по списку 3, номер группы 191):
     * Дан символ C и строка S. Удвоить каждое вхождение символа С в строку S.
     */
    private static void Second() {
        String alphabet ="abcdefghijklmnopqrstuvwxyz ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        int alphabet_lenght = alphabet.length();
        Random random = new Random();
        // String S = "Terror camp is clear";
        // char C = 'r';
        /**Генерация случайной строки относительно случайной длины,
         * а также случайного символа, который будет удваиваться */
        int lenght = random.nextInt(30,100);
        int number_for_C = random.nextInt(alphabet_lenght);
        char C = alphabet.charAt(number_for_C);
        StringBuilder S = new StringBuilder();
        for(int i = 0; i < lenght; i++) {
            int number = random.nextInt(alphabet_lenght);
            S.append(alphabet.charAt(number));
        }
        /**Удвоение символа каждого С в строке S*/
        String CC = String.valueOf(C);
        System.out.println("Your string: " + S.toString());
        System.out.println("Your string with doubled characters " + C + " : "+ S.toString().replaceAll(CC, CC + CC));

    }
    /**
     * Третье задание под вариантом 51 (номер по списку 3, номер группы 191):
     * Дана строка, состоящая со слов кириллицей, набранных заглавными буквами и разделенных пробелами (одним или несколькими).
     * Вывести строку, содержащую эти же слова, разделенные одним пробелом и расположенные в алфавитном порядке.
     */
    private static void Third() {
        String str = "РУАЛЬ АМУНДСЕН  ОТКРЫЛ  СЕВЕРОЗАПАДНЫЙ ПРОХОД ЧЕРЕЗ  АРКТИКУ";
        System.out.println("Your string: \n" + str);
        str = str.replaceAll("  "," ");
        String [] strArray = str.split(" ");
        Arrays.sort(strArray);
        str = Arrays.toString(strArray).replaceAll("\\p{P}", "");
        System.out.println("Your string after sorting: \n" + str);
    }

    /**
     * Четвертое задание (дополнительное) под вариантом 62 (номер по списку 3, номер группы 191):
     * Дана строка-предложение заданное кириллицей.
     * Зашифровать ее, выполнив циклическую замену каждой буквы на следующую за ней в алфавите и сохранив при этом регистр букв
     * («а» перейдет в «б», «а» — в «б», «б» — в «в», «я» — в «а» и т. д.).
     * Букву «ё» в алфавите не учитывать («е» должна переходить в «ж»).
     * Знаки препинания и пробелы не изменять.
     */
    private static void Fourth() {
        String alphabet ="абвгдежзийклмнопрстуфхцчшщъыьэюя.,!? АБВГДЕЖЗИЙКЛМНОПРСТУФХЦЧШЩЪЫЬЭЮЯ";
        int alphabet_lenght = alphabet.length();
        Random random = new Random();
        /**Генерация случайной строки относительно случайной длины*/
        int lenght = random.nextInt(30,100);
        StringBuilder S = new StringBuilder();
        for(int i = 0; i < lenght; i++) {
            int number = random.nextInt(alphabet_lenght);
            S.append(alphabet.charAt(number));
        }
        System.out.println("Your string:\n" + S.toString());
        /** Само выполнение задания */
        for (int i = 0; i < S.length(); i ++){
            if (S.charAt(i)=='.' || S.charAt(i)==',' || S.charAt(i)=='?' || S.charAt(i)=='!'|| S.charAt(i)==' ')
                S.setCharAt(i, S.charAt(i));
            else if (S.charAt(i)=='е') S.setCharAt(i,'ж');
            else if(S.charAt(i)=='Е') S.setCharAt(i,'Ж');
            else if(S.charAt(i)=='а') S.setCharAt(i,'я');
            else if(S.charAt(i)=='А') S.setCharAt(i,'Я');
            else{
                int temple = (int)S.charAt(i);
                S.setCharAt(i, (char)(temple+1));
            }
        }
        System.out.println("Your edited string:\n" + S.toString());
    }

    /**
     * Пятое задание (дополнительное) под вариантом 59 (номер по списку 3, номер группы 191):
     * Дана строка, содержащая полное имя файла, т. е. имя диска, список
     * каталогов (путь), собственно имя и расширение. Выделить из этой
     * строки расширение файла (без предшествующей точки).
     */
    private static void Fifth() {
        String path = "C:\\Program Files\\Git\\git-cmd.exe";
        String extention = path.substring(path.indexOf('.')+1,path.length());
        System.out.println("The path to your file: " + path);
        System.out.println("The extension of this file: " + extention);

    }
    
     /**
     * Дана строка, содержащая латинские буквы и круглые скобки. Если скобки
     * расставлены правильно (т. е. каждой открывающей соответствует
     * одна закрывающая), то вывести число 0. В противном случае
     * вывести или номер позиции, в которой расположена первая
     * ошибочная закрывающая скобка, или, если закрывающих скобок не хватает, число −1.
     */
    private static int Sixth(String str){
        int n = 0;
        for (var c: str.toCharArray()
        ) {
            if (c=='(')
                n++;
            else if(c==')')
                n--;
            if(n<0)
                return str.indexOf(c);
        }
        return n==0 ? 0: -1;
    }

    public static void main(String[] args) {
        System.out.println("TASK 5");
        First();
        System.out.println("\nTASK 28");
        Second();
        System.out.println("\nTASK 51");
        Third();
        System.out.println("\nADDITIONAL TASK 62");
        Fourth();
        System.out.println("\nADDITIONAL TASK 59");
        Fifth();
        System.out.println("\nADDITIONAL TASK 69");
        String str = "(Hello world)";
        String str1 = "((Hello worl)d(";
        String str2 = "(Hello w))orld";
        System.out.println("Your string:\n" + str);
        System.out.println(Sixth(str));
        System.out.println("Your string:\n" + str1);
        System.out.println(Sixth(str1));
        System.out.println("Your string:\n" + str2);
        System.out.println(Sixth(str2));
    }
}
