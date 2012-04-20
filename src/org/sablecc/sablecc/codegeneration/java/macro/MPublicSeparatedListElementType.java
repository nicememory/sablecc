/* This file was generated by SableCC's ObjectMacro. */

package org.sablecc.sablecc.codegeneration.java.macro;

public class MPublicSeparatedListElementType {

    private final String pLeftElementType;

    private final String pRightElementType;

    private final MPublicSeparatedListElementType mPublicSeparatedListElementType = this;

    MPublicSeparatedListElementType(
            String pLeftElementType,
            String pRightElementType) {

        if (pLeftElementType == null) {
            throw new NullPointerException();
        }
        this.pLeftElementType = pLeftElementType;
        if (pRightElementType == null) {
            throw new NullPointerException();
        }
        this.pRightElementType = pRightElementType;
    }

    String pLeftElementType() {

        return this.pLeftElementType;
    }

    String pRightElementType() {

        return this.pRightElementType;
    }

    private String rLeftElementType() {

        return this.mPublicSeparatedListElementType.pLeftElementType();
    }

    private String rRightElementType() {

        return this.mPublicSeparatedListElementType.pRightElementType();
    }

    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();
        sb.append("SeparatedNodeList<N");
        sb.append(rLeftElementType());
        sb.append(",N");
        sb.append(rRightElementType());
        sb.append(">");
        return sb.toString();
    }

}
