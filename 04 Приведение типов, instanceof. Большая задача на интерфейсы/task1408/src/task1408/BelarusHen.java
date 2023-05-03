package task1408;

public class BelarusHen extends Hen {
    @Override
    int getCountOfEggsPerMonth() {
        return 87;
    }

    @Override
    String getDescription() {
        return super.getDescription() + String.format("Моя страна %s. Я несу %d яиц в день.", BELARUS, getCountOfEggsPerMonth());
    }
}
