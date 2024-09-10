package edu.grinnell.csc207.experiments;

import java.io.PrintWriter;
import edu.grinnell.csc207.util.Counter;

/**
 * Experiments with Counters.
 *
 * @author Alex Pollock, Myles Bohrer-Purnell
 */
public class CounterExperiment {
  /**
   * Run some experiments on counters.
   *
   * @param args
   *   Command-line arguments
   *
   * @throws Exception
   *   If something goes unexpectedly wrong
   */
  public static void main(String[] args) {
    PrintWriter pen = new PrintWriter(System.out, true);
    Counter c1 = new Counter();
    Counter c2 = new Counter(3);
    pen.println(c1 + " " + c2);
    c2.increment();
    pen.println(c1 + " " + c2);
    c2.reset();
    pen.println(c1 + " " + c2);
    pen.close();
  } // main(String[])
} // class CounterExperiment
