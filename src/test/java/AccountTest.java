import org.example.Account;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class AccountTest {
    @Mock
    Account account;

    @Test
    public void test() {
        String name = "Вероника Балтина";
        Account account = new Account(name);
        Boolean expected = true;
        Boolean actual = account.checkNameToEmboss();
        assertEquals(expected, actual);
    }

}
