package state;

import java.util.Random;

public class StateSample {
    public static void main(String[] args) {
        Yumi yumi = new Yumi(new OrdinaryState());
        changeStateOfYumi(yumi, new OrdinaryState());
        changeStateOfYumi(yumi, new BadMoodState());
    }

    private static void changeStateOfYumi(Yumi yumi, State state) {
        yumi.changeState(state);
        p("由美の状態：" + yumi.getStateName());
        p("あなた：おはよう！");
        p("由美：" + yumi.morningGreet());
        p("あなた：寒いね！");;
        p("由美：" + yumi.getProtectionForCold());
        p("---------------------");
    }

    private static void p(String s) {
        System.out.println(s);
    }
}