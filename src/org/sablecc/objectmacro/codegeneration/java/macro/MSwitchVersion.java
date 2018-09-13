/* This file was generated by SableCC's ObjectMacro. */

package org.sablecc.objectmacro.codegeneration.java.macro;

import java.util.*;

public class MSwitchVersion
        extends Macro {

    private DSeparator VersionCasesSeparator;

    private DBeforeFirst VersionCasesBeforeFirst;

    private DAfterLast VersionCasesAfterLast;

    private DNone VersionCasesNone;

    final List<Macro> list_VersionCases;

    final Context VersionCasesContext = new Context();

    final MacroValue VersionCasesValue;

    private Map<Context, StringValue> list_ClassName = new LinkedHashMap<>();

    private Map<Context, MacroValue> list_Args = new LinkedHashMap<>();

    MSwitchVersion(
            Macros macros) {

        setMacros(macros);
        this.list_VersionCases = new LinkedList<>();
        this.list_ClassName = new LinkedHashMap<>();
        this.list_Args = new LinkedHashMap<>();

        this.VersionCasesValue = new MacroValue(this.list_VersionCases,
                this.VersionCasesContext);
    }

    MSwitchVersion(
            List<Macro> pVersionCases,
            Macros macros) {

        setMacros(macros);
        this.list_VersionCases = new LinkedList<>();
        this.list_ClassName = new LinkedHashMap<>();
        this.list_Args = new LinkedHashMap<>();

        this.VersionCasesValue = new MacroValue(this.list_VersionCases,
                this.VersionCasesContext);
        if (pVersionCases != null) {
            addAllVersionCases(pVersionCases);
        }
    }

    public void addAllVersionCases(
            List<Macro> macros) {

        if (macros == null) {
            throw ObjectMacroException.parameterNull("VersionCases");
        }
        if (this.cacheBuilder != null) {
            throw ObjectMacroException
                    .cannotModify(this.getClass().getSimpleName());
        }

        int i = 0;

        for (Macro macro : macros) {
            if (macro == null) {
                throw ObjectMacroException.macroNull(i, "VersionCases");
            }

            if (getMacros() != macro.getMacros()) {
                throw ObjectMacroException.diffMacros();
            }

            verifyTypeVersionCases(macro);
            this.list_VersionCases.add(macro);
            this.children.add(macro);
            Macro.cycleDetector.detectCycle(this, macro);

            i++;
        }
    }

    void verifyTypeVersionCases(
            Macro macro) {

        macro.apply(new InternalsInitializer("VersionCases") {

            @Override
            void setMacroCaseInit(
                    MMacroCaseInit mMacroCaseInit) {

            }
        });
    }

    public void addVersionCases(
            MMacroCaseInit macro) {

        if (macro == null) {
            throw ObjectMacroException.parameterNull("VersionCases");
        }
        if (this.cacheBuilder != null) {
            throw ObjectMacroException
                    .cannotModify(this.getClass().getSimpleName());
        }

        if (getMacros() != macro.getMacros()) {
            throw ObjectMacroException.diffMacros();
        }

        this.list_VersionCases.add(macro);
        this.children.add(macro);
        Macro.cycleDetector.detectCycle(this, macro);
    }

    void setClassName(
            Context context,
            StringValue value) {

        if (value == null) {
            throw new RuntimeException("value cannot be null here");
        }

        this.list_ClassName.put(context, value);
    }

    void setArgs(
            Context context,
            MacroValue macro_value) {

        if (macro_value == null) {
            throw new RuntimeException("macros cannot be null");
        }

        this.list_Args.put(context, macro_value);
    }

    private String buildVersionCases() {

        StringBuilder sb = new StringBuilder();
        Context local_context = this.VersionCasesContext;
        List<Macro> macros = this.list_VersionCases;

        int i = 0;
        int nb_macros = macros.size();
        String expansion = null;

        if (this.VersionCasesSeparator == null) {
            initVersionCasesDirectives();
        }

        for (Macro macro : macros) {
            expansion = macro.build(local_context);

            expansion
                    = this.VersionCasesSeparator.apply(i, expansion, nb_macros);
            sb.append(expansion);
            i++;
        }

        return sb.toString();
    }

    private String buildClassName(
            Context context) {

        StringValue stringValue = this.list_ClassName.get(context);
        return stringValue.build();
    }

    private String buildArgs(
            Context context) {

        MacroValue macros = this.list_Args.get(context);
        return macros.build();
    }

    MacroValue getVersionCases() {

        return this.VersionCasesValue;
    }

    private StringValue getClassName(
            Context context) {

        return this.list_ClassName.get(context);
    }

    private MacroValue getArgs(
            Context context) {

        return this.list_Args.get(context);
    }

    private void initVersionCasesInternals(
            Context context) {

        for (Macro macro : this.list_VersionCases) {
            macro.apply(new InternalsInitializer("VersionCases") {

                @Override
                void setMacroCaseInit(
                        MMacroCaseInit mMacroCaseInit) {

                    mMacroCaseInit.setClassName(
                            MSwitchVersion.this.VersionCasesContext,
                            getClassName(context));
                    mMacroCaseInit.setArgs(
                            MSwitchVersion.this.VersionCasesContext,
                            getArgs(context));
                }
            });
        }
    }

    private void initVersionCasesDirectives() {

        StringBuilder sb3 = new StringBuilder();
        sb3.append(LINE_SEPARATOR);
        this.VersionCasesSeparator = new DSeparator(sb3.toString());
        this.VersionCasesValue.setSeparator(this.VersionCasesSeparator);
    }

    @Override
    void apply(
            InternalsInitializer internalsInitializer) {

        internalsInitializer.setSwitchVersion(this);
    }

    @Override
    String build(
            Context context) {

        CacheBuilder cache_builder = this.cacheBuilders.get(context);

        if (cache_builder == null) {
            cache_builder = new CacheBuilder();
        }
        else if (cache_builder.getExpansion() == null) {
            throw new InternalException("Cycle detection detected lately");
        }
        else {
            return cache_builder.getExpansion();
        }

        this.cacheBuilders.put(context, cache_builder);
        List<String> indentations = new LinkedList<>();

        initVersionCasesInternals(context);

        initVersionCasesDirectives();

        StringBuilder sb0 = new StringBuilder();

        sb0.append("switch(this.version) ");
        sb0.append("{");
        sb0.append(LINE_SEPARATOR);
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        sb2.append("    ");
        indentations.add(sb2.toString());
        sb1.append(buildVersionCases());
        sb0.append(applyIndent(sb1.toString(),
                indentations.remove(indentations.size() - 1)));
        sb0.append(LINE_SEPARATOR);
        sb0.append("    default :");
        sb0.append(LINE_SEPARATOR);
        sb0.append("        throw new RuntimeException(\"unknown version\");");
        sb0.append(LINE_SEPARATOR);
        sb0.append("}");
        cache_builder.setExpansion(sb0.toString());
        return sb0.toString();
    }

    private void setMacros(
            Macros macros) {

        if (macros == null) {
            throw new InternalException("macros cannot be null");
        }

        this.macros = macros;
    }
}