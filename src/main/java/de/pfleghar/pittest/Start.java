package de.pfleghar.pittest;

public class Start {

    public static void main(String args[]) {
        int counter = Integer.parseInt(args[0]);
        FizzBuzz fb = new FizzBuzz();

        for (int i = 1; i <= counter; i++) {
            System.out.println(fb.getFizzBuzz(i));
        }


    }
}
