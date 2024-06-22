package design.pattern;

public enum ItemType {
    COCA_COLA(1),
    BISCUIT(2),

    CHIPS(3),

    WATER(4)
    ;

    public final int value;
    ItemType(int value){

        this.value = value;
    }
    public int getValue(){
        return value;
    }
    public static ItemType getDefault(){
        return COCA_COLA;
    }
}
