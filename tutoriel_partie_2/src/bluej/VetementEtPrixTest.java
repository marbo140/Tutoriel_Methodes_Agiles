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
     * M�thode appel�e avant chaque appel de m�thode de test.
     */
    @Before
    public void setUp() {
        vetementTest = new Vetement("pull", "bleu");
        prixTest = new Prix();
    }

    /**
     * Supprime les engagements
     *
     * M�thode appel�e apr�s chaque appel de m�thode de test.
     */
    @After
    public void tearDown() {}

    /*@Test
    public void testVerifierVetement() {
		assertEquals(true, vetementTest.verifierVetement("pull", "bleu", prixTest));
    }*/
}

