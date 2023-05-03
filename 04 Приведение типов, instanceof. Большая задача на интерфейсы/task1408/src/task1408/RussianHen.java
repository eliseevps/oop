package task1408;

public class RussianHen extends Hen {
    @Override
    int getCountOfEggsPerMonth() {
        return 100;
    }

    @Override
    String getDescription() {
        return super.getDescription() + String.format("Моя страна %s. Я несу %d яиц в день.", RUSSIA, getCountOfEggsPerMonth());
    }
}
