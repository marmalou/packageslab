import org.junit.Before;
import org.junit.Test;
import staff.management.Manager;

import static org.junit.Assert.assertEquals;

public class ManagerTest {

    Manager manager;

    @Before
    public void before(){
        manager = new Manager("Andy", "JH51414B", 40000, "Finance");

    }

    @Test
    public void hasDepartmentName(){
        assertEquals("Finance", manager.getDeptName());
    }

    @Test
    public void hasName(){
        assertEquals("Andy",manager.getName());
    }

    @Test
    public void hasNINo(){
        assertEquals("JH51414B", manager.getNumber());
    }

    @Test
    public void hasSalary(){
        assertEquals(40000,0.1, manager.getSalary());
    }

    @Test
    public void testRaiseSalary(){
        assertEquals(60000,0.1, manager.raiseSalary(1.5));
    }

    @Test
    public void testPayBonus(){
        assertEquals(400,0.1, manager.payBonus());
    }

}
