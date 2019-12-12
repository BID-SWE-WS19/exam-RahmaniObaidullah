package BID.SWE;

import java.util.Date;

public class ImpCellPrinter implements CellPrinter {
    @Override
    public String PrintState(boolean b, Date date, String s) {
        if(b == true){
            return "Cell "+s+" born on"+date+" is alive";
        }
        else{
            return "Cell "+s+" born on"+date+" is not alive";
        }
    }

    @Override
    public String PrintPostion(int i, int i1) {
        return "Cell is on Position X:"+i+" Y:"+i1;
    }
}
