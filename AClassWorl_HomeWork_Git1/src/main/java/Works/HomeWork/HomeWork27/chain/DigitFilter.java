package Works.HomeWork.HomeWork27.chain;

class DigitFilter extends BaseStringFilter {
    @Override
    protected String handle(String input) {
        return input.replaceAll("\\d", "");
    }
}
