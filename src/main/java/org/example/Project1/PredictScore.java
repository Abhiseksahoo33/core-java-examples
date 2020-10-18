package org.example.Project1;
import java.util.*;
public class PredictScore {
    public static void main(String[] args) {
        Player pref= new Player();
        pref.inputPlayer();
        //PredictScoreFunction fun =new PredictScoreFunction();

    }



}
class Player
{
    // initial score is assigned  =  0
    int score_of_player1=0;
    int score_of_player2=0;
    int score_of_player3=0;
    int score_of_player4=0;
    String pname1;
    String pname2;
    String pname3;
    String pname4;
    int actualscore;
    int turn=0;


    public void inputPlayer() {

        //  taking input of 4 players name

        Scanner sc = new Scanner(System.in); // Scanner class (System.in = input stream to take user input from keyboard)
        System.out.println("Player 1 : Enter your name :-");
        pname1 = sc.nextLine();
        System.out.println("Player 2 : Enter your name :-");
        pname2 = sc.nextLine();
        System.out.println("Player 3 : Enter your name :-");
        pname3 = sc.nextLine();
        System.out.println("Player 4 : Enter your name :-");
        pname4 = sc.nextLine();


        // information AND RULE OF GAME
        System.out.println("------------This is a 6 over cricket game------- ");
        System.out.println("\n---Information---");
        System.out.println("\n you have to predict the score before then ball  is bowled \n \t " +
                "if your prediction is right the your score will be +10 \n \t " +
                "if your prediction is wrong then your score will be -10 \n" +
                " you have to predict score between {1,2,4,6}");

        System.out.println("\n------start-------");


        actualscore = randomscoregenerate(); // function to generate random no from [1,2,4,6]


        for (int i = 1; i <= 2; i++)
        { // 6 over game

            for (int j = 1; j <= 2; j++)
            { // 6 balls per over
                System.out.println("number of Over  : "+i+ "\t number of ball  : "+j);

                // PLAYER1 PREDICTION
                System.out.println("\n \nPlayer 1 : enter your prediction");
                int prediction_of_player1 = sc.nextInt();

                // checking the input score is valid or not
                prediction_of_player1 = scorevalidation(prediction_of_player1);
                // matching predicted score with actual
                score_of_player1 = checkprediction(prediction_of_player1, actualscore, score_of_player1);


                // PLAYER2 PREDICTION

                System.out.println("Player 2 : enter your prediction");
                int prediction_of_player2 = sc.nextInt();
                // checking the input score is valid or not
                prediction_of_player2 = scorevalidation(prediction_of_player2);
                score_of_player2 = checkprediction(prediction_of_player2, actualscore, score_of_player2);


                // PLAYER3 PREDICTION

                System.out.println("Player 3 : enter your prediction");
                int prediction_of_player3 = sc.nextInt();
                // checking the input score is valid or not
                prediction_of_player3 = scorevalidation(prediction_of_player3);
                score_of_player3 = checkprediction(prediction_of_player3, actualscore, score_of_player3);

                // PLAYER4 PREDICTION

                System.out.println("Player 4 : enter your prediction");
                int prediction_of_player4 = sc.nextInt();
                // checking the input score is valid or not
                prediction_of_player4 = scorevalidation(prediction_of_player4);
                score_of_player4 = checkprediction(prediction_of_player4, actualscore, score_of_player4);
                System.out.println("actual score : " + actualscore);
                turn += 1;
            }
        }

        finalresult();
    }
    public static int randomscoregenerate()
    {
        int [] score=new int[]{1,2,4,6};
        return score [new Random().nextInt(score.length)];// creating random score
        //  System.out.println("random no :"+randomno);

    }

    private int scorevalidation(int score)
    {
        int newscore ;
        if (score == 3 || score == 5 || score > 6 || score < 1)
        {
            Scanner sc1=new Scanner(System.in);
            System.out.println("Please Predict a valid score from (1,2,4,6)");
            newscore = sc1.nextInt();

        }
        else
            newscore=score; // if its a valid input then newscore= entered score
        return newscore;

    }
    int  checkprediction(int x,int y,int score_of_playerx)
    {
        int finalscore=score_of_playerx;
        // System.out.println("-----prediction : "+x+"-  actual score :"  +y);
        if(x==y)
        {
            finalscore += 10;
        }
        else
            finalscore -= 10;
        return finalscore;
    }


    void  finalresult()
    {
        System.out.println("\n\n--------End of the game---- ");
        System.out.println("\n------SCORE BOARD------\n \t Top player/s");

        int w3=Math.max(Math.max(score_of_player1,score_of_player2),Math.max(score_of_player3,score_of_player4));
        if(w3==score_of_player1)
        {
            System.out.println("Player 1("+pname1+")  .\n");
        }
        if(w3==score_of_player2)
        {
            System.out.println("Player 2("+pname2+")  .\n");
        }
        if(w3==score_of_player3)
        {
            System.out.println("Player 3("+pname3+")  .\n");
        }
        if(w3==score_of_player4)
        {
            System.out.println("Player 4("+pname4+") .\n");
        }


        System.out.println("Final Score of player1("+pname1+"): "+score_of_player1);
        System.out.println("Final Score of player2("+pname2+"): "+score_of_player2);
        System.out.println("Final Score of player3("+pname3+"): "+score_of_player3);
        System.out.println("Final Score of player4("+pname4+"): "+score_of_player4);
        System.out.println("\n Thank your for playing.");
    }
}
