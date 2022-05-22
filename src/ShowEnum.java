enum ShapeType{
    SQUARE,RECTANGLE,CIRCLE,TRAPEZZIUM,TRIANGLE,OVAL,HEXAGON
}

public class ShowEnum {
    public void main(String[]args){
        for (ShapeType s: ShapeType.values())
            System.out.println(s + "no watosc porzadknoa "+ s.ordinal()+ '\n' );
    }
}
