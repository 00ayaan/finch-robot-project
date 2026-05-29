package com.heyisaac;

public class TesterFinch{
    public static void main(String[] args) {
        FinalFinch bird = new FinalFinch("A");



//     for (int i = 0; i<2; i++){

//         while (bird.getDistance() > 10){
//             bird.setMove("F", 5, 100);
//         }

//         bird.setTurn("L", 90, 50);

//         while (bird.getDistance() > 8){
//             bird.setMove("F", 5, 100);
//         }

//         bird.setTurn("L", 90, 50);

//         while (bird.getDistance() > 10){
//             bird.setMove("F", 5, 100);
//         }

//         bird.setTurn("R", 90, 50);

//         while (bird.getDistance() > 8){
//             bird.setMove("F", 5, 100);
//         }

//         bird.setTurn("R", 90, 50);

// }

        while (bird.getDistance() > 10){
            bird.setMove("F", 5, 100);

        }

        bird.setTurn("R", 100, 50);


        while (bird.getDistance() > 8){
            bird.setMove("F", 5, 100);
        }

        bird.setTurn("L", 90, 50);

        while (bird.getDistance() > 8){
            bird.setMove("F", 5, 100);
        }

        bird.setTurn("L", 90, 50);

        
        while (bird.getDistance() > 8){
            bird.setMove("F", 5, 100);
        }

        bird.setTurn("R", 90, 50);






    }
} 