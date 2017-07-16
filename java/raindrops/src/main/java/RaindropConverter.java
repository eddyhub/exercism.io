class RaindropConverter {

    StringBuilder answere = new StringBuilder();

    String convert(int number) {
        if (number % 3 == 0) answere.append("Pling");
        if (number % 5 == 0) answere.append("Plang");
        if (number % 7 == 0) answere.append("Plong");
        if (answere.length() == 0) answere.append(number);
        return answere.toString();
    }

}
