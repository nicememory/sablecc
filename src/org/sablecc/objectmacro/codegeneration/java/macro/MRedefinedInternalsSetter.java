/* This file was generated by SableCC's ObjectMacro. */

package org.sablecc.objectmacro.codegeneration.java.macro;

import java.util.*;

public class MRedefinedInternalsSetter {

    private final String pName;

    private final MRedefinedInternalsSetter mRedefinedInternalsSetter = this;

    private final List<Object> eInitStringBuilder_StringPart_ParamInsertPart_EolPart_InsertMacroPart
            = new LinkedList<>();

    private final List<Object> eSetInternal = new LinkedList<>();

    public MRedefinedInternalsSetter(
            String pName) {

        if (pName == null) {
            throw new NullPointerException();
        }
        this.pName = pName;
    }

    public MInitStringBuilder newInitStringBuilder(
            String pIndexBuilder) {

        MInitStringBuilder lInitStringBuilder
                = new MInitStringBuilder(pIndexBuilder);
        this.eInitStringBuilder_StringPart_ParamInsertPart_EolPart_InsertMacroPart
                .add(lInitStringBuilder);
        return lInitStringBuilder;
    }

    public MStringPart newStringPart(
            String pString,
            String pIndexBuilder) {

        MStringPart lStringPart = new MStringPart(pString, pIndexBuilder);
        this.eInitStringBuilder_StringPart_ParamInsertPart_EolPart_InsertMacroPart
                .add(lStringPart);
        return lStringPart;
    }

    public MParamInsertPart newParamInsertPart(
            String pParamName,
            String pIndexBuilder) {

        MParamInsertPart lParamInsertPart
                = new MParamInsertPart(pParamName, pIndexBuilder);
        this.eInitStringBuilder_StringPart_ParamInsertPart_EolPart_InsertMacroPart
                .add(lParamInsertPart);
        return lParamInsertPart;
    }

    public MEolPart newEolPart(
            String pIndexBuilder) {

        MEolPart lEolPart = new MEolPart(pIndexBuilder);
        this.eInitStringBuilder_StringPart_ParamInsertPart_EolPart_InsertMacroPart
                .add(lEolPart);
        return lEolPart;
    }

    public MInsertMacroPart newInsertMacroPart(
            String pName,
            String pIndexBuilder,
            String pIndexInsert) {

        MInsertMacroPart lInsertMacroPart
                = new MInsertMacroPart(pName, pIndexBuilder, pIndexInsert);
        this.eInitStringBuilder_StringPart_ParamInsertPart_EolPart_InsertMacroPart
                .add(lInsertMacroPart);
        return lInsertMacroPart;
    }

    public MSetInternal newSetInternal(
            String pMacroName,
            String pParamName,
            String pContext) {

        MSetInternal lSetInternal
                = new MSetInternal(pMacroName, pParamName, pContext);
        this.eSetInternal.add(lSetInternal);
        return lSetInternal;
    }

    String pName() {

        return this.pName;
    }

    private String rName() {

        return this.mRedefinedInternalsSetter.pName();
    }

    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();
        sb.append("@Override");
        sb.append(System.getProperty("line.separator"));
        sb.append("void set");
        sb.append(rName());
        sb.append("(M");
        sb.append(rName());
        sb.append(" m");
        sb.append(rName());
        sb.append("){");
        sb.append(System.getProperty("line.separator"));
        sb.append(System.getProperty("line.separator"));
        sb.append("    ");
        {
            boolean first = true;
            for (Object oInitStringBuilder_StringPart_ParamInsertPart_EolPart_InsertMacroPart : this.eInitStringBuilder_StringPart_ParamInsertPart_EolPart_InsertMacroPart) {
                if (first) {
                    first = false;
                }
                else {
                    sb.append(System.getProperty("line.separator"));
                }
                sb.append(
                        oInitStringBuilder_StringPart_ParamInsertPart_EolPart_InsertMacroPart
                                .toString());
            }
        }
        sb.append("    ");
        for (Object oSetInternal : this.eSetInternal) {
            sb.append(oSetInternal.toString());
        }
        sb.append("}");
        sb.append(System.getProperty("line.separator"));
        return sb.toString();
    }

}
