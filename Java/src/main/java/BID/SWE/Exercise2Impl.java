package BID.SWE;

public class Exercise2Impl implements Exercise2
{
    public class ab_cell extends Cell {
    }

    public class ab_cell_ueberschreiben extends Cell {
        @Override
        public int Grow() {
            return this._size*2;
        }
    }

    public static class ab_cell_ueberladen extends Cell {
        public boolean IsAlive(int neighbours) {
            if(neighbours % 2 == 0){
                return true;
            }
            else{
                return false;
            }
        }
    }
    @Override
    public Object Method1() {
        return new ab_cell();
    }

    @Override
    public int Method2() {
        return new ab_cell_ueberschreiben().Grow();
    }

    @Override
    public boolean Method3(int i) {
        return new ab_cell_ueberladen().IsAlive();
    }
}
