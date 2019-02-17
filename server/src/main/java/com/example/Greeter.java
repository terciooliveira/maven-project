package com.example;

/**
 * This is a class.
 */
public class Greeter {

  /**
   * This is a constructor.
   */
  public Greeter() {

  }

  /**
   * The glorious greet method.
   * @param someone who is going to be greeted.
   * @returns greeting string.
   */
  public final String greet(final String someone) {
    return String.format("Hello, %s!", someone);
  }
}
