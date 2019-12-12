package BID.SWE;


import org.junit.Test;
import org.junit.Assert;

import java.beans.Beans;

import static org.junit.Assert.*;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }

    /*********************/
    /** CellPrinter **/
    /**
    @Test
    public void CellPrinter1()
    {
        ImpCellPrinter cell = new ImpCellPrinter();
        String output = cell.PrintState(true, 2001-01-26, "rot");
        assertEquals("Cell rot born on 14.12.2019 is alive", output);
    }
     Datum nicht sicher */
    @Test
    public void CellPrinter2()
    {
        ImpCellPrinter cell = new ImpCellPrinter();
        String output = cell.PrintPostion(6,7);
        assertEquals("Cell is on Position X:6 Y:7", output);
    }
    @Test
    public void CellPrinter3()
    {
        ImpCellPrinter cell = new ImpCellPrinter();
        String output = cell.PrintPostion(7,8);
        assertEquals("Cell is on Position X:7 Y:8", output);
    }
    @Test
    /** Methode ueberladen **/
    public void Ercersicetest1()
    {
        Exercise2Impl.ab_cell_ueberladen ue = new Exercise2Impl.ab_cell_ueberladen();
        boolean output = ue.IsAlive(2);
        assertEquals("true", output);
    }
    @Test
    public void Ercersicetest2()
    {
        Exercise2Impl.ab_cell_ueberladen ue = new Exercise2Impl.ab_cell_ueberladen();
        boolean output = ue.IsAlive(1);
        assertEquals("false", output);
    }
    /** Aufgabe 3 **/
    @Test
    public void GetMapNametest1()
    {
        ImpMap ue = new ImpMap();
        String output = ue.GetMapName();
        assertEquals("BID-Name", output);
    }
    /**
    @Test
    public void GetMapSize_test1()
    {
        ImpMap ue = new ImpMap();
        float output = ue.GetMapSize();
        assertEquals(3*3, output);
    }
    */
    @Test
    public void test3()
    {
        ImpMap ue = new ImpMap();
        int output = ue.AddNewCells(1);
        assertEquals(3, output);
    }

}
