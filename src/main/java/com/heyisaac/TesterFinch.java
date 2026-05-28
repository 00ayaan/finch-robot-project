package com.heyisaac;

public class TesterFinch{
    public static void main(String[] args) {
        FinalFinch bird = new FinalFinch("A");

        while (bird.getDistance() > 10){
            bird.setMove("F", 5, 100);
        }

        bird.setTurn("L", 90, 50);

        while (bird.getDistance() > 10){
            bird.setMove("F", 5, 100);
        }


        bird.setTurn("L", 90, 50);

        while (bird.getDistance() > 10){
            bird.setMove("F", 5, 100);
        }
    }
}