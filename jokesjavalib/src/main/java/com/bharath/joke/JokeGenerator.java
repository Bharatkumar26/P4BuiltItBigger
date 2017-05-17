package com.bharath.joke;

import java.util.Random;

public class JokeGenerator {

    private static final String[] JOKESLIST = {
            "A computer once beat me at chess, but it was no match for me at kick boxing.",
            "If every child starts swapping their Daddy-Mummy mobile . Soon we will become the country with the highest divorce rate",
            "I asked God for a bike, but I know God doesn't work that way. So I stole a bike and asked for forgiveness.",
            "I want to die peacefully in my sleep, like my grandfather. Not screaming and yelling like the passengers in his car.",
            "Do not argue with an idiot. He will drag you down to his level and beat you with experience.",
            "Politicians and diapers have one thing in common. They should both be changed regularly, and for the same reason.",
            "War does not determine who is right - only who is left"


    };

    private static final Random RANDOMSEL = new Random();

    public static String getRandomJoke() {
        return JOKESLIST[RANDOMSEL.nextInt(JOKESLIST.length)];
    }

}

