package structural_pattern.adapter;

public class LightningToTypeCAdapter implements Lightning {
    AndroidPhone androidPhone;

    public LightningToTypeCAdapter(AndroidPhone androidPhone) {
        this.androidPhone = androidPhone;
    }

    @Override
    public void rechange() {
        androidPhone.rechangeTypeC();
    }
}
