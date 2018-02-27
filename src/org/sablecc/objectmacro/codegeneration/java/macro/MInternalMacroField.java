/* This file was generated by SableCC's ObjectMacro. */

package org.sablecc.objectmacro.codegeneration.java.macro;

public class MInternalMacroField {

    private final String pName;

    private final MInternalMacroField mInternalMacroField = this;

    public MInternalMacroField(
            String pName) {

        if (pName == null) {
            throw new NullPointerException();
        }
        this.pName = pName;
    }

    String pName() {

        return this.pName;
    }

    private String rName() {

        return this.mInternalMacroField.pName();
    }

    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();
        sb.append("    private Map<Context, InternalValue> list_");
        sb.append(rName());
        sb.append(" = new LinkedHashMap<>();");
        sb.append(System.getProperty("line.separator"));
        return sb.toString();
    }

}