package prototype;

// cloneはObjectを継承しているため、実装不要。publicにしたかったらオーバーライドする。
public class UnderLinePen implements Product {
    // 下線に使用する文字
    private char ulChar;
    public UnderLinePen(char ulChar) {
        this.ulChar = ulChar;
    }

    // 受け取った文字列と下線を表示する
    @Override
    public void use(String str) {
        int length = str.getBytes().length;
        System.out.println(str);
        System.out.print("");
        for (int i = 0; i < length; i++) {
            System.out.print(ulChar);
        }
        System.out.println("");
    }

    @Override
    public Product createClone() {
        Product p = null;
        try {
            p = (Product)clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return p;
    }

}


