package quizCard;

public class QuizCard {
    String question;
    String answer;

    public QuizCard(String question, String answer){
        this.question=question;
        this.answer=answer;
    }

    public String getAnswer() {
        return answer;
    }

    public String getQuestion() {
        return question;
    }
}
