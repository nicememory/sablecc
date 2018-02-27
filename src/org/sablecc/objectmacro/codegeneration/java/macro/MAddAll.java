/* This file was generated by SableCC's ObjectMacro. */

package org.sablecc.objectmacro.codegeneration.java.macro;

import java.util.*;

public class MAddAll {

    private final String pParamName;

    private final MAddAll mAddAll = this;

    private final List<Object> eIsBuilt = new LinkedList<>();

    private final List<Object> eApplyInternalsInitializer = new LinkedList<>();

    public MAddAll(
            String pParamName) {

        if (pParamName == null) {
            throw new NullPointerException();
        }
        this.pParamName = pParamName;
    }

    public MIsBuilt newIsBuilt(
            String pMacroName) {

        MIsBuilt lIsBuilt = new MIsBuilt(pMacroName);
        this.eIsBuilt.add(lIsBuilt);
        return lIsBuilt;
    }

    public MApplyInternalsInitializer newApplyInternalsInitializer(
            String pParamName) {

        MApplyInternalsInitializer lApplyInternalsInitializer
                = new MApplyInternalsInitializer(pParamName);
        this.eApplyInternalsInitializer.add(lApplyInternalsInitializer);
        return lApplyInternalsInitializer;
    }

    String pParamName() {

        return this.pParamName;
    }

    private String rParamName() {

        return this.mAddAll.pParamName();
    }

    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();
        sb.append("    public void addAll");
        sb.append(rParamName());
        sb.append("(List<Macro> macros){");
        sb.append(System.getProperty("line.separator"));
        sb.append("        if(macros == null){");
        sb.append(System.getProperty("line.separator"));
        sb.append("            throw ObjectMacroException.parameterNull(\"");
        sb.append(rParamName());
        sb.append("\");");
        sb.append(System.getProperty("line.separator"));
        sb.append("        }");
        sb.append(System.getProperty("line.separator"));
        sb.append("        ");
        for (Object oIsBuilt : this.eIsBuilt) {
            sb.append(oIsBuilt.toString());
        }
        sb.append(System.getProperty("line.separator"));
        sb.append("        int i = 0;");
        sb.append(System.getProperty("line.separator"));
        sb.append(System.getProperty("line.separator"));
        sb.append("        for(Macro macro : macros){");
        sb.append(System.getProperty("line.separator"));
        sb.append("            if(macro == null){");
        sb.append(System.getProperty("line.separator"));
        sb.append("                throw ObjectMacroException.macroNull(i, \"");
        sb.append(rParamName());
        sb.append("\");");
        sb.append(System.getProperty("line.separator"));
        sb.append("            }");
        sb.append(System.getProperty("line.separator"));
        sb.append(System.getProperty("line.separator"));
        sb.append("            ");
        for (Object oApplyInternalsInitializer : this.eApplyInternalsInitializer) {
            sb.append(oApplyInternalsInitializer.toString());
        }
        sb.append(System.getProperty("line.separator"));
        sb.append("            this.list_");
        sb.append(rParamName());
        sb.append(".add(macro);");
        sb.append(System.getProperty("line.separator"));
        sb.append("            i++;");
        sb.append(System.getProperty("line.separator"));
        sb.append("        }");
        sb.append(System.getProperty("line.separator"));
        sb.append("    }");
        sb.append(System.getProperty("line.separator"));
        return sb.toString();
    }

}
