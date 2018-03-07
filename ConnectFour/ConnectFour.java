/* ConnectFour.java by Anna Salam
This class holds all of the data and methods
to create ConnectFour games. This is a class to be
imported and used in other files that want to play
this game. */
import java.util.*;

public class ConnectFour {
  //Instance Variables here

  String[][] board; //the [] denote an array - ¿denote?. Array[] = array of arrays because [] = array

  //rows
  String[] column1;
  String[] column2;
  String[] column3;
  String[] column4;
  String[] column5;
  String[] column6;
  String[] column7;

  Boolean gameOver;

    //Constructor Method here
  public ConnectFour() {
    //String Arrays go first
    this.column1 = new String[6];
    this.column1[0] = "_";
    this.column1[1] = "_"; //these are all the rows of column 1
    this.column1[2] = "_";
    this.column1[3] = "_";
    this.column1[4] = "_";
    this.column1[5] = "_"; //we label it string "_" because there is nothing in it technically, but that will change during game

    this.column2 = new String[6];
    this.column2[0] = "_";
    this.column2[1] = "_";
    this.column2[2] = "_";
    this.column2[3] = "_";
    this.column2[4] = "_";
    this.column2[5] = "_";

    this.column3 = new String[6];
    this.column3[0] = "_";
    this.column3[1] = "_";
    this.column3[2] = "_";
    this.column3[3] = "_";
    this.column3[4] = "_";
    this.column3[5] = "_";

    this.column4 = new String[6];
    this.column4[0] = "_";
    this.column4[1] = "_";
    this.column4[2] = "_";
    this.column4[3] = "_";
    this.column4[4] = "_";
    this.column4[5] = "_";

    this.column5 = new String[6];
    this.column5[0] = "_";
    this.column5[1] = "_";
    this.column5[2] = "_";
    this.column5[3] = "_";
    this.column5[4] = "_";
    this.column5[5] = "_";

    this.column6 = new String[6];
    this.column6[0] = "_";
    this.column6[1] = "_";
    this.column6[2] = "_";
    this.column6[3] = "_";
    this.column6[4] = "_";
    this.column6[5] = "_";

    this.column7 = new String[6];
    this.column7[0] = "_";
    this.column7[1] = "_";
    this.column7[2] = "_";
    this.column7[3] = "_";
    this.column7[4] = "_";
    this.column7[5] = "_";

    this.board = new String[7][6]; //7 because number of items not the index; this.columns is an empty array;
    //use {} instead of [] if we want to fill array; this.columns = new Array{column1; column2, column3,...}
    this.board[0] = column1;
    this.board[1] = column2;
    this.board[2] = column3;
    this.board[3] = column4;
    this.board[4] = column5;
    this.board[5] = column6;
    this.board[6] = column7;

    this.gameOver = false;

  }

  // Get and Set Methods here
  /*public String getPiece(){ //to get any position and see if it is empty or occupied by _____
    return ;
  }

  public Boolean getGameOver(){
    return false;
  }


  public void setPiece(){

  }

  public void setGameOver(Boolean gameOver){

  }

*/
  // Other methods here


  public void displayBoard(){
    for (int j = 0; j < 6; j++) { //j is row
      String row = "";
      for (int i = 0; i < 7; i++) { //i is column
        row = row + board[i][j] + " ";
      }
      System.out.println(row);
    }
  }


  public void addPiece(int columnNum, String player){ //the player's move. this just changes your board
    //need to know the column # and what player it is
    //addPiece will place a piece in the column that is passed in
    //then it will find the lowest possible space and fill it in (the largest row number that is empty)
      System.out.println("what?1");//tryna find error
      for (int j = 5; j < 0; j--){
        System.out.println("what?2");//tryna find error
        if (board[columnNum][j].equals("_")){
          System.out.println("what?3");//tryna find error
          board[columnNum][j] = player;
        }
        else{
          System.out.println("this column is full");
          break;
        }
      }
  }

/*
public void checkFour(){
    //(1) we need to find the specific type of piece - to do this we check each column (loop)
    //(2) when the spec piece is found, check all adjacent pieces - to check adjacent (i,j) (i+/-1 AND/OR j+/-1)
    //(3) once a second piece is found, continue by checking in the same direction

    for (i = 0; i < 7; i++){ //first a loop for the columns
      for (j = 0; j < 6; j++){ //then a loop for the rows
        if board[i][j].equals("1"){
          System.out.println(i + ", " + j); //print i and j
          //find adjacents
        }
        else if board[i][j].equals("2"){
          System.out.println(i + ", " + j);
          //find adjacents
        }
        else{
          //continue loop - do nothing
        }
      }
    }
  }
  */



  public static void main(String[] args) {
    ConnectFour newGame = new ConnectFour();
    newGame.displayBoard();

    String player = "1"; //starting off while loop with (technically) player 2
    while (true) { //this while loop is to alternate between players' turns (to stop a while loop when running Control C)
      if (player.equals("1")){
        player = "2";
      }
      else {
        player = "1";
      }
      System.out.println("Player " + player + "'s turn.");

      Scanner place = new Scanner(System.in);
      newGame.displayBoard();
      System.out.println("Where do you want to put the piece? (enter column number (0-6))");//for addPiece
      int col = place.nextInt();//this above gets the column number (int) from user
      newGame.addPiece(col, player);//this runs addPiece with inputted column (col)
    }


  }



}