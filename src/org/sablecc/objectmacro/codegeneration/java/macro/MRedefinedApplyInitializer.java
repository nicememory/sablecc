/* This file was generated by SableCC's ObjectMacro. */

package org.sablecc.objectmacro.codegeneration.java.macro;

public class MRedefinedApplyInitializer {

    private final String pName;

    private final MRedefinedApplyInitializer mRedefinedApplyInitializer = this;

    public MRedefinedApplyInitializer(
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

        return this.mRedefinedApplyInitializer.pName();
    }

    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();
        sb.append("    @Override");
        sb.append(System.getProperty("line.separator"));
        sb.append("    void apply(");
        sb.append(System.getProperty("line.separator"));
        sb.append("            InternalsInitializer internalsInitializer){");
        sb.append(System.getProperty("line.separator"));
        sb.append(System.getProperty("line.separator"));
        sb.append("        internalsInitializer.set");
        sb.append(rName());
        sb.append("(this);");
        sb.append(System.getProperty("line.separator"));
        sb.append("    }");
        sb.append(System.getProperty("line.separator"));
        return sb.toString();
    }

}
