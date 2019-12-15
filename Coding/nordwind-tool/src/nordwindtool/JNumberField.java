package nordwindtool;

import java.awt.Color;
import java.awt.event.KeyEvent;
import java.util.Locale;
import java.util.regex.Pattern;
import javax.swing.JTextField;

public class JNumberField extends JTextField
{
    public JNumberField() {
        this.enableEvents(8L);
    }

    public double getDouble() {
        return new Double(this.getText());
    }

    public float getFloat() {
        return new Double(this.getText()).floatValue();
    }

    public int getInt() {
        return new Double(this.getText()).intValue();
    }

    public long getLong() {
        return new Double(this.getText()).longValue();
    }

    public boolean isNumeric() {
        return Pattern.matches("[\\x00-\\x20]*[+-]?(NaN|Infinity|((((\\p{Digit}+)(\\.)?((\\p{Digit}+)?)([eE][+-]?(\\p{Digit}+))?)|(\\.((\\p{Digit}+))([eE][+-]?(\\p{Digit}+))?)|(((0[xX](\\p{XDigit}+)(\\.)?)|(0[xX](\\p{XDigit}+)?(\\.)(\\p{XDigit}+)))[pP][+-]?(\\p{Digit}+)))[fFdD]?))[\\x00-\\x20]*", this.getText());
    }

    public void setDouble(final double d) {
        this.setText(String.valueOf(d));
    }

    public void setDouble(final double d, final int i) {
        this.setText(String.format(Locale.ENGLISH, "%." + i + "f", d));
    }

    public void setFloat(final float f) {
        this.setText(String.valueOf(f));
    }

    public void setFloat(final float f, final int i) {
        this.setText(String.format(Locale.ENGLISH, "%." + i + "f", f));
    }

    public void setInt(final int i) {
        this.setText(String.valueOf(i));
    }

    public void setLong(final long l) {
        this.setText(String.valueOf(l));
    }

    public void clear() {
        this.setText("");
    }

    @Override
    protected void processKeyEvent(final KeyEvent e) {
        super.processKeyEvent(e);
        if (this.isNumeric() || this.getText().equals("-") || this.getText().equals("") || this.getText().equals(".")) {
            this.setBackground(Color.white);
        }
        else {
            this.setBackground(Color.red);
        }
    }
}
