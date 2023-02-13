public class Keyboard {
    String backlight;
    String numBlok;

    public Keyboard(String backlight, String numBlok) {
        this.backlight = backlight;
        this.numBlok = numBlok;
    }

    @Override
    public String toString() {
        return "Keyboard{" +
                "backlight='" + backlight + '\'' +
                ", numBlok='" + numBlok + '\'' +
                '}';
    }
}
