package Test8;

public class TableCoach extends Coach implements English{
    public TableCoach() {
    }

    public TableCoach(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("乒乓球教练吃饭");
    }

    @Override
    public void teach() {
        System.out.println("乒乓球教练教学");
    }

    @Override
    public void speakEnglish() {
        System.out.println("乒乓球教练需要说英语");
    }
}
