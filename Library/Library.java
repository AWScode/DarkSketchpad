import java.util.*;
import java.io.*;

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

    for (int i = 0; i < words.size(); i++){
      //compare the unicodes of each word by their indexes then reorder from lowest unicode value to highest

      //translate to unicode word by word. start with first two. compare, reorder, repeat.

    }
  }

  //Sort with Selection
    //select the minimum
      //loop through all the items; keep track of minimum; loop this as many times as the list is long; for each minimum, remove it and add to a sorted list
  public ArrayList<String> wLengthSort(){
    //find lowest char value; move to start of new list; find second lowest char value, reorder, and so on...
    ArrayList<String> sortList = new ArrayList<String>();//final sorted list
    ArrayList<String> tempList = new ArrayList<String>();
    for (int h = 0; h < words.size(); h++){
      tempList.add(words.get(h)); //this is making a temperary list for us to go through.
    }

    for (int i = 0; i < words.size(); i++){//loop to find minimums ; "get that many things to a new sorted list that many times"
      String min = tempList.get(0); //we are starting off on the first word. the first word is the minimum that we will compare everything else to
      //it is tempList and inside first of double loop because the minimum of orignial can be changed/removed
      for (int j = 0; j < tempList.size(); j++){//loop through all the items ; "go through the list to find the minimum"
      //j is < a new array (tempList) list because everytime we find the minimum, we remove it from original list
        if (min.length() > tempList.get(j).length()){//if the minimum's length is greater than the current length of item in tempList, then...
          min = tempList.get(j);
        }
      }
      tempList.remove(min);
      sortList.add(min);
    }
    return sortList;
  }

  public ArrayList<String> wLengthMergeSort(){
    ArrayList<String> sortL = new ArrayList<String>();
    ArrayList<String> tempL = new ArrayList<String>();
    ArrayList<String> subList = new ArrayList<String>();

    if (tempL.size() > 1){//while the list is greater than 1, split that list in half.
      //split by making them into new lists (subList)

      //if the list = 1, merge and compare with another 1 word.
      //sort those in the right order, then compare with the first word of another sorted mix
    }
    else if (subList.size() = 1){
      //compare to another list.
      //combine with that list in a sorted manner ---> sortL
    }
    return sortL;
  }






  public void printList(ArrayList<String> printL){
    for (int s = 0; s < printL.size(); s++){
      System.out.print(printL.get(s) + ", ");
    }

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

  public ArrayList<String> getWords(){
    return words;
  }

  public void readNewBook(String filename){
    File newBook = new File(filename);
    try { //this is try and catch
      Scanner toRead = new Scanner(newBook);
      while (toRead.hasNext()) {
      String toAdd = toRead.next();
      toAdd = toAdd.replaceAll("[-+.^:,!(){}\'\"]", "");
      words.add(toAdd);
      }
    }
    catch (FileNotFoundException e){
      //this is when the file isn't found/doesn't exist (anymore)
      System.out.println("File not found.");
    }
  }


  public static void main(String[] args) {

    Library myLib = new Library();

    myLib.readNewBook("HeartOfDarkness.txt");

    System.out.println("\nWelcome to the AWS Library!");
    System.out.println("\nWe have compiled a list of the words for the book ___insert book here___: ");

    System.out.println("The story: \n ===\n\n");
    myLib.printList(myLib.getWords());
    System.out.println("\n");
    System.out.println("Here are the top words in the story");
    System.out.println("Word: a : " + Integer.toString(myLib.getWordCount("a")));
    System.out.println("Word: there : " + Integer.toString(myLib.getWordCount("there")));
    System.out.println("Word: Darcy : " + Integer.toString(myLib.getWordCount("Darcy")));
    System.out.println("Word: once : " + Integer.toString(myLib.getWordCount("once")));
    System.out.println("");
    myLib.printList(myLib.wLengthSort());


  }

}
