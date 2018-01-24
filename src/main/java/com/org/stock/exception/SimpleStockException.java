package com.org.stock.exception;

/**
 * Custom exception for any super simple stock errors.
 * @author Chaitanya Sagar
 */
public class SimpleStockException extends Exception {

  private static final long serialVersionUID = 1L;

  public SimpleStockException(String message) {
    super(message);
  }

}
