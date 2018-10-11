package de.pfleghar.pittest;

public class FizzBuzz {

    public String getFizzBuzz(final int counter) {

        String fb = "";

        if (counter % 3 == 0) {
            fb = fb + "Fizz";
        }
        if (counter % 5 == 0) {
            fb = fb + "Buzz";
        }
        if (fb.isEmpty()) {
            fb = String.valueOf(counter);
        }

        return fb;
    }

}
