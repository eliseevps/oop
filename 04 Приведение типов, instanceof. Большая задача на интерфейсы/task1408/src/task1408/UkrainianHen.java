package task1408;

public class UkrainianHen extends Hen{
    @Override
    int getCountOfEggsPerMonth() {
        return 95;
    }

    @Override
    String getDescription() {
        return super.getDescription() + String.format("Моя страна %s. Я несу %d яиц в день.", UKRAINE, getCountOfEggsPerMonth());
    }
}
