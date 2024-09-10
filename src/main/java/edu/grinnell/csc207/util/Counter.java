package edu.grinnell.csc207.util;

/**
 * Simple counters.
 *
 * Alex Pollock, Myles Bohrer-Purnell
 */
public class Counter {
  // +--------+------------------------------------------------------
  // | Fields |
  // +--------+
  int COUNT;

  private static final int DEFAULTCOUNT = 0;

  int STARTINGVALUE;

  // +--------------+------------------------------------------------
  // | Constructors |
  // +--------------+
public Counter(){
  this.COUNT=DEFAULTCOUNT;
  this.STARTINGVALUE = DEFAULTCOUNT;
}
public Counter(int start){
  this.COUNT=start;
  this.STARTINGVALUE = start;
}
  // +---------+-----------------------------------------------------
  // | Methods |
  // +---------+


  public int get(){
    return this.COUNT;
  }

  public void increment(){
    this.COUNT++;
  }

  public String toString(){
    return "(" + this.get() + ")";
  }

  public void reset(){
    this.COUNT = this.STARTINGVALUE;
  }

} // class Counter

