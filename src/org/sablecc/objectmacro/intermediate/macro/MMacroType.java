/* This file was generated by SableCC's ObjectMacro. */

package org.sablecc.objectmacro.intermediate.macro;

import java.util.*;

public class MMacroType {

    private final List<Object> eMacroRef = new LinkedList<>();

    private final List<Object> eDirective = new LinkedList<>();

    public MMacroType() {

    }

    public MMacroRef newMacroRef() {

        MMacroRef lMacroRef = new MMacroRef();
        this.eMacroRef.add(lMacroRef);
        return lMacroRef;
    }

    public MDirective newDirective() {

        MDirective lDirective = new MDirective();
        this.eDirective.add(lDirective);
        return lDirective;
    }

    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();
        sb.append(" Type {");
        sb.append(System.getProperty("line.separator"));
        for (Object oMacroRef : this.eMacroRef) {
            sb.append(oMacroRef.toString());
        }
        {
            boolean first = true;
            for (Object oDirective : this.eDirective) {
                if (first) {
                    first = false;
                }
                else {
                    sb.append(", ");
                }
                sb.append(oDirective.toString());
            }
        }
        sb.append(" }");
        sb.append(System.getProperty("line.separator"));
        return sb.toString();
    }

}
