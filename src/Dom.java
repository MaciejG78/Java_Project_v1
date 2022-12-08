public class Dom {
    Double wysokosc;
    Integer iloscPomieszczen;

    public Dom(Double wysokosc, Integer iloscPomieszczen) {
        this.wysokosc = wysokosc;
        this.iloscPomieszczen = iloscPomieszczen;
    }

    public String pomaluj(String kolor) {
        return "Pomalowano dom na :" + kolor;
    }

    public Integer rozbudujDom(Integer nowaIlosPomieszczen) {
        this.iloscPomieszczen = this.iloscPomieszczen + nowaIlosPomieszczen;;
        return this.iloscPomieszczen;
    }
}
