package Works.HomeWork.HomeWork27.chain;

class maxdlin extends BaseStringFilter {
    private final int maxLength;

    public maxdlin() {
        this.maxLength = 13; // какая длиена сюда
    }

    @Override
    protected String handle(String input) {
        if (input == null || input.length() > maxLength) {
            return null;
        }
        return input;
    }
}