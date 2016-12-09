
package com.tasks.tickets;

public class Ticket {
  public static void main(String[] args) {
      int tickets = Ticket.numberOfTickets(100000, 999999);
      System.out.println("The number of lucky tickets is: " + tickets);
    }

  public static int numberOfTickets(int from, int to) {
    int count = 0;
    for (int i = from; i <= to; i++) {
      if (isTicketLucky(i)) {
        count++;
      }
    }
    return count;
  }

  private static boolean isTicketLucky(int ticket) {
      int firstHalf = ticket / 1000;
      int secondHalf = ticket % 1000;
      return (sumDigits(firstHalf) == sumDigits(secondHalf));
    }

    private static int sumDigits(int half) {
      int sum = 0;
      while (half > 0) {
        sum = sum + (half % 10);
        half = half / 10;
      }
      return sum;
    }


}
