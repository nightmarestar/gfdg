package Test8;

public class TableAthlete extends Athlete implements English{
    public TableAthlete() {
    }

    public TableAthlete(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("乒乓球运动员吃饭");
    }

    @Override
    public void study() {
        System.out.println("乒乓球运动员学习");
    }

    @Override
    public void speakEnglish() {
        System.out.println("乒乓球运动员需要说英语");
    }
}
