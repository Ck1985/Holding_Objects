import java.util.*;
import java.util.Scanner;
import net.mindview.util.TextFile;
/**
 * Created by Anonymous11100001 on 7/3/2016.
 */
interface InputInterface{
    void readAndCountInput(String input);
    void countOcurrence();
}
class Options{
    public String switchOptions(){
        System.out.println("Reading Machine has 2 options:");
        System.out.println("1: Reading and count vowels form input words:");
        System.out.println("2: Reading and count vowels from text files:");
        System.out.println("Which choices do you want ? (1 or 2)");

        Scanner scanner = new Scanner(System.in);
        int choice = 0;
        choice = scanner.nextInt();
        switch(choice){
            case 1:
                return "InputString";
            case 2:
                return "InputTextFile";
            default:
                return "Wrong choice, please try again !!!";
        }
    }
}
class InputString implements InputInterface {
    private Set<Object> vowels = new TreeSet<Object>(Arrays.asList('a', 'e', 'i', 'o', 'u'));
    private int count = 0;
    private String input;
    private Set<Object> results = new TreeSet<>();
    private List<Character> countResults = new ArrayList<>();
    private List<Object> words = new ArrayList<>();
    private Iterator<Object> wordIterator;
    public void readAndCountInput(String input){
        this.input = input;
        for(char c : this.input.toCharArray()){
            words.add(c);
        }
        wordIterator = words.iterator();
        while(wordIterator.hasNext()){
            Object result = wordIterator.next();
            if(vowels.contains(result)){
                this.results.add(result);
            }
        }
        this.count = results.size();
        System.out.println("The String you 've just input has "  + this.count + " vowels");
        System.out.println("The Vowels are: " + results);
    }
    public void countOcurrence(){
        int ia = 0, ie = 0, ii = 0, iu = 0, io = 0;
        char[] arrayChar = this.input.toCharArray();
        for(char c : arrayChar){
            switch(c){
                case 'a':
                    ia++;
                    continue;
                case 'e':
                    ie++;
                    continue;
                case 'i':
                    ii++;
                    continue;
                case 'o':
                    io++;
                    continue;
                case 'u':
                    iu++;
                    continue;
                default:
                    continue;
            }
        }
        System.out.println("ocurrence of 'a' = " + ia);
        System.out.println("ocurrence of 'e' = " + ie);
        System.out.println("ocurrence of 'i' = " + ii);
        System.out.println("ocurrence of 'o' = " + io);
        System.out.println("ocurrence of 'u' = " + iu);
    }
}
class TextFileInput implements InputInterface {
    private Set<Character> vowels = new TreeSet<Character>(Arrays.asList('a', 'e', 'i', 'o', 'u'));
    private int count = 0;
    private Set<Character> resutls = new TreeSet<>();
    private Set<Character> results2 = new TreeSet<>();
    private Set<Character> charVowels = new TreeSet<>();
    private Set<String> words;
    private Character chars;
    private String input;
        public void readAndCountInput(String input){
            this.input = input;
            words = new TreeSet<String>(new TextFile(input, "\\W+"));
            Iterator<String> wordsIterator = words.iterator();
            while(wordsIterator.hasNext()){
                String groupCharacter = wordsIterator.next();
                char[] chars = groupCharacter.toCharArray();
                for(char c : chars){
                    resutls.add(c);
                }
            }
            Iterator<Character> resultsIterator = resutls.iterator();
            while(resultsIterator.hasNext()){
                chars = resultsIterator.next();
                if(vowels.contains(chars)){
                    results2.add(chars);
                }
            }
            this.count = results2.size();
            System.out.println("The Text File you 've just input has "  + this.count + " vowels");
            System.out.println("The Vowels are: " + charVowels);
            System.out.println("The results: " + results2);
        }
    public void countOcurrence(){
        int ia = 0, ie = 0, ii = 0, iu = 0, io = 0;
        Set<String> words1 = new TreeSet<>();
        words1 = new TreeSet<String>(new TextFile(input, "\\w+"));
        Iterator<String> wordsIterator = words1.iterator();
        while(wordsIterator.hasNext()) {
            String groupcharacter = wordsIterator.next();
            char[] chars = groupcharacter.toCharArray();
            for (char c : chars) {
                switch (c) {
                    case 'a':
                        ia++;
                        continue;
                    case 'e':
                        ie++;
                        continue;
                    case 'i':
                        ii++;
                        continue;
                    case 'o':
                        io++;
                        continue;
                    case 'u':
                        iu++;
                        continue;
                    default:
                        continue;
                }
            }
        }
        System.out.println("ocurrence of 'a' = " + ia);
        System.out.println("ocurrence of 'e' = " + ie);
        System.out.println("ocurrence of 'i' = " + ii);
        System.out.println("ocurrence of 'o' = " + io);
        System.out.println("ocurrence of 'u' = " + iu);
    }
}
public class ReadingVowelsMachine {
    private InputInterface choiceImplements;
    private Options options = new Options();
    private Scanner scanner = new Scanner(System.in);
    public static void main(String[] args){
        ReadingVowelsMachine machine = new ReadingVowelsMachine();
        String choices = machine.options.switchOptions();
        if(choices == "InputString"){
            machine.choiceImplements = new InputString();
            System.out.println("Please input the source which you want to lookup the Vowels: ");
            String source = machine.scanner.nextLine();
            machine.choiceImplements.readAndCountInput(source);
            machine.choiceImplements.countOcurrence();
        }else if(choices == "InputTextFile")
        {
            machine.choiceImplements = new TextFileInput();
            System.out.println("Please input the text file you want to lookup the Vowels:");
            String sourceFile = machine.scanner.nextLine();
            machine.choiceImplements.readAndCountInput(sourceFile);
            machine.choiceImplements.countOcurrence();
        }else{
            System.out.println("Sorry we have no this options !!!!");
        }
    }
}
