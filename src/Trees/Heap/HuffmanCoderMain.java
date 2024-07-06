package Trees.Heap;

public class HuffmanCoderMain {
    public static void main(String[] args) throws Exception{
        String str = "Welcome To The Hell";
        HuffmanCoder hf = new HuffmanCoder(str);
        String cs = hf.encode(str);
        System.out.println(cs);
        String ds = hf.decode(cs);
        System.out.println(ds);

    }
}
