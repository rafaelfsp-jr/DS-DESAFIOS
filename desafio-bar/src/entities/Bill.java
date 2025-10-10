package src.entities;

public class Bill {
    public char gender;
    public int beer;
    public int barbecue;
    public int softDrink;

    public static final double MENS_TICKET = 10.00;
    public static final double WOMENS_TICKET = 8.00;
    public static final double COVER_PRICE = 4.00;
    public static final double BEER_PRICE = 5.00;
    public static final double DRINK_PRICE = 3.00;
    public static final double BARBECUE_PRICE = 7.00;

    public double cover() {
        return (feeding() > 30.0) ? 0.00 : COVER_PRICE;
    }

    public String coverAsString() {
        return (feeding() > 30) 
        ? "ISENTO DE COUVERT" 
        : String.format("COUVERT = R$ %.2f", COVER_PRICE);
    }

    public double feeding() {
        return (beer * BEER_PRICE) + (softDrink * DRINK_PRICE) + (barbecue * BARBECUE_PRICE);
    }

    public double ticket() {
        if(Character.toUpperCase(gender) == 'M') {
            return MENS_TICKET;
        } else {
            return WOMENS_TICKET;
        }
    }

    public double total() {
        return feeding() + cover() + ticket();
    }

    @Override
    public String toString() {
        return String.format(
            "\nRELATÓRIO\nCONSUMO = R$ %.2f\n%s\nINGRESSO = R$ %.2f\n\nVALOR A PAGAR = R$ %.2f",
            feeding(), coverAsString(), ticket(), total()
            );

    }

}
