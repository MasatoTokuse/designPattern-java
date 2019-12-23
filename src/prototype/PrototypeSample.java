package prototype;

// ただのインスタンスのコピー
public class PrototypeSample {
    public static void main(String[] args) {
        UnderLinePen upen = new UnderLinePen('-');
        MessageBox mbox = new MessageBox('@');
        MessageBox sbox = new MessageBox('♪');

        Manager manager = new Manager();
        manager.register("strong message", upen);
        manager.register("warning box", mbox);
        manager.register("slash box", sbox);

        Product p1 = manager.create("strong message");
        p1.use("Git Hub");
        Product p2 = manager.create("warning box");
        p2.use("Qiita");
        Product p3 = manager.create("slash box");
        p3.use("Java");
    }
}
