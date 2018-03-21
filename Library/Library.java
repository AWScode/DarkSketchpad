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

  public ArrayList<String> merge(ArrayList<String> sorted1, ArrayList<String> sorted2){
    //combine the two lists
    ArrayList<String> finalList = new ArrayList<String>();
    int index1 = 0;//creating an index for each list
    int index2 = 0;//index for second list
    for (int i = 0; i < sorted1.size() + sorted2.size(); i++){
      //we need to keep track of which index we are on
      if (sorted1.get(index1) <= sorted2.get(index2)){//technically we can't compare the two lists for some reason idk I zoned out when he was explaining
        finalList.add(sorted1.get(index1));//add to final list
        index1++;
      }
      else{
        finalList.add(sorted2,get(index2));
        index2++;
      }
    }
    return finalList;
  }

  public ArrayList<String> mergeWLengthSort(ArrayList<String> myList){
    if (myList.size() <= 1){
      return myList;
    }
    else{
      ArrayList<String> list1 = ;//first 1/2 of list
      ArrayList<String> list2 = ;//second 1/2 of list

      ArrayList<String> sorted1 = mergeWLengthSort(list1);
      ArrayList<String> sorted2 = mergeWLengthSort(list2);

      //now we need to merge sorted1 and sorted2
      ArrayList<String> sortedFinal = merge(sorted1, sorted2); //calling on merge method that's made above
      return sortedFinal;
    }
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
