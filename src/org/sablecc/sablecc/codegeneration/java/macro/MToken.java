/* This file was generated by SableCC's ObjectMacro. */

package org.sablecc.sablecc.codegeneration.java.macro;

import java.util.*;

public class MToken {

    private final List<Object> eDefaultPackage_SpecifiedPackage = new LinkedList<Object>();

    private final List<Object> eNodeInternalTypeEnumEntry = new LinkedList<Object>();

    public MToken() {

    }

    public MNodeInternalTypeEnumEntry newNodeInternalTypeEnumEntry(
            String pName) {

        MNodeInternalTypeEnumEntry lNodeInternalTypeEnumEntry = new MNodeInternalTypeEnumEntry(
                pName);
        this.eNodeInternalTypeEnumEntry.add(lNodeInternalTypeEnumEntry);
        return lNodeInternalTypeEnumEntry;
    }

    public MDefaultPackage newDefaultPackage(
            String pLanguageName) {

        MDefaultPackage lDefaultPackage = new MDefaultPackage(pLanguageName);
        this.eDefaultPackage_SpecifiedPackage.add(lDefaultPackage);
        return lDefaultPackage;
    }

    public MSpecifiedPackage newSpecifiedPackage(
            String pLanguageName,
            String pPackage) {

        MSpecifiedPackage lSpecifiedPackage = new MSpecifiedPackage(
                pLanguageName, pPackage);
        this.eDefaultPackage_SpecifiedPackage.add(lSpecifiedPackage);
        return lSpecifiedPackage;
    }

    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();
        sb.append(new MHeader().toString());
        if (this.eDefaultPackage_SpecifiedPackage.size() > 0) {
            sb.append(System.getProperty("line.separator"));
        }
        for (Object oDefaultPackage_SpecifiedPackage : this.eDefaultPackage_SpecifiedPackage) {
            sb.append(oDefaultPackage_SpecifiedPackage.toString());
        }
        sb.append(System.getProperty("line.separator"));
        sb.append("public abstract class Token");
        sb.append(System.getProperty("line.separator"));
        sb.append("    extends Node {");
        sb.append(System.getProperty("line.separator"));
        sb.append(System.getProperty("line.separator"));
        sb.append("  private final String text;");
        sb.append(System.getProperty("line.separator"));
        sb.append("  private final int line;");
        sb.append(System.getProperty("line.separator"));
        sb.append("  private final int pos;");
        sb.append(System.getProperty("line.separator"));
        sb.append(System.getProperty("line.separator"));
        sb.append("  Token(String text, int line, int pos) {");
        sb.append(System.getProperty("line.separator"));
        sb.append("    this.text = text;");
        sb.append(System.getProperty("line.separator"));
        sb.append("    this.line = line;");
        sb.append(System.getProperty("line.separator"));
        sb.append("    this.pos = pos;");
        sb.append(System.getProperty("line.separator"));
        sb.append("  }");
        sb.append(System.getProperty("line.separator"));
        sb.append(System.getProperty("line.separator"));
        sb.append("  @Override");
        sb.append(System.getProperty("line.separator"));
        sb.append("  public String getText() {");
        sb.append(System.getProperty("line.separator"));
        sb.append("    return this.text;");
        sb.append(System.getProperty("line.separator"));
        sb.append("  }");
        sb.append(System.getProperty("line.separator"));
        sb.append(System.getProperty("line.separator"));
        sb.append("  @Override");
        sb.append(System.getProperty("line.separator"));
        sb.append("  public int getLine() {");
        sb.append(System.getProperty("line.separator"));
        sb.append("    return this.line;");
        sb.append(System.getProperty("line.separator"));
        sb.append("  }");
        sb.append(System.getProperty("line.separator"));
        sb.append(System.getProperty("line.separator"));
        sb.append("  @Override");
        sb.append(System.getProperty("line.separator"));
        sb.append("  public int getPos() {");
        sb.append(System.getProperty("line.separator"));
        sb.append("    return this.pos;");
        sb.append(System.getProperty("line.separator"));
        sb.append("  }");
        sb.append(System.getProperty("line.separator"));
        sb.append("  ");
        sb.append(System.getProperty("line.separator"));
        sb.append("    static enum InternalType {");
        sb.append(System.getProperty("line.separator"));
        for (Object oNodeInternalTypeEnumEntry : this.eNodeInternalTypeEnumEntry) {
            sb.append(oNodeInternalTypeEnumEntry.toString());
        }
        sb.append("    TEnd;");
        sb.append(System.getProperty("line.separator"));
        sb.append("  }");
        sb.append(System.getProperty("line.separator"));
        sb.append("  ");
        sb.append(System.getProperty("line.separator"));
        sb.append("  abstract InternalType getInternalType();");
        sb.append(System.getProperty("line.separator"));
        sb.append(System.getProperty("line.separator"));
        sb.append("  @Override");
        sb.append(System.getProperty("line.separator"));
        sb.append("  public void applyOnChildren(Walker walker) {");
        sb.append(System.getProperty("line.separator"));
        sb.append("  }");
        sb.append(System.getProperty("line.separator"));
        sb.append("  ");
        sb.append(System.getProperty("line.separator"));
        sb.append("   @Override");
        sb.append(System.getProperty("line.separator"));
        sb.append("  public void apply(Walker walker) {");
        sb.append(System.getProperty("line.separator"));
        sb.append(System.getProperty("line.separator"));
        sb.append("  }");
        sb.append(System.getProperty("line.separator"));
        sb.append("}");
        sb.append(System.getProperty("line.separator"));
        return sb.toString();
    }

}
