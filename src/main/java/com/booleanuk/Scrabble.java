package com.booleanuk;

public class Scrabble {
    String word;
    public Scrabble(String word) {
        this.word = word;
    }

    public int score() {
        int score = 0;
        for (int i=0; i<word.length(); i++) {
            String letter = word.substring(i, i + 1);
            if ("AEIOULNRSTaeioulnrst".contains(letter)) {
                score += 1;
            } else if ("DGdg".contains(letter)) {
                score += 2;
            } else if ("BCMPbcmp".contains(letter)) {
                score += 3;
            } else if ("FHVWYfhvwy".contains(letter)) {
                score += 4;
            } else if ("Kk".contains(letter)) {
                score += 5;
            } else if ("JXjx".contains(letter)) {
                score += 8;
            } else if ("QZqz".contains(letter)) {
                score += 10;
            }
        }
        return score;
    }

}
