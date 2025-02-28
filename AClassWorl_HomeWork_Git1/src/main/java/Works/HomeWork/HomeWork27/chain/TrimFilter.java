package Works.HomeWork.HomeWork27.chain;

class TrimFilter extends BaseStringFilter {
    @Override
    protected String handle(String input) {
        return input.trim();
    }
}
