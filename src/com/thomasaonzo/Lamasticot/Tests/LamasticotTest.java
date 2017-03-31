package com.thomasaonzo.Lamasticot.Tests;

import com.thomasaonzo.Lamasticot.Dessins.Chapeau;
import com.thomasaonzo.Lamasticot.Dessins.Lamasticot;
import com.thomasaonzo.Lamasticot.Dessins.Medaille;
import junit.framework.Assert;
import junit.framework.TestCase;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

/**
 * Created by thaonzo on 31/03/2017.
 */
public class LamasticotTest extends TestCase {
    private Lamasticot Lamastica;
    @Before
    public void setUp() throws Exception {
        Lamastica = new Lamasticot();
    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void testAjoutMedaille() throws Exception {
        Medaille m = new Medaille();
        Lamastica.ajoutMedaille(m);
        Assert.assertEquals(m,Lamastica.getMesMedailles().get(0));
    }

    @Test
    public void testVoirMedaille() throws Exception {
        Medaille m = new Medaille();
        Lamastica.ajoutMedaille(m);
        Assert.assertEquals(m,Lamastica.voirMedaille(0));
    }
    @Test
    public void testEquiperChapeauPlein() throws Exception {
        Chapeau c = new Chapeau();
        Lamastica.setMonChapeau(c);
        Assert.assertEquals(c,Lamastica.getMonChapeau());
    }
    @Test
    public void testEquiperChapeauVide() throws Exception {
        Chapeau c = new Chapeau();
        Assert.assertEquals(null,Lamastica.getMonChapeau());
    }

    @Test
    public void testCommentEstMonChapeauPlein() throws Exception {
        Chapeau c = new Chapeau("Rouge");
        Lamastica.setMonChapeau(c);
        Assert.assertEquals("Mon chapeau est Rouge",Lamastica.commentEstMonChapeau());
    }
    @Test
    public void testCommentEstMonChapeauVide() throws Exception {
        Assert.assertEquals("Je n'ai pas de chapeau",Lamastica.commentEstMonChapeau());
    }

    @Test
    public void testGetMonSexe() throws Exception {
        Lamastica.setMonSexe(0);
        Assert.assertEquals(0,Lamastica.getMonSexe());
    }

    @Test
    public void testSetMonSexe() throws Exception {
        Lamastica.setMonSexe(1);
        Assert.assertEquals(1,Lamastica.getMonSexe());
    }

    @Test
    public void testGetMaCouleur() throws Exception {
        Lamastica.setMaCouleur("Rouge");
        Assert.assertEquals("Rouge", Lamastica.getMaCouleur());
    }

    @Test
    public void testSetMaCouleur() throws Exception {
        Lamastica.setMaCouleur("Bleu");
        Assert.assertEquals("Bleu", Lamastica.getMaCouleur());
    }

    @Test
    public void testGetMonChapeau() throws Exception {
        Chapeau c =new Chapeau();
        Lamastica.setMonChapeau(c);
        Assert.assertEquals(c,Lamastica.getMonChapeau());
    }

    @Test
    public void testSetMonChapeau() throws Exception {
        Chapeau c =new Chapeau();
        Lamastica.setMonChapeau(c);
        Assert.assertEquals(c,Lamastica.getMonChapeau());
    }

    @Test
    public void testGetMesMedailles() throws Exception {
        Medaille m1 = new Medaille();
        Medaille m2 = new Medaille();
        Lamastica.ajoutMedaille(m1);
        Lamastica.ajoutMedaille(m2);
        Assert.assertEquals(Lamastica.getMesMedailles().get(1), m2);
    }

    @Test
    public void testSetMesMedailles() throws Exception {
        ArrayList<Medaille> am = new ArrayList<Medaille>();
        Medaille m1 = new Medaille();
        Medaille m2 = new Medaille();
        am.add(m1);
        am.add(m2);
        Lamastica.setMesMedailles(am);
        Assert.assertEquals(am,Lamastica.getMesMedailles());

    }
    @Test
    public void testGetTextSexe() throws Exception {
        Lamastica.setMonSexe(0);
        Assert.assertEquals("Fille",Lamastica.getTextSexe());
    }
}