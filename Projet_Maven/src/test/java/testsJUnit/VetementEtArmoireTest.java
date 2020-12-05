package testsJUnit;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import objects.Armoire;
import objects.Vetement;

/**
 */
public class VetementEtArmoireTest {
	private Vetement vetement1;
	private Armoire armoire1;
    /**
     * Constructeur de la classe-test vetementTest
     */
    public VetementEtArmoireTest() {}

    /**
     * Met en place les engagements.
     *
     * Méthode appelée avant chaque appel de méthode de test.
     */
    @Before
    public void setUp() {
    	vetement1 = new Vetement("pull", "bleu");
        armoire1 = new Armoire();
    }

    /**
     * Supprime les engagements
     *
     * Méthode appelée après chaque appel de méthode de test.
     */
    @After
    public void tearDown() {}

    @Test
    public void testChangeCouleur() {
        vetement1.setCouleur("vert");
        assertEquals("vert", vetement1.getCouleur());
    }

    @Test
    public void testChangeType() {
        vetement1.setType("veste");
        assertEquals("veste", vetement1.getType());
    }
    
    @Test
    public void testChangeCouleurNull() {
        vetement1.setCouleur(null);
        assertEquals("bleu", vetement1.getCouleur());
    }

    @Test
    public void testChangeTypeNull() {
        vetement1.setType(null);
        assertEquals("pull", vetement1.getType());
    }
    
    @Test
    public void testAddVetement() {
        armoire1.addVetement(vetement1);
        assertTrue(armoire1.hasVetement(vetement1));
        assertEquals(vetement1.getArmoire(), armoire1);
    }
    
    @Test
    public void testRemoveVetement() {
        armoire1.addVetement(vetement1);
        assertTrue(armoire1.hasVetement(vetement1));
        assertEquals(vetement1.getArmoire(), armoire1);
        armoire1.removeVetement(vetement1);
        assertFalse(armoire1.hasVetement(vetement1));
        assertEquals(vetement1.getArmoire(), null);   
    }

    @Test (expected = UnsupportedOperationException.class)
    public void testUnmodifiableContenu() {
    	armoire1.addVetement(vetement1);
        assertTrue(armoire1.hasVetement(vetement1));
        assertEquals(vetement1.getArmoire(), armoire1);
        armoire1.getContenu().contains(vetement1);
        armoire1.getContenu().add(vetement1);
    }
    
    @Test
    public void testCreateTestSuite(){
    	TestSuite instance = new TestSuite();
    	assertTrue(instance instanceof TestSuite);
    }

}



