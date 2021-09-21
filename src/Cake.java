public class Cake {
    //brownier

    private double smørVægt = 250;
    private double smørEnergi = 30000;


    private double chokoladeVægt = 150;
    private double chokoladeEnergi = 15600;


    private double ægVægt = 240;
    private double ægEnergi = 5760;


    private double sukkerVægt = 250;
    private double sukkerEnergi =17000;


    private double melVægt = 150;
    private double melEnergi =9000;


    private double kakaopulverVægt = 21;
    private double kakaopulverEnergi = 1428;


    private double nøddeKernerVægt = 200;
    private double nøddeKernerEnergi = 24000;

    private int serveringer;

    private final double oprindeligeAntalServeringer = 4;


    public Cake(int serveringer){
        this.serveringer = serveringer;
    }

    public int getServeringer(){
        return serveringer;
    }

    public void setServeringer(){
        this.serveringer = serveringer;
    }

    @Override
    public String toString() {
        return "Cake{" +
                "smørVægt=" + smørVægt +
                ", smørEnergi=" + smørEnergi +
                ", chokoladeVægt=" + chokoladeVægt +
                ", chokoladeEnergi=" + chokoladeEnergi +
                ", ægVægt=" + ægVægt +
                ", ægEnergi=" + ægEnergi +
                ", sukkerVægt=" + sukkerVægt +
                ", sukkerEnergi=" + sukkerEnergi +
                ", melVægt=" + melVægt +
                ", melEnergi=" + melEnergi +
                ", kakaopulverVægt=" + kakaopulverVægt +
                ", kakaopulverEnergi=" + kakaopulverEnergi +
                ", nøddeKernerVægt=" + nøddeKernerVægt +
                ", nøddeKernerEnergi=" + nøddeKernerEnergi +
                ", serveringer=" + serveringer +
                '}';
    }

    public double totalVægtIngredienser (){

        double omregningsFaktor = serveringer/oprindeligeAntalServeringer;

        double resultat = smørVægt + chokoladeVægt + ægVægt + sukkerVægt + melVægt + kakaopulverVægt + nøddeKernerVægt;

        resultat = resultat * omregningsFaktor;

        return resultat;
    }

    public double totalVægtFærdigKage (){

        double resultat = totalVægtIngredienser()*0.9;

        return resultat;

    }

    public double samletEnergiIndhold (){

        double omregningsFaktor = serveringer/oprindeligeAntalServeringer;
        double resultat = smørEnergi + chokoladeEnergi + ægEnergi + sukkerEnergi + melEnergi +kakaopulverEnergi + nøddeKernerEnergi;
        resultat = resultat * omregningsFaktor;
        return resultat;

    }

}
