package statisticker.alert;

public class EmailAlert implements IAlerter{
    public boolean emailSent=false;

    @Override
    public void alert() {
        emailSent = true;
    }
}
