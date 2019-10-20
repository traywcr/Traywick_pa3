package com.company;
import java.security.SecureRandom;
import java.util.Scanner;

public class Traywick_p1 {

    static void correctAnswerResponse(){
        SecureRandom s1 = new SecureRandom();
        int randomResponse = s1.nextInt(4);

        switch(randomResponse){
            case 0:
                System.out.printf("Very Good!\n");
                break;
            case 1:
                System.out.printf("Excellent!\n");
                break;
            case 2:
                System.out.printf("Nice work!\n");
                break;
            case 3:
                System.out.printf("Keep up the good work!\n");
                break;
            default:
                System.out.printf("Good Job!!\n");
                break;
        }
    }

    static void incorrectAnswerResponse(){
        SecureRandom s1 = new SecureRandom();
        int randomResponse = s1.nextInt(4);

        switch(randomResponse){
            case 0:
                System.out.printf("No. Please try again.!\n");
                break;
            case 1:
                System.out.printf("Wrong. Try once more.!\n");
                break;
            case 2:
                System.out.printf("Don’t give up!\n");
                break;
            case 3:
                System.out.printf("No. Keep trying.\n");
                break;
            default:
                System.out.printf("Try again!\n");
                break;
        }
    }

    static void showScore(double corCounter, int incorCounter){
        System.out.printf("Amount Correct: %.0f\n", corCounter);
        System.out.printf("Amount Incorrect: %d\n", incorCounter);

        double score = (corCounter / 10.0) * 100;

        System.out.printf("Score: %.0f%%\n", score);
        if(score >= 75){
            System.out.printf("Congratulations, you are ready to go to the next level.\n");
        }
        else{
            System.out.printf("Please ask you teacher for extra help.\n");
        }
    }

    static int getArithmeticType(){
        Scanner arith = new Scanner(System.in);
        System.out.printf("What type of questions would you like to study?\n1 - Addition\n2 - Subtraction\n3 - Multiplication\n4 - Division\n5 - Random Mixture of all\n ");
        int arithInput = arith.nextInt();
        int arithNumber = 0;

        if (arithInput == 1) {
            arithNumber = 1;
        } else if (arithInput == 2) {
            arithNumber = 2;
        } else if (arithInput == 3) {
            arithNumber = 3;
        } else if (arithInput == 4) {
            arithNumber = 4;
        } else if (arithInput == 5) {
            arithNumber = 5;
        } else{
            System.out.printf("Invalid input. Please input a type  1 - 5.\n");
            getArithmeticType();
        }




        return arithNumber;
    }

    static int getDifficulty() {
        Scanner diff = new Scanner(System.in);

        System.out.printf("What level of difficulty would you like?\n1 - 1 digit\n2 - 2 digits\n3 - 3 digits\n4 - 4 digits\n");
        int diffInput = diff.nextInt();
        int difficultyNumber = 0;

        if (diffInput == 1) {
            difficultyNumber = 1;
        } else if (diffInput == 2) {
            difficultyNumber = 2;
        } else if (diffInput == 3) {
            difficultyNumber = 3;
        } else if (diffInput == 4) {
            difficultyNumber = 4;
        } else {
            System.out.printf("Invalid input. Please input a difficulty level 1 - 4.\n");
            getDifficulty();
        }


        return difficultyNumber;
    }

    static int[] randomOutputforDifficulty(int difficult){
        SecureRandom randomNum = new SecureRandom();

        int[] numbers = new int[2];


        if(difficult == 1){
            numbers[0] = randomNum.nextInt(10);
            numbers[1] = randomNum.nextInt(10);
        }
        else if(difficult == 2){
            numbers[0] = randomNum.nextInt(90) + 10;
            numbers[1] = randomNum.nextInt(90) + 10;
        }
        else if(difficult == 3){
            numbers[0] = randomNum.nextInt(900) + 100;
            numbers[1] = randomNum.nextInt(900) + 100;
        }
        else{
            numbers[0] = randomNum.nextInt(9000) + 1000;
            numbers[1] = randomNum.nextInt(9000) + 1000;
        }
        return numbers;
    }

    static void makeAdditionTest(int difficult, int arithmetic){

        Scanner scnr = new Scanner(System.in);

        double correctCounter = 0.0;
        int incorrectCounter = 0;

        int numberArray[] = new int[2];



        for(int i = 0; i < 10; i++) {
            numberArray = randomOutputforDifficulty(difficult);


            System.out.printf("How much is %d plus %d?\n", numberArray[0], numberArray[1]);
            System.out.printf("Answer: ");
            double userAnswer = scnr.nextDouble();

            double correctAnswer = numberArray[0] + numberArray[1];


            System.out.printf("Answer: %.2f\n", userAnswer);


            if ((Math.abs(correctAnswer - userAnswer)) < .01) {
                correctAnswerResponse();
                correctCounter++;
            } else if((Math.abs(correctAnswer - userAnswer)) > .01){
                incorrectAnswerResponse();
                incorrectCounter++;
            }
            else{
                System.out.printf("Incorrect input. Try again.\n");
                System.out.printf("How much is %d plus %d?\n", numberArray[0], numberArray[1]);
                System.out.printf("Answer: ");
            }
        }
        showScore(correctCounter, incorrectCounter);
    }

    static void makeSubtractionTest(int difficult, int arithmetic){

        Scanner scnr = new Scanner(System.in);

        double correctCounter = 0.0;
        int incorrectCounter = 0;

        int numberArray[] = new int[2];



        for(int i = 0; i < 10; i++) {
            numberArray = randomOutputforDifficulty(difficult);


            System.out.printf("How much is %d minus %d?\n", numberArray[0], numberArray[1]);
            System.out.printf("Answer: ");
            double userAnswer = scnr.nextDouble();

            double correctAnswer = numberArray[0] - numberArray[1];


            System.out.printf("Answer: %.2f\n", userAnswer);


            if ((Math.abs(correctAnswer - userAnswer)) < .01) {
                correctAnswerResponse();
                correctCounter++;
            } else if((Math.abs(correctAnswer - userAnswer)) > .01){
                incorrectAnswerResponse();
                incorrectCounter++;
            }
            else{
                System.out.printf("Incorrect input. Try again.\n");
                System.out.printf("How much is %d minus %d?\n", numberArray[0], numberArray[1]);
                System.out.printf("Answer: ");
            }
        }
        showScore(correctCounter, incorrectCounter);
    }


    static void makeMultiplicationTest(int difficult, int arithmetic){

        Scanner scnr = new Scanner(System.in);

        double correctCounter = 0.0;
        int incorrectCounter = 0;

        int numberArray[] = new int[2];



        for(int i = 0; i < 10; i++) {
            numberArray = randomOutputforDifficulty(difficult);


            System.out.printf("How much is %d times %d?\n", numberArray[0], numberArray[1]);
            System.out.printf("Answer: ");
            double userAnswer = scnr.nextDouble();

            double correctAnswer = numberArray[0] * numberArray[1];


            System.out.printf("Answer: %.2f\n", userAnswer);


            if ((Math.abs(correctAnswer - userAnswer)) < .01) {
                correctAnswerResponse();
                correctCounter++;
            } else if((Math.abs(correctAnswer - userAnswer)) > .01){
                incorrectAnswerResponse();
                incorrectCounter++;
            }
            else{
                System.out.printf("Incorrect input. Try again.\n");
                System.out.printf("How much is %d times %d?\n", numberArray[0], numberArray[1]);
                System.out.printf("Answer: ");
            }
        }
        showScore(correctCounter, incorrectCounter);
    }

    static void makeDivisionTest(int difficult, int arithmetic){

        Scanner scnr = new Scanner(System.in);

        double correctCounter = 0.0;
        int incorrectCounter = 0;

        int numberArray[] = new int[2];



        for(int i = 0; i < 10; i++) {
            numberArray = randomOutputforDifficulty(difficult);


            System.out.printf("How much is %d divided by %d?\n", numberArray[0], numberArray[1]);
            System.out.printf("Answer: ");
            double userAnswer = scnr.nextDouble();

            double correctAnswer = (double)numberArray[0] / (double)numberArray[1];


            System.out.printf("Answer: %.2f\n", userAnswer);
            System.out.printf("Correct Answer: %.2f\n", correctAnswer);

            if ((Math.abs(correctAnswer - userAnswer)) < .01) {
                correctAnswerResponse();
                correctCounter++;
            } else if((Math.abs(correctAnswer - userAnswer)) > .01){
                incorrectAnswerResponse();
                incorrectCounter++;
            }
            else{
                System.out.printf("Incorrect input. Try again.\n");
                System.out.printf("How much is %d divided by %d?\n", numberArray[0], numberArray[1]);
                System.out.printf("Answer: ");
            }
        }
        showScore(correctCounter, incorrectCounter);
    }

    static void makeRandomTest(int difficult, int arithmetic){
        SecureRandom randomProblem = new SecureRandom();
        Scanner scnr = new Scanner(System.in);



        double correctCounter = 0.0;
        int incorrectCounter = 0;

        int numberArray[] = new int[2];

        for(int i = 0; i < 10; i++) {
            numberArray = randomOutputforDifficulty(difficult);
            int randomProblemType = randomProblem.nextInt(4) + 1;

            if(randomProblemType == 1){
                System.out.printf("How much is %d plus %d?\n", numberArray[0], numberArray[1]);
                System.out.printf("Answer: ");
                double userAnswer = scnr.nextDouble();

                double correctAnswer = numberArray[0] + numberArray[1];


                System.out.printf("Answer: %.2f\n", userAnswer);


                if ((Math.abs(correctAnswer - userAnswer)) < .01) {
                    correctAnswerResponse();
                    correctCounter++;
                } else if((Math.abs(correctAnswer - userAnswer)) > .01){
                    incorrectAnswerResponse();
                    incorrectCounter++;
                }
            }

            else if(randomProblemType == 2){
                System.out.printf("How much is %d minus %d?\n", numberArray[0], numberArray[1]);
                System.out.printf("Answer: ");
                double userAnswer = scnr.nextDouble();

                double correctAnswer = numberArray[0] - numberArray[1];


                System.out.printf("Answer: %.2f\n", userAnswer);


                if ((Math.abs(correctAnswer - userAnswer)) < .01) {
                    correctAnswerResponse();
                    correctCounter++;
                } else if((Math.abs(correctAnswer - userAnswer)) > .01){
                    incorrectAnswerResponse();
                    incorrectCounter++;
                }
            }

            else if(randomProblemType == 3){
                System.out.printf("How much is %d times %d?\n", numberArray[0], numberArray[1]);
                System.out.printf("Answer: ");
                double userAnswer = scnr.nextDouble();

                double correctAnswer = numberArray[0] * numberArray[1];


                System.out.printf("Answer: %.2f\n", userAnswer);


                if ((Math.abs(correctAnswer - userAnswer)) < .01) {
                    correctAnswerResponse();
                    correctCounter++;
                } else if((Math.abs(correctAnswer - userAnswer)) > .01){
                    incorrectAnswerResponse();
                    incorrectCounter++;
                }
            }

            else{
                System.out.printf("How much is %d divided by %d?\n", numberArray[0], numberArray[1]);
                System.out.printf("Answer: ");
                double userAnswer = scnr.nextDouble();

                double correctAnswer = (double)numberArray[0] / (double)numberArray[1];


                System.out.printf("Answer: %.2f\n", userAnswer);
                System.out.printf("Correct Answer: %.2f\n", correctAnswer);

                if ((Math.abs(correctAnswer - userAnswer)) < .01) {
                    correctAnswerResponse();
                    correctCounter++;
                } else if((Math.abs(correctAnswer - userAnswer)) > .01){
                    incorrectAnswerResponse();
                    incorrectCounter++;
                }
            }



        }

        showScore(correctCounter, incorrectCounter);


    }

    public static void main(String[] args) {
        Scanner moreStudents = new Scanner(System.in);
        int keepGoing = 1;
        int moreTries = 0;

        while(keepGoing != 0) {

            int difficulty = getDifficulty();

            int arithmeticType = getArithmeticType();


            if (arithmeticType == 1) {
                makeAdditionTest(difficulty, arithmeticType);
            } else if (arithmeticType == 2) {
                makeSubtractionTest(difficulty, arithmeticType);
            } else if (arithmeticType == 3) {
                makeMultiplicationTest(difficulty, arithmeticType);
            } else if (arithmeticType == 4) {
                makeDivisionTest(difficulty, arithmeticType);
            } else {
                makeRandomTest(difficulty, arithmeticType);
            }
            System.out.printf("Are there more students that would like to try? (0 = No, 1 = Yes)\n");

            moreTries = moreStudents.nextInt();
            if(moreTries == 1) {
                keepGoing = 1;
            }
            else{
                keepGoing = 0;
            }






        }
    }


}
