package Works.HomeWork.HomeWork27.chain;

interface StringFilter {
    void setNext(StringFilter next);

    String process(String input);
}