package cc.xpbootcamp.code_smell_kit.$12_repeated_switch;

public enum Direction {
    E,W,N,S;
    public static Direction create(String direction) {
        switch (direction) {
            case "W":
                return W;
            case "N":
                return N;
            case "S":
                return S;
            default:
                return E;
        }
    }
}
