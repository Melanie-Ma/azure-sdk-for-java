// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.search.documents.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/**
 * Defines values for OcrSkillLanguage.
 */
public final class OcrSkillLanguage extends ExpandableStringEnum<OcrSkillLanguage> {
    /**
     * Static value zh-Hans for OcrSkillLanguage.
     */
    public static final OcrSkillLanguage ZH_HANS = fromString("zh-Hans");

    /**
     * Static value zh-Hant for OcrSkillLanguage.
     */
    public static final OcrSkillLanguage ZH_HANT = fromString("zh-Hant");

    /**
     * Static value cs for OcrSkillLanguage.
     */
    public static final OcrSkillLanguage CS = fromString("cs");

    /**
     * Static value da for OcrSkillLanguage.
     */
    public static final OcrSkillLanguage DA = fromString("da");

    /**
     * Static value nl for OcrSkillLanguage.
     */
    public static final OcrSkillLanguage NL = fromString("nl");

    /**
     * Static value en for OcrSkillLanguage.
     */
    public static final OcrSkillLanguage EN = fromString("en");

    /**
     * Static value fi for OcrSkillLanguage.
     */
    public static final OcrSkillLanguage FI = fromString("fi");

    /**
     * Static value fr for OcrSkillLanguage.
     */
    public static final OcrSkillLanguage FR = fromString("fr");

    /**
     * Static value de for OcrSkillLanguage.
     */
    public static final OcrSkillLanguage DE = fromString("de");

    /**
     * Static value el for OcrSkillLanguage.
     */
    public static final OcrSkillLanguage EL = fromString("el");

    /**
     * Static value hu for OcrSkillLanguage.
     */
    public static final OcrSkillLanguage HU = fromString("hu");

    /**
     * Static value it for OcrSkillLanguage.
     */
    public static final OcrSkillLanguage IT = fromString("it");

    /**
     * Static value ja for OcrSkillLanguage.
     */
    public static final OcrSkillLanguage JA = fromString("ja");

    /**
     * Static value ko for OcrSkillLanguage.
     */
    public static final OcrSkillLanguage KO = fromString("ko");

    /**
     * Static value nb for OcrSkillLanguage.
     */
    public static final OcrSkillLanguage NB = fromString("nb");

    /**
     * Static value pl for OcrSkillLanguage.
     */
    public static final OcrSkillLanguage PL = fromString("pl");

    /**
     * Static value pt for OcrSkillLanguage.
     */
    public static final OcrSkillLanguage PT = fromString("pt");

    /**
     * Static value ru for OcrSkillLanguage.
     */
    public static final OcrSkillLanguage RU = fromString("ru");

    /**
     * Static value es for OcrSkillLanguage.
     */
    public static final OcrSkillLanguage ES = fromString("es");

    /**
     * Static value sv for OcrSkillLanguage.
     */
    public static final OcrSkillLanguage SV = fromString("sv");

    /**
     * Static value tr for OcrSkillLanguage.
     */
    public static final OcrSkillLanguage TR = fromString("tr");

    /**
     * Static value ar for OcrSkillLanguage.
     */
    public static final OcrSkillLanguage AR = fromString("ar");

    /**
     * Static value ro for OcrSkillLanguage.
     */
    public static final OcrSkillLanguage RO = fromString("ro");

    /**
     * Static value sr-Cyrl for OcrSkillLanguage.
     */
    public static final OcrSkillLanguage SR_CYRL = fromString("sr-Cyrl");

    /**
     * Static value sr-Latn for OcrSkillLanguage.
     */
    public static final OcrSkillLanguage SR_LATN = fromString("sr-Latn");

    /**
     * Static value sk for OcrSkillLanguage.
     */
    public static final OcrSkillLanguage SK = fromString("sk");

    /**
     * Creates or finds a OcrSkillLanguage from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding OcrSkillLanguage.
     */
    @JsonCreator
    public static OcrSkillLanguage fromString(String name) {
        return fromString(name, OcrSkillLanguage.class);
    }

    /**
     * @return known OcrSkillLanguage values.
     */
    public static Collection<OcrSkillLanguage> values() {
        return values(OcrSkillLanguage.class);
    }
}
