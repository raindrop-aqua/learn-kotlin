package org.kotlinlang.java_sample.s4_delegated_properties.p17;

public class Example {

    private String p;

    public String getP() throws NoSuchFieldException {
        return Delegate.getValue(this, this.getClass().getDeclaredField("p"));
    }

    public void setP(String value) throws NoSuchFieldException, IllegalAccessException {
        Delegate.setValue(this, this.getClass().getDeclaredField("p"), value);
    }

    @Override
    public String toString() {
        return "Example Class";
    }
}
