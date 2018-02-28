/* ConnectFour.java by Anna Salam
This class holds all of the data and methods
to create ConnectFour games. This is a class to be
imported and used in other files that want to play
this game. */

public class ConnectFour {
  //Instance Variables here

  Array[] columns; //the [] denote an array - ¿denote?. Array[] = array of arrays because [] = array

  //rows
  String[] column1;
  String[] column2;
  String[] column3;
  String[] column4;
  String[] column5;
  String[] column6;
  String[] column7;

  Boolean gameOver;

  public ConnectFour() {
    //Constructor Method here
    //String Arrays go first
    this.column1 = new {"empty", "empty", "empty", "empty", "empty", "empty", "empty"}; //we label it string "empty" because there is nothin gin it technically, but that will change during game
    this.column2 = new {"empty", "empty", "empty", "empty", "empty", "empty", "empty"};
    this.column3 = new {"empty", "empty", "empty", "empty", "empty", "empty", "empty"};
    this.column4 = new {"empty", "empty", "empty", "empty", "empty", "empty", "empty"};
    this.column5 = new {"empty", "empty", "empty", "empty", "empty", "empty", "empty"};
    this.column6 = new {"empty", "empty", "empty", "empty", "empty", "empty", "empty"};
    this.column7 = new {"empty", "empty", "empty", "empty", "empty", "empty", "empty"};

    this.columns = new Array[7]; //7 because number of items not the index; this.columns is an empty array;
    //use {} instead of [] if we want to fill array; this.columns = new Array{column1; column2, column3,...}

    this.gameOver = false;

  }

  // Get and Set Methods here
  public getPiece(){
    return ;
  }

  public Boolean getGameOver(){
    return false;
  }

  public void setPiece(){

  }

  public void setGameOver(Boolean gameOver){

  }


  // Other methods here
  public addPiece(){
    //need to know the column # and what player it is
  }


}
