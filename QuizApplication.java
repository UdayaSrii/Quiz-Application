import java.util.Scanner;
public class QuizApplication {
    // Createing a quiz with 5 questions
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner sc = new Scanner(System.in);
        // The quiz questions and answers
        String[] questions = {
            "What is the capital of India?",
            "Which planet is the largest in our solar system?",
            "Who painted the famous painting 'The Starry Night'?"
        };
        // The options for each question
        String[][] options = {
            {"Delhi", "Mumbai", "Chennai", "Hyderabad"},
            {"Earth", "Saturn", "Jupiter", "Mars"},
            {"Leonardo da Vinci", "Vincent van Gogh", "Pablo Picasso", "Claude Monet"}
        };
        // The correct answers for each question
        String[] answers = {"Delhi", "Jupiter", "Vincent van Gogh"};
        // The score of the user
        int score = 0;
        // Loop through each question
        for (int i = 0; i < questions.length; i++) {
            // Print the question
            System.out.println(questions[i]);
            for (int j = 0; j < options[i].length; j++) {
                System.out.println((j + 1) + ". " + options[i][j]);
            }
            // Enter the user's answer
            System.out.print("Enter the number of your answer: ");
            int userAnswer = sc.nextInt() - 1;
            // If the user's answer is correct, increment the score
            if (options[i][userAnswer].equals(answers[i])) {
                System.out.println("Correct!");
                score++;
            } else {
                System.out.println("Incorrect! The correct answer is " + answers[i]);
            }
            // Print a blank line to separate each question
            System.out.println();
        }
        // Print the final score
        System.out.println("Quiz complete! Your final score is " + score + "/" + questions.length);
    }
}
