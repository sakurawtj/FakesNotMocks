public class FakeExchange implements Exchange {
    public float rate(String origin, String target) {
        return 0.8f;
    }
}
