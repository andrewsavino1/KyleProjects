package Change;

import org.junit.Assert;
import org.junit.Test;

import java.util.Random;

public class ChangeTest {

    @Test
    public void WalletHasTheRightAmountOfChange(){
        Random rand = new Random();
        for(int i = 0; i<20; i++){
            int cents = rand.nextInt(400) + 400;
            Wallet theirWallet = CalculateChange.getTheChange(cents);
            Assert.assertEquals(cents, theirWallet.getTotalCoinValue());
        }
    }
}
