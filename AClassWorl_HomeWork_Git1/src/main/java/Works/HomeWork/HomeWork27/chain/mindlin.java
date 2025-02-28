package Works.HomeWork.HomeWork27.chain;

class mindlin extends BaseStringFilter {
    private final int minLength;

    public mindlin() {
        this.minLength = 8; // какя длина сюда
    }

    @Override
    protected String handle(String input) {
        if (input == null || input.length() < minLength) {
            return null;
        }
        return input;
    }
}