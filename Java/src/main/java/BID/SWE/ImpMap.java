package BID.SWE;

public class ImpMap extends Map {
    @Override
    public String GetMapName() {
        return "BID-Map";
    }

    public float GetMapSize(float amount) {
        return amount*amount;
    }

    @Override
    public int AddNewCells(int count) {
        return count;
    }
}
