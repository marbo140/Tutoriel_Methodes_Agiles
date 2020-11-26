package bluej;


import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import vetement_prix.Prix;

/**
 */
public class VetementEtPrixTest {
	private Vetement vetementTest;
    private Prix prixTest;

    /**
     * Constructeur de la classe-test vetementEtPrixTest
     */
    public VetementEtPrixTest() {}

    /**
     * Met en place les engagements.
     *
     * Méthode appelée avant chaque appel de méthode de test.
     */
    @Before
    public void setUp() {
        vetementTest = new Vetement("pull", "bleu");
        prixTest = new Prix();
    }

    /**
     * Supprime les engagements
     *
     * Méthode appelée après chaque appel de méthode de test.
     */
    @After
    public void tearDown() {}

    /*@Test
    public void testVerifierVetement() {
		assertEquals(true, vetementTest.verifierVetement("pull", "bleu", prixTest));
    }*/
}

