public class Keyboard {
    private String backlight;
    private String numBlok;

    public Keyboard(String backlight, String numBlok) {
        this.backlight = backlight;
        this.numBlok = numBlok;
    }

    public String getBacklight() {
        return backlight;
    }

    public void setBacklight(String backlight) {
        this.backlight = backlight;
    }

    public String getNumBlok() {
        return numBlok;
    }

    public void setNumBlok(String numBlok) {
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
