package Test8;

public class TestDemo {
    public static void main(String[] args) {
        BasketballCoach bc = new BasketballCoach();
        bc.eat();
        bc.teach();
        BasketballAthlete ba = new BasketballAthlete();
        ba.eat();
        ba.study();
        TableCoach tc = new TableCoach();
        tc.eat();
        tc.teach();
        tc.speakEnglish();
        TableAthlete ta = new TableAthlete();
        ta.eat();
        ta.study();
        ta.speakEnglish();
    }
}
