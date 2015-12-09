import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

/**
 * Created by christerhansen on 09.12.15.
 */
public class BilRepositoryTest {

    @Ignore
    @Test
    public void testSave(){
        BilRepository bilRepository = new BilRepository();
        Bil bil = new Bil("ya12345", "200hk", 4, 5);
        bilRepository.save(bil);

        Bil bil2 = bilRepository.getBilByRegNr(bil.getRegNr());

        Assert.assertEquals(bil.getRegNr(), bil2.getRegNr());
    }

    @Test
    public void testGet(){
        BilRepository bilRepository = new BilRepository();
        Bil bil = bilRepository.getBilByRegNr("ya12345");
        System.out.println(bil.toString());
        Assert.assertEquals("ya12345", bil.getRegNr());

    }
}
