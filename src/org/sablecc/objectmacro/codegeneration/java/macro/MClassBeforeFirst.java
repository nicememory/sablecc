/* This file was generated by SableCC's ObjectMacro. */

package org.sablecc.objectmacro.codegeneration.java.macro;

import java.util.*;

public class MClassBeforeFirst {

    private final List<Object> ePackageDeclaration = new LinkedList<>();

    public MClassBeforeFirst() {

    }

    public MPackageDeclaration newPackageDeclaration(
            String pPackageName) {

        MPackageDeclaration lPackageDeclaration
                = new MPackageDeclaration(pPackageName);
        this.ePackageDeclaration.add(lPackageDeclaration);
        return lPackageDeclaration;
    }

    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();
        sb.append(new MHeader().toString());
        if (this.ePackageDeclaration.size() > 0) {
            sb.append(System.getProperty("line.separator"));
        }
        for (Object oPackageDeclaration : this.ePackageDeclaration) {
            sb.append(oPackageDeclaration.toString());
        }
        sb.append(System.getProperty("line.separator"));
        sb.append("class DBeforeFirst");
        sb.append(System.getProperty("line.separator"));
        sb.append("        extends Directive {");
        sb.append(System.getProperty("line.separator"));
        sb.append(System.getProperty("line.separator"));
        sb.append("    DBeforeFirst(String value) {");
        sb.append(System.getProperty("line.separator"));
        sb.append(System.getProperty("line.separator"));
        sb.append("        super(value);");
        sb.append(System.getProperty("line.separator"));
        sb.append("    }");
        sb.append(System.getProperty("line.separator"));
        sb.append(System.getProperty("line.separator"));
        sb.append("    @Override");
        sb.append(System.getProperty("line.separator"));
        sb.append("    String apply(");
        sb.append(System.getProperty("line.separator"));
        sb.append("            Integer index,");
        sb.append(System.getProperty("line.separator"));
        sb.append("            String macro,");
        sb.append(System.getProperty("line.separator"));
        sb.append("            Integer list_size) {");
        sb.append(System.getProperty("line.separator"));
        sb.append(System.getProperty("line.separator"));
        sb.append("        if(index == 0){");
        sb.append(System.getProperty("line.separator"));
        sb.append("            return this.value.concat(macro);");
        sb.append(System.getProperty("line.separator"));
        sb.append("        }");
        sb.append(System.getProperty("line.separator"));
        sb.append("        return macro;");
        sb.append(System.getProperty("line.separator"));
        sb.append("    }");
        sb.append(System.getProperty("line.separator"));
        sb.append("}");
        sb.append(System.getProperty("line.separator"));
        sb.append(System.getProperty("line.separator"));
        return sb.toString();
    }

}
