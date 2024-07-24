package com.example.quiz;

public class QuestionAnswer {
    public static String[][] questions = {
            {
                    // Quiz 1 questions
                    "What is the capital of France?",
                    "What is 2 + 2?",
                    "What is the largest planet in our solar system?"
            },
            {
                    // Quiz 2 questions
                    "Who wrote 'To Kill a Mockingbird'?",
                    "What is the smallest prime number?",
                    "What is the speed of light?"
            },
            {
                    // Quiz 3 questions
                    "What is the hardest natural substance on Earth?",
                    "What is the chemical symbol for gold?",
                    "Who painted the Mona Lisa?"
            },
            {
                    // Quiz 4 questions
                    "In what year did the Titanic sink?",
                    "What is the capital of Japan?",
                    "What is the square root of 64?"
            },
            {
                    // Quiz 5 questions
                    "Who was the first President of the United States?",
                    "What is the largest ocean on Earth?",
                    "What is the boiling point of water in Celsius?"
            }
    };

    public static String[][][] choices = {
            {
                    // Quiz 1 choices
                    {"Paris", "London", "Berlin", "Madrid"},
                    {"1", "2", "3", "4"},
                    {"Earth", "Mars", "Jupiter", "Saturn"}
            },
            {
                    // Quiz 2 choices
                    {"Harper Lee", "J.K. Rowling", "Mark Twain", "Ernest Hemingway"},
                    {"0", "1", "2", "3"},
                    {"299,792,458 m/s", "150,000,000 m/s", "300,000,000 m/s", "3,000 m/s"}
            },
            {
                    // Quiz 3 choices
                    {"Diamond", "Gold", "Iron", "Platinum"},
                    {"Au", "Ag", "Pt", "Pb"},
                    {"Leonardo da Vinci", "Vincent van Gogh", "Pablo Picasso", "Claude Monet"}
            },
            {
                    // Quiz 4 choices
                    {"1912", "1905", "1920", "1898"},
                    {"Tokyo", "Kyoto", "Osaka", "Nagoya"},
                    {"8", "7", "6", "9"}
            },
            {
                    // Quiz 5 choices
                    {"George Washington", "John Adams", "Thomas Jefferson", "James Madison"},
                    {"Pacific Ocean", "Atlantic Ocean", "Indian Ocean", "Arctic Ocean"},
                    {"100°C", "90°C", "110°C", "120°C"}
            }
    };

    public static String[][] correctAnswers = {
            // Correct answers for each quiz
            {"Paris", "4", "Jupiter"},
            {"Harper Lee", "1", "299,792,458 m/s"},
            {"Diamond", "Au", "Leonardo da Vinci"},
            {"1912", "Tokyo", "8"},
            {"George Washington", "Pacific Ocean", "100°C"}
    };
}
