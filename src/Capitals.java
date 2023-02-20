public enum Capitals {

    WASHINGTON("is a capital of USA"),
    BISHKEK("is a capital of Kyrgyzstan"),
    ANKARA("is a capital of Turkey"),
    MOSCOW("is a capital of Russia"),
    TASHKENT("is a capital of Uzbekistan");
    private String country;

    Capitals(String country) {
        this.country = country;
    }

    public String getCountry() {
        return country;
    }
}
