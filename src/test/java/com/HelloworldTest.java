/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class HelloworldTest {

    // Définir une variable pour stocker la sortie du système
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @Before
    public void setUpStreams() {
        // Rediriger la sortie standard vers notre variable outContent
        System.setOut(new PrintStream(outContent));
    }

    @After
    public void restoreStreams() {
        // Rétablir la sortie standard
        System.setOut(System.out);
    }
    @Test
    public void testNothing() {
    }

    @Test
    public void testWillAlwaysFail() {
        fail("An error message");
    }

    @Test
    public void testMain() {
        // Appeler la méthode main de la classe HelloWorld
        Helloworld.main(new String[0]);
        // Vérifier que la sortie correspond à "Hello, World!"
        assertEquals("Hello, World!\n", outContent.toString());
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
