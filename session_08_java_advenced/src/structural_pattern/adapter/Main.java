package structural_pattern.adapter;

public class Main {
    public static void main(String[] args) {
        AndroidPhone androidPhone = new AndroidPhone();
        LightningToTypeCAdapter adapter = new LightningToTypeCAdapter(androidPhone);
        adapter.rechange();
    }
}
