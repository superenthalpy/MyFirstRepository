public class Taobao implements sell{
    public static Factor factor = new Factor();
    @Override
    public float sell(int amount) {
        float ori = factor.sell(amount);
        return ori+amount*100;
    }
}
