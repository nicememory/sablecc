/* This file was generated by SableCC's ObjectMacro. */

package org.sablecc.objectmacro.codegeneration.java.macro;

import java.util.*;

public class MSuperDirective {

    private final List<Object> ePackageDeclaration = new LinkedList<>();

    public MSuperDirective() {

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
        sb.append("abstract class Directive {");
        sb.append(System.getProperty("line.separator"));
        sb.append(System.getProperty("line.separator"));
        sb.append("    final String value;");
        sb.append(System.getProperty("line.separator"));
        sb.append(System.getProperty("line.separator"));
        sb.append("    Directive(");
        sb.append(System.getProperty("line.separator"));
        sb.append("            String value) {");
        sb.append(System.getProperty("line.separator"));
        sb.append(System.getProperty("line.separator"));
        sb.append("        this.value = value;");
        sb.append(System.getProperty("line.separator"));
        sb.append("    }");
        sb.append(System.getProperty("line.separator"));
        sb.append(System.getProperty("line.separator"));
        sb.append(
                "    abstract String apply(Integer index, String macro, Integer list_size);");
        sb.append(System.getProperty("line.separator"));
        sb.append("}");
        sb.append(System.getProperty("line.separator"));
        return sb.toString();
    }

}
