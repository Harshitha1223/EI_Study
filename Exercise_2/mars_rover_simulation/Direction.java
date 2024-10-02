
enum Direction {
    N, S, E, W;

    public Direction left() {
        switch (this) {
            case N: return W;
            case W: return S;
            case S: return E;
            case E: return N;
        }
        return this;
    }

    public Direction right() {
        switch (this) {
            case N: return E;
            case E: return S;
            case S: return W;
            case W: return N;
        }
        return this;
    }
}
