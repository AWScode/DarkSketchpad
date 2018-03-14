/* ConnectFour.java by Anna Salam
This class holds all of the data and methods
to create ConnectFour games.
 */
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


  public Boolean addPiece(int columnNum, String player){ //the player's move. this just changes your board
    //need to know the column # and what player it is
    //addPiece will place a piece in the column that is passed in
    //then it will find the lowest possible space and fill it in (the largest row number that is empty)
    columnNum = columnNum - 1; //this makes it so that instead of the columns being called 0-6, they are called 1-7
      for (int j = 5; j > -1; j--){
        if (board[columnNum][j].equals("_")){
          board[columnNum][j] = player;
          break;
        }
        if(j == 0){
          return false;
        }
      }
      return true;
  }


public Boolean checkFour() {
  int c = 0;

  for (int i = 0; i < 7; i++) {
    for (int j = 0; j < 6; j++) {


      if (board[i][j].equals("1")) {
        c = 1;//c is pieces thhat could make up four in a row
        for (int k = 1; k < 4; k++) {
          //northwest
          if (j-k > -1) {//greater than -1 because the row # can be 0
            if (i + k < 7) {//less than 7 because the columns have to be 0-6
              if (board[i+k][j-k].equals("_")) {
                c = 1; //there is one "1" but nothing after that in the NW direction so there is not four in a row
                break;
              }
              else if (board[i+k][j-k].equals("2")) {
                c = 1;//there is one "1" but a "2" is found in the NW direction, interrupting a four in a row
                break;
              }
              else {
                c++;//c keeps going (keep going in NW direction as long as there is a "1") until...
                if (c == 4){//there are 4 "1" in a NW line
                  gameOver = true;//this means the game is over
                  break;
                }
              }
            }
          }
        }
        c = 1;
        for (int k = 1; k < 4; k++) {
          //west
          if (i + k < 7) {
            if (board[i+k][j].equals("_")) {
              c = 1;
              break;
            }
            else if (board[i+k][j].equals("2")) {
              c = 1;
              break;
            }
            else {
              c++;
              if (c == 4){
                gameOver = true;
                break;
              }
            }

          }
        }

        c = 1;
        for (int k = 1; k < 4; k++) {
          //southwest
          if (j+k < 6) {
            if (i + k < 7) {
              if (board[i+k][j+k].equals("_")) {
                c = 1;
                break;
              }
              else if (board[i+k][j+k].equals("2")) {
                c = 1;
                break;
              }
              else {
                c++;
                if (c == 4){
                  gameOver = true;
                  break;
                }
              }
            }
          }
        }
        c = 1;
        for (int k = 1; k < 4; k++) {
          //south
          if (j+k < 6) {
            if (board[i][j+k].equals("_")) {
              c = 1;
              break;
            }
            else if (board[i][j+k].equals("2")) {
              c = 1;
              break;
            }
            else {
              c++;
              if (c == 4){
                gameOver = true;
                break;
              }
            }
          }
        }
      }//end of checkFour for "1"


      if (board[i][j].equals("2")) {
        c = 1;
        for (int k = 1; k < 4; k++) {
          //northwest
          if (j-k > -1) {
            if (i + k < 7) {
              if (board[i+k][j-k].equals("_")) {
                c = 1;
                break;
              }
              else if (board[i+k][j-k].equals("1")) {
                c = 1;
                break;
              }
              else {
                c++;
                if (c == 4){
                  gameOver = true;
                  break;
                }
              }
            }
          }
        }
        c = 1;
        for (int k = 1; k < 4; k++) {
          //west
          if (i + k < 7) {
            if (board[i+k][j].equals("_")) {
              c = 1;
              break;
            }
            else if (board[i+k][j].equals("1")) {
              c = 1;
              break;
            }
            else {
              c++;
              if (c == 4){
                gameOver = true;
                break;
              }
            }

          }
        }

        c = 1;
        for (int k = 1; k < 4; k++) {
          //southwest
          if (j+k < 6) {
            if (i + k < 7) {
              if (board[i+k][j+k].equals("_")) {
                c = 1;
                break;
              }
              else if (board[i+k][j+k].equals("1")) {
                c = 1;
                break;
              }
              else {
                c++;
                if (c == 4){
                  gameOver = true;
                  break;
                }
              }
            }
          }
        }
        c = 1;
        for (int k = 1; k < 4; k++) {
          //south
          if (j+k < 6) {
            if (board[i][j+k].equals("_")) {
              c = 1;
              break;
            }
            else if (board[i][j+k].equals("1")) {
              c = 1;
              break;
            }
            else {
              c++;
              if (c == 4){
                gameOver = true;
                break;
              }
            }
          }
        }
      }//end of checkFour for "2"
    }
  }
  return gameOver;
}





  public static void main(String[] args) {
    ConnectFour newGame = new ConnectFour();
    newGame.displayBoard();
    newGame.checkFour();
    int c = 1;

    String person = "2"; //starting off while loop with (technically) player 2
    while (true) { //this while loop is to alternate between players' turns (to stop a while loop when running Control C)
      if (person.equals("1")){
        person = "2";
      }
      else {
        person = "1";
      }
      System.out.println("Player " + person + "'s turn.");


    Boolean hey = false;
    while (!hey){//while things are true...
      Scanner place = new Scanner(System.in);
      newGame.displayBoard();
      System.out.println("Where do you want to put the piece? (enter column number (1-7))");//for addPiece
      int col = place.nextInt();//this above gets the column number (int) from user ---- -1 is so that the column numbers are less confusing
      hey = newGame.addPiece(col, person); //this runs addPiece with inputted column (col) and player (person)
      if (!hey){//if addPiece cannot happen(is false), it means the column is full
        System.out.println("this column is full. pick something else plz.");
      }
    }

    Boolean end = newGame.checkFour();

    if (end == true){ //if checkFour is true, if there is 4 in a row, below happens
      System.out.println("Game over!");
      System.out.println("PLayer " + person + " wins!");
      newGame.displayBoard();
      break;
    }


}
  }



}
