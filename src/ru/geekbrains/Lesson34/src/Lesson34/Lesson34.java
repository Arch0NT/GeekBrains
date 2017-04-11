package Lesson34;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Scanner;

public class Lesson34 {
    private final Object mon = new Object();
    private char currentLetter = 'A';
    private int numOfThread = 1;
    private int numOfRec = 10;
    private String str = "Строка из потока №";
    private RandomAccessFile raf = null;

    public static void main(String[] args) {
        Lesson34 w = new Lesson34();
        Thread t1 = new Thread(() -> {
            w.printA();
        });
        Thread t2 = new Thread(() -> {
            w.printB();
        });
        Thread t3 = new Thread(() -> {
            w.printC();
        });
        t1.start();
        t2.start();
        t3.start();
        try {
            t1.join();
            t2.join();
            t3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        try {
            w.raf = new RandomAccessFile("c:\\Temp\\1.txt", "rw");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        w.fileWriter();
    }

    //Написать совсем небольшой метод, в котором 3 потока построчно пишут данные в файл (штук по 10 записей, с периодом в 20 мс)
    public void fileWriter() {
        Thread t1 = new Thread(() -> {
            task2a();
        });
        Thread t2 = new Thread(() -> {
            task2a();
        });
        Thread t3 = new Thread(() -> {
            task2a();
        });
        t1.start();
        t2.start();
        t3.start();
    }

    public void task2a() {
        synchronized (mon) {
            try {
                for (int i = 0; i < numOfRec; i++) {
                    while (numOfThread != 1)
                        mon.wait(20);
                    //raf.writeUTF(i+". "+str + numOfThread);
                    System.out.println(i+". "+str + numOfThread);
                    numOfThread = 2;
                    mon.notifyAll();
                }
            //}catch (IOException e) {
            //    e.printStackTrace();
            }catch (InterruptedException ex){
                ex.printStackTrace();
            }
        }
        try {
            raf.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void task2b() {
        synchronized (mon) {
            try {
                for (int i = 0; i < numOfRec; i++) {
                    while (numOfThread != 2)
                        mon.wait(20);
                    //raf.writeUTF(i+". "+str + numOfThread);
                    System.out.println(i+". "+str + numOfThread);
                    numOfThread = 3;
                    mon.notifyAll();
                }
            //}catch (IOException e) {
            //    e.printStackTrace();
            }catch (InterruptedException ex){
                ex.printStackTrace();
            }
        }
        try {
            raf.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void task2c() {
        synchronized (mon) {
            try {
                for (int i = 0; i < numOfRec; i++) {
                    while (numOfThread != 3)
                        mon.wait(20);
                    //raf.writeUTF(i+". "+str + numOfThread);
                    System.out.println(i+". "+str + numOfThread);
                    numOfThread = 1;
                    mon.notifyAll();
                }
            //}catch (IOException e) {
            //    e.printStackTrace();
            }catch (InterruptedException ex){
                ex.printStackTrace();
            }
        }
        try {
            raf.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void printA() {
        synchronized (mon) {
            try {
                for (int i = 0; i < 5; i++) {
                    while (currentLetter != 'A')
                        mon.wait();
                    System.out.print("A");
                    currentLetter = 'B';
                    mon.notifyAll();
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void printB() {
        synchronized (mon) {
            try {
                for (int i = 0; i < 5; i++) {
                    while (currentLetter != 'B')
                        mon.wait();
                    System.out.print("B");
                    currentLetter = 'C';
                    mon.notifyAll();
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void printC() {
        synchronized (mon) {
            try {
                for (int i = 0; i < 5; i++) {
                    while (currentLetter != 'C')
                        mon.wait();
                    System.out.print("C");
                    currentLetter = 'A';
                    mon.notifyAll();
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}