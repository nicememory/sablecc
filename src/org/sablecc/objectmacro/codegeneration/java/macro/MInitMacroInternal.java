/* This file was generated by SableCC's ObjectMacro. */

package org.sablecc.objectmacro.codegeneration.java.macro;

public class MInitMacroInternal {

    private final String pName;

    private final MInitMacroInternal mInitMacroInternal = this;

    public MInitMacroInternal(
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

        return this.mInitMacroInternal.pName();
    }

    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();
        sb.append("    this.list_");
        sb.append(rName());
        sb.append(" = new LinkedHashMap<>();");
        sb.append(System.getProperty("line.separator"));
        return sb.toString();
    }

}
