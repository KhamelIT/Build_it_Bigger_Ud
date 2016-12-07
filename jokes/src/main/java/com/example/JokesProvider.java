package com.example;

import java.util.Random;

public class JokesProvider {

    public static String getRandomJoke() {
        String[] jokes = new String[] {
                "Two bytes meet.  The first byte asks, 'Are you ill?'  \n" +
                        "The second byte replies, 'No, just feeling a bit off.'",
                "Eight bytes walk into a bar.  The bartender asks, 'Can I get you anything?'\n" +
                        "\n" +
                        "'Yeah,' reply the bytes.  'Make us a double.'",
                "Q. How did the programmer die in the shower?\n" +
                        "A. He read the shampoo bottle instructions: Lather. Rinse. Repeat.",
                "How many programmers does it take to change a light bulb?\n" +
                        "None, It\'s a hardware problem",
                "Why do programmers always mix up Halloween and Christmas? \n" +
                        "Because Oct 31 equals Dec 25.",
                "There are only 10 kinds of people in this world: those who know binary and those who don\'t.",
                "A programmer walks to the butcher shop and buys a kilo of meat.  An hour later he comes back upset that the butcher shortchanged him by 24 grams.",
                "'Knock, knock.'\n" +
                        "'Who\'s there?'\n" +
                        "very long pau...\n" +
                        "'Java.'",
                "Programming is 10% science, 20% ingenuity, and 70% getting the ingenuity to work with the science.",
                "Programming is like sex:\n" +
                        "One mistake and you have to support it for the rest of your life.",
                "There are three kinds of lies: Lies, damned lies, and benchmarks."
        };
        Random random = new Random();
        int  jokeNum = random.nextInt(11);
        return jokes[jokeNum];
    }

}
