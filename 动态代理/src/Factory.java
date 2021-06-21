public class Factory implements Sell{
    //目标类
    @Override
    public int sell(int amount) {
        return 100*amount;
    }

    @Override
    public String doSome(String a) {
        System.out.println("do sth");
        return a;
    }
}
