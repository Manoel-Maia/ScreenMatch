package classes;

import java.io.IOException;

public class GeckoAPITests extends API{
    
    public GeckoAPITests() {
        super(
            "CG-ubpyJ5rfzqr1pnjLPKWUQukQ"
            ,"https://api.coingecko.com/api/v3/simple/price?vs_currencies=usd&ids="
            ,"&x_cg_demo_api_key=");
    }

    public String getCoinInfo(String coinName) throws IOException, InterruptedException{
        return getJson(coinName);
    } 
    /*
    url structure:
    https://api.coingecko.com/api/v3/simple/price?vs_currencies=usd&
    ids=bitcoin&x_cg_demo_api_key=CG-ubpyJ5rfzqr1pnjLPKWUQukQ */
}
