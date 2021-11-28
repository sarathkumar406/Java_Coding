//ITC Test case:  Develop multithread program to print even and odd numbers between given range from two different threads
//==========================================
//package com.nit.hk.mt;

class PrintNumbers {
 private boolean print;
 
 public synchronized void printOddNumbers(int num) {
 if(print)
 try {
	 System.out.println("Odd NUmber"+Thread.currentThread().getName());
 wait(3000);
 } catch (InterruptedException e) {
 // TODO Auto-generated catch block
 e.printStackTrace();
 }
 
 System.out.print(num + "  ");
 print = true;
 notify();
 
 }
 
 public synchronized void printEvenNumbers(int num) {
 if(!print)
 try {
	 System.out.println("Even NUmber"+Thread.currentThread().getName());
 wait(3000);
 } catch (InterruptedException e) {
 // TODO Auto-generated catch block
 e.printStackTrace();
 }
 
 System.out.print(num + "  ");
 print = false;
 notify();
 }
}

class OddNumPrinter implements Runnable {
 private PrintNumbers pn;
 private int end;
 
 
 public OddNumPrinter(PrintNumbers pn, int end) {
 this.pn = pn;
 this.end = end;
 }

 @Override
 public void run() {
 for(int i=1; i<=end; i = i+2) {
 pn.printOddNumbers(i);
 }
 }
}

class EvenNumPrinter implements Runnable {
 private PrintNumbers pn;
 private int end;
 
 public EvenNumPrinter(PrintNumbers pn, int end) {
 this.pn = pn;
 this.end = end;
 }

 @Override
 public void run() {
 for(int i=2; i<=end; i = i+2) {
 pn.printEvenNumbers(i);
 }
 }
}

public class Test31_EvenOddPrinter {
 public static void main(String[] args) {
 
 PrintNumbers pn = new PrintNumbers();
 
 Thread th1 = new Thread(new OddNumPrinter(pn, 20));
 Thread th2 = new Thread(new EvenNumPrinter(pn, 20));
 
 th1.start();
 th2.start();
 
 }
}