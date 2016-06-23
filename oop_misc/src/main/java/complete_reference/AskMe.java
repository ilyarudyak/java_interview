package complete_reference;

import java.util.Random;

/**
 * Created by ilyarudyak on 6/23/16.
 */
enum Answer {
    NO("No"), YES("Yes"), MAYBE("Maybe"), LATER("Later"), SOON("Soon"), NEVER("Never");

    private String name;
    Answer(String name) {
        this.name = name;
    }


    @Override
    public String toString() {
        return name;
    }
}

public class AskMe {

    public static void answer(Answer result) {
        switch(result) {
            case NO:
                System.out.println("No");
                break;
            case YES:
                System.out.println("Yes");
                break;
            case MAYBE:
                System.out.println("Maybe");
                break;
            case LATER:
                System.out.println("Later");
                break;
            case SOON:
                System.out.println("Soon");
                break;
            case NEVER:
                System.out.println("Never");
                break;
        }
    }
    public static void answer2(Answer answer) {
        System.out.println(answer);
    }


    static class Question {
        Random rand = new Random();
        Answer ask() {
            int prob = (int) (100 * rand.nextDouble());

            if (prob < 15)
                return Answer.MAYBE; // 15%
            else if (prob < 30)
                return Answer.NO;    // 15%
            else if (prob < 60)
                return Answer.YES;   // 30%
            else if (prob < 75)
                return Answer.LATER; // 15%
            else if (prob < 98)
                return Answer.SOON;  // 13%
            else
                return Answer.NEVER; // 2%
        }
    }

    public static void main(String args[]) {
        Question q = new Question();
        answer(q.ask());
        answer(q.ask());
        answer(q.ask());
        answer(q.ask());

        System.out.println();
        answer2(q.ask());
    }
}
