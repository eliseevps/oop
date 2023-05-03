package task1408;

public class MoldovaHen extends Hen {
    @Override
    int getCountOfEggsPerMonth() {
        return 90;
    }

    @Override
    String getDescription() {
        return super.getDescription() + String.format("Моя страна %s. Я несу %d яиц в день.", MOLDOVA, getCountOfEggsPerMonth());
    }
}
