

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * The test class Prueba.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class Prueba
{
    private MailServer gmailServer;
    private MailClient pepe;
    private MailClient maria;

    /**
     * Default constructor for test class Prueba
     */
    public Prueba()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @BeforeEach
    public void setUp()
    {
        gmailServer = new MailServer();
        pepe = new MailClient(gmailServer, "pepe@gmail.com");
        maria = new MailClient(gmailServer, "maria@gmail.com");
        pepe.sendMailItem("maria@gmail.com", "Hola María, soy Pepe!");
        maria.printNextMailItem();
        maria.printNextMailItem();
        pepe.sendMailItem("maria@gmail.com", "Hola Maria, soy Pepe!");
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @AfterEach
    public void tearDown()
    {
    }
}
