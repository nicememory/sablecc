/* This file was generated by SableCC's ObjectMacro. */

package org.sablecc.sablecc.codegeneration.java.macro;

import java.util.*;

public class MNewList {

    private final String pListName;

    private final MNewList mNewList = this;

    private final List<Object> eNewTreeClass_NewList = new LinkedList<Object>();

    private final List<Object> eNormalDeclaration_AlternatedDeclaration_SeparatedDeclaration = new LinkedList<Object>();

    private final List<Object> eStringParameter_NormalParameter_SeparatedParameter_AlternatedParameter_NewParameter = new LinkedList<Object>();

    private final List<Object> eAddPopElement_AddPopElementLeft_AddPopElementRight_AddNewElement_AddPopList_AddPopSeparatedList_AddPopAlternatedList_AddPopReverseSeparatedList_AddPopReverseAlternatedList_AddNewList = new LinkedList<Object>();

    MNewList(
            String pListName) {

        if (pListName == null) {
            throw new NullPointerException();
        }
        this.pListName = pListName;
    }

    public MNewTreeClass newNewTreeClass(
            String pElementType,
            String pElementName) {

        MNewTreeClass lNewTreeClass = new MNewTreeClass(pElementType,
                pElementName);
        this.eNewTreeClass_NewList.add(lNewTreeClass);
        return lNewTreeClass;
    }

    public MNewList newNewList(
            String pListName) {

        MNewList lNewList = new MNewList(pListName);
        this.eNewTreeClass_NewList.add(lNewList);
        return lNewList;
    }

    public MNormalDeclaration newNormalDeclaration(
            String pNormalListType) {

        MNormalDeclaration lNormalDeclaration = new MNormalDeclaration(
                pNormalListType);
        this.eNormalDeclaration_AlternatedDeclaration_SeparatedDeclaration
                .add(lNormalDeclaration);
        return lNormalDeclaration;
    }

    public MAlternatedDeclaration newAlternatedDeclaration(
            String pLeftListType,
            String pRightListType) {

        MAlternatedDeclaration lAlternatedDeclaration = new MAlternatedDeclaration(
                pLeftListType, pRightListType);
        this.eNormalDeclaration_AlternatedDeclaration_SeparatedDeclaration
                .add(lAlternatedDeclaration);
        return lAlternatedDeclaration;
    }

    public MSeparatedDeclaration newSeparatedDeclaration(
            String pLeftListType,
            String pRightListType) {

        MSeparatedDeclaration lSeparatedDeclaration = new MSeparatedDeclaration(
                pLeftListType, pRightListType);
        this.eNormalDeclaration_AlternatedDeclaration_SeparatedDeclaration
                .add(lSeparatedDeclaration);
        return lSeparatedDeclaration;
    }

    public MStringParameter newStringParameter(
            String pString) {

        MStringParameter lStringParameter = new MStringParameter(pString);
        this.eStringParameter_NormalParameter_SeparatedParameter_AlternatedParameter_NewParameter
                .add(lStringParameter);
        return lStringParameter;
    }

    public MNormalParameter newNormalParameter(
            String pElementType,
            String pElementName,
            String pIndex) {

        MNormalParameter lNormalParameter = new MNormalParameter(pElementType,
                pElementName, pIndex);
        this.eStringParameter_NormalParameter_SeparatedParameter_AlternatedParameter_NewParameter
                .add(lNormalParameter);
        return lNormalParameter;
    }

    public MSeparatedParameter newSeparatedParameter(
            String pLeftElementType,
            String pRightElementType,
            String pElementName,
            String pIndex) {

        MSeparatedParameter lSeparatedParameter = new MSeparatedParameter(
                pLeftElementType, pRightElementType, pElementName, pIndex);
        this.eStringParameter_NormalParameter_SeparatedParameter_AlternatedParameter_NewParameter
                .add(lSeparatedParameter);
        return lSeparatedParameter;
    }

    public MAlternatedParameter newAlternatedParameter(
            String pLeftElementType,
            String pRightElementType,
            String pElementName,
            String pIndex) {

        MAlternatedParameter lAlternatedParameter = new MAlternatedParameter(
                pLeftElementType, pRightElementType, pElementName, pIndex);
        this.eStringParameter_NormalParameter_SeparatedParameter_AlternatedParameter_NewParameter
                .add(lAlternatedParameter);
        return lAlternatedParameter;
    }

    public MNewParameter newNewParameter(
            String pElementName) {

        MNewParameter lNewParameter = new MNewParameter(pElementName);
        this.eStringParameter_NormalParameter_SeparatedParameter_AlternatedParameter_NewParameter
                .add(lNewParameter);
        return lNewParameter;
    }

    public MAddPopElement newAddPopElement(
            String pListName,
            String pElementName,
            String pElementType,
            String pIndex) {

        MAddPopElement lAddPopElement = new MAddPopElement(pListName,
                pElementName, pElementType, pIndex);
        this.eAddPopElement_AddPopElementLeft_AddPopElementRight_AddNewElement_AddPopList_AddPopSeparatedList_AddPopAlternatedList_AddPopReverseSeparatedList_AddPopReverseAlternatedList_AddNewList
                .add(lAddPopElement);
        return lAddPopElement;
    }

    public MAddPopElementLeft newAddPopElementLeft(
            String pListName,
            String pElementName,
            String pElementType,
            String pIndex) {

        MAddPopElementLeft lAddPopElementLeft = new MAddPopElementLeft(
                pListName, pElementName, pElementType, pIndex);
        this.eAddPopElement_AddPopElementLeft_AddPopElementRight_AddNewElement_AddPopList_AddPopSeparatedList_AddPopAlternatedList_AddPopReverseSeparatedList_AddPopReverseAlternatedList_AddNewList
                .add(lAddPopElementLeft);
        return lAddPopElementLeft;
    }

    public MAddPopElementRight newAddPopElementRight(
            String pListName,
            String pElementName,
            String pElementType,
            String pIndex) {

        MAddPopElementRight lAddPopElementRight = new MAddPopElementRight(
                pListName, pElementName, pElementType, pIndex);
        this.eAddPopElement_AddPopElementLeft_AddPopElementRight_AddNewElement_AddPopList_AddPopSeparatedList_AddPopAlternatedList_AddPopReverseSeparatedList_AddPopReverseAlternatedList_AddNewList
                .add(lAddPopElementRight);
        return lAddPopElementRight;
    }

    public MAddNewElement newAddNewElement(
            String pListName,
            String pElementName) {

        MAddNewElement lAddNewElement = new MAddNewElement(pListName,
                pElementName);
        this.eAddPopElement_AddPopElementLeft_AddPopElementRight_AddNewElement_AddPopList_AddPopSeparatedList_AddPopAlternatedList_AddPopReverseSeparatedList_AddPopReverseAlternatedList_AddNewList
                .add(lAddNewElement);
        return lAddNewElement;
    }

    public MAddPopList newAddPopList(
            String pListName,
            String pElementName,
            String pElementType,
            String pIndex) {

        MAddPopList lAddPopList = new MAddPopList(pListName, pElementName,
                pElementType, pIndex);
        this.eAddPopElement_AddPopElementLeft_AddPopElementRight_AddNewElement_AddPopList_AddPopSeparatedList_AddPopAlternatedList_AddPopReverseSeparatedList_AddPopReverseAlternatedList_AddNewList
                .add(lAddPopList);
        return lAddPopList;
    }

    public MAddPopSeparatedList newAddPopSeparatedList(
            String pListName,
            String pElementName,
            String pLeftType,
            String pRightType,
            String pIndex) {

        MAddPopSeparatedList lAddPopSeparatedList = new MAddPopSeparatedList(
                pListName, pElementName, pLeftType, pRightType, pIndex);
        this.eAddPopElement_AddPopElementLeft_AddPopElementRight_AddNewElement_AddPopList_AddPopSeparatedList_AddPopAlternatedList_AddPopReverseSeparatedList_AddPopReverseAlternatedList_AddNewList
                .add(lAddPopSeparatedList);
        return lAddPopSeparatedList;
    }

    public MAddPopAlternatedList newAddPopAlternatedList(
            String pListName,
            String pElementName,
            String pLeftType,
            String pRightType,
            String pIndex) {

        MAddPopAlternatedList lAddPopAlternatedList = new MAddPopAlternatedList(
                pListName, pElementName, pLeftType, pRightType, pIndex);
        this.eAddPopElement_AddPopElementLeft_AddPopElementRight_AddNewElement_AddPopList_AddPopSeparatedList_AddPopAlternatedList_AddPopReverseSeparatedList_AddPopReverseAlternatedList_AddNewList
                .add(lAddPopAlternatedList);
        return lAddPopAlternatedList;
    }

    public MAddPopReverseSeparatedList newAddPopReverseSeparatedList(
            String pListName,
            String pElementName,
            String pLeftType,
            String pRightType,
            String pIndex) {

        MAddPopReverseSeparatedList lAddPopReverseSeparatedList = new MAddPopReverseSeparatedList(
                pListName, pElementName, pLeftType, pRightType, pIndex);
        this.eAddPopElement_AddPopElementLeft_AddPopElementRight_AddNewElement_AddPopList_AddPopSeparatedList_AddPopAlternatedList_AddPopReverseSeparatedList_AddPopReverseAlternatedList_AddNewList
                .add(lAddPopReverseSeparatedList);
        return lAddPopReverseSeparatedList;
    }

    public MAddPopReverseAlternatedList newAddPopReverseAlternatedList(
            String pListName,
            String pElementName,
            String pLeftType,
            String pRightType,
            String pIndex) {

        MAddPopReverseAlternatedList lAddPopReverseAlternatedList = new MAddPopReverseAlternatedList(
                pListName, pElementName, pLeftType, pRightType, pIndex);
        this.eAddPopElement_AddPopElementLeft_AddPopElementRight_AddNewElement_AddPopList_AddPopSeparatedList_AddPopAlternatedList_AddPopReverseSeparatedList_AddPopReverseAlternatedList_AddNewList
                .add(lAddPopReverseAlternatedList);
        return lAddPopReverseAlternatedList;
    }

    public MAddNewList newAddNewList(
            String pListName,
            String pElementName) {

        MAddNewList lAddNewList = new MAddNewList(pListName, pElementName);
        this.eAddPopElement_AddPopElementLeft_AddPopElementRight_AddNewElement_AddPopList_AddPopSeparatedList_AddPopAlternatedList_AddPopReverseSeparatedList_AddPopReverseAlternatedList_AddNewList
                .add(lAddNewList);
        return lAddNewList;
    }

    String pListName() {

        return this.pListName;
    }

    private String rListName() {

        return this.mNewList.pListName();
    }

    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();
        for (Object oNewTreeClass_NewList : this.eNewTreeClass_NewList) {
            sb.append(oNewTreeClass_NewList.toString());
        }
        sb.append("        ");
        for (Object oNormalDeclaration_AlternatedDeclaration_SeparatedDeclaration : this.eNormalDeclaration_AlternatedDeclaration_SeparatedDeclaration) {
            sb.append(oNormalDeclaration_AlternatedDeclaration_SeparatedDeclaration
                    .toString());
        }
        sb.append(" n");
        sb.append(rListName());
        sb.append(" = new ");
        for (Object oNormalDeclaration_AlternatedDeclaration_SeparatedDeclaration : this.eNormalDeclaration_AlternatedDeclaration_SeparatedDeclaration) {
            sb.append(oNormalDeclaration_AlternatedDeclaration_SeparatedDeclaration
                    .toString());
        }
        sb.append(" (");
        {
            boolean first = true;
            for (Object oStringParameter_NormalParameter_SeparatedParameter_AlternatedParameter_NewParameter : this.eStringParameter_NormalParameter_SeparatedParameter_AlternatedParameter_NewParameter) {
                if (first) {
                    first = false;
                }
                else {
                    sb.append(", ");
                }
                sb.append(oStringParameter_NormalParameter_SeparatedParameter_AlternatedParameter_NewParameter
                        .toString());
            }
        }
        sb.append(");");
        sb.append(System.getProperty("line.separator"));
        for (Object oAddPopElement_AddPopElementLeft_AddPopElementRight_AddNewElement_AddPopList_AddPopSeparatedList_AddPopAlternatedList_AddPopReverseSeparatedList_AddPopReverseAlternatedList_AddNewList : this.eAddPopElement_AddPopElementLeft_AddPopElementRight_AddNewElement_AddPopList_AddPopSeparatedList_AddPopAlternatedList_AddPopReverseSeparatedList_AddPopReverseAlternatedList_AddNewList) {
            sb.append(oAddPopElement_AddPopElementLeft_AddPopElementRight_AddNewElement_AddPopList_AddPopSeparatedList_AddPopAlternatedList_AddPopReverseSeparatedList_AddPopReverseAlternatedList_AddNewList
                    .toString());
        }
        return sb.toString();
    }

}
