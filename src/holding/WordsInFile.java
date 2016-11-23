package holding;
import java.util.*;
import net.mindview.util.TextFile;
/**
 * Created by Anonymous11100001 on 7/10/2016.
 */
class Words{
    private String inputFile;
    private String word = null;
    private int count = 0;
    private static int totalWords = 0;
    private List<String> listWords;
    private Set<String> setWords;
    public Words(String inputFile){
        this.inputFile = inputFile;
        this.listWords = new ArrayList<>(new TextFile(this.inputFile, "\\W+"));
        this.setWords = new TreeSet<String>();
        Collections.sort(this.listWords, String.CASE_INSENSITIVE_ORDER);

    }
    public void showListWords(){
        System.out.println(this.listWords);
    }
    public void calculatorWords(){
        Iterator<String> listIterator = this.listWords.iterator();
        while(listIterator.hasNext()){
            this.word = listIterator.next();
            for(int i = 0; i < this.listWords.size(); i++){
                if(this.listWords.get(i).equals(this.word)){
                    this.count++;
                }
            }
            System.out.println("The count of " + this.word + " equals: " + this.count);
            this.count = 0;
            this.setWords.add(this.word);
        }
        System.out.println("Set words: " + this.setWords);
    }
}
public class WordsInFile {
    public static void main(String[] args) {
        Words words = new Words("C:\\Users\\CK1985\\IdeaProjects\\Holding_Objects\\out\\production\\Holding_Objects\\test.txt");
        words.showListWords();
        words.calculatorWords();
    }
}

/*class Word {
    static int totalWords = 0;
    String s;
    int count;
    Word(String s, int count) {
        this.s = s;
        this.count = count;
        totalWords++;
    }
    public String toString() { return s + ": " + count; }
}

public class WordsInFile {
    public static void main(String[] args) {
        List<String> words = new ArrayList<String>(
                new TextFile("C:\\Users\\CK1985\\IdeaProjects\\Holding_Objects\\out\\production\\Holding_Objects\\test.txt", "\\W+"));
        Collections.sort(words, String.CASE_INSENSITIVE_ORDER);
        System.out.println("Words to count, sorted: " + words);
        Set<Word> wordObjects = new HashSet<Word>();
        Iterator it = words.iterator();
        while(it.hasNext()) {
            String s = (String)it.next();
            int count = 0;
            for(int i = 0; i < words.size(); i++) {
                if(s.equals(words.get(i))) count++;
            }
            Word w = new Word(s, count);
            wordObjects.add(w);
        }
        System.out.println("Word count: " + wordObjects);
        System.out.println("Total words: " + Word.totalWords);
    }
}*/