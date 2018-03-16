import java.util.*;

public class Library {

  public ArrayList<String> words;

  public Library() {
    this.words = new ArrayList<String>();

    //Sample
    words.add("once");
    words.add("upon");
    words.add("a");
    words.add("time");
    words.add("there");
    words.add("was");
    words.add("a");
    words.add("girl");
    words.add("who");
    words.add("lived");
    words.add("in");
    words.add("a");
    words.add("beautiful");
    words.add("castle");
    words.add("one");
    words.add("day");
    words.add("the");
    words.add("castle");
    words.add("there");
    words.add("fell");
    words.add("there");
    words.add("down");

  }




  //Sort with Insertion
  public void alphaSort(){
    //to alphabetize: compare unicode values of char at indexes of the words

    //compare the unicode values of char at indexes of the words <<<HOW DO I DO THIS?????

    for (int i = 0; i < 22; i++){
      //compare the unicodes of each word by their indexes then reorder from lowest unicode value to highest

      //translate to unicode word by word. start with first two. compare, reorder, repeat.

    }
  }

  //Sort with Selection
  public void wLengthSort(){
    //find lowest char value
    //move to start of new list
    //find second lowest char value, reorder, and so on...
    for (int i = 0; i < 22; i++){
      for (int j = 0; j <22; j++){
        int wordLength = words.length(i);
        //make a new list that reorders lowest to highest wordLength

        //find lowest wordLength, add to new list. find second lowest wordLength, add to new list. and so on
        if (wordLength = i){
        //then add that word to the new list
        }
      }
    }
    return wordlList[];//return/print the new list
  }

  public void printList(){

  }

  public int getWordCount(String w){
    int count = 0;
    for (int i = 0; i < words.size(); i++){
      if (words.get(i).equals(w)){
        count++;
      }
    }
    return count;
  }

  public ArrayList<String> getTopWords(){
    ArrayList<String> topWords = new ArrayList<String>();

    return topWords;
  }


  public static void main(String[] args) {

    Library myLib = new Library();

    System.out.println("\nWelcome to the AWS Library!");
    System.out.println("\nWe have compiled a list of the words for the book ___insert book here___: ");

    System.out.println("\n");
    System.out.println("Here are the top words in the story");
    System.out.println("Word: a : " + Integer.toString(myLib.getWordCount("a")));
    System.out.println("Word: there : " + Integer.toString(myLib.getWordCount("there")));
    System.out.println("Word: castle : " + Integer.toString(myLib.getWordCount("castle")));
    System.out.println("Word: once : " + Integer.toString(myLib.getWordCount("once")));


  }

}
