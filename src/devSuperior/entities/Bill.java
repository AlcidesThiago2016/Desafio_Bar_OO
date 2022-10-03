package devSuperior.entities;

public class Bill {

    public final double COUVER = 4.0;

    public char gender;
    public int beer;
    public int barbecue;
    public int softDrink;

    public double cover(){
        return COUVER;
    }

    public double feeding(){
        double v = beer * 5.00 + barbecue * 7.00 + softDrink * 3.00;
        return v;
    }

    public double ticket(){
        if ( this.gender=='M'){
            return 10.00;
        }else {
            return 8.00;
        }
    }

    public double total(){
        if (feeding() > 30.0){
            return feeding() + ticket();
        }else {
            return feeding() + cover() + ticket();
        }
    }
}
