public class BoxOfCandy
{
    public BoxOfCandy(Candy[][] c) {
        box = c;
    }

    private Candy[][] box;


    //public boolean moveCandyToFirstRow(int col) {}


    //public Candy removeNextByFlavor(String flavor) {}



    public String toString() {
        String s = "";

        for(int row = 0; row < box.length; row++) {
            for(int col = 0; col < box[0].length; col++) {
                s += box[row][col] + " ";
            }
            s += "\n";
        }
        return s;
    }



}