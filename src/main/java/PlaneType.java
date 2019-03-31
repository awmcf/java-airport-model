public enum PlaneType {
    SMALL(50),
    MEDIUM(200),
    LARGE(400);

    private final int capacity;

    PlaneType(int capacity){
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }
}