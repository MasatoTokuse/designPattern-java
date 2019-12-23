package prototype;

public class MessageBox implements Product {
    // 枠に使用する文字
    private char decoChar;
    public MessageBox(char decoChar) {
        this.decoChar = decoChar;
    }

    // 受け取った文字列と枠を表示する
    @Override
    public void use(String str) {
        int length = str.getBytes().length;
        for (int i = 0; i < length + 4; i++) {
            System.out.print(decoChar);
        }
        System.out.println("");
        System.out.println(decoChar + " " + str + " " + decoChar);

        for (int i = 0; i < length + 4; i++) {
            System.out.print(decoChar);
        }
        System.out.println("");
    }

    //Productインターフェイスを実装してなければCloneNotSupportedExceptionが投げられる
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
