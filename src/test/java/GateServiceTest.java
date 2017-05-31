import com.mycompany.tmc_jepp.Models.Gate;
import com.mycompany.tmc_jepp.Services.GatesService;
import org.json.JSONObject;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class GateServiceTest  {

    private GatesService gs = new GatesService();

    @Test
    public void testGatesServiceArrayLength() {

        final int expectedGateNumber = 4;
        ArrayList<Gate> gates = gs.getGates();

        assertEquals( expectedGateNumber , gates.size());
    }

    @Test
    public void testGetSingleGate() {

        ArrayList<Gate> gates = gs.getGates();

        Gate expected = new Gate("3050042784","54.3814913","18.4658952");
        Gate actual = gates.get(1);

        assertEquals(actual.getId(), expected.getId());
        assertEquals(actual.getLat(), expected.getLat());
        assertEquals(actual.getLon(), expected.getLon());

    }

    @Test
    public void testChoseGatePositiv() {
        JSONObject inputGateId = new JSONObject("{\"id\":3050042783}");
        gs.choseGate(inputGateId);

        JSONObject actual = gs.getChosenGate();

        assertEquals(inputGateId, actual);
    }

    @Test
    public void testChoseGateWithChange() {
        JSONObject inputGateId = new JSONObject("{\"id\":3050042783}");
        gs.choseGate(inputGateId);
        JSONObject inputGateId2 = new JSONObject("{\"id\":3050042784}");
        gs.choseGate(inputGateId2);

        JSONObject actual = gs.getChosenGate();

        assertNotEquals(inputGateId, actual);
        assertEquals(inputGateId2, actual);
    }

}
