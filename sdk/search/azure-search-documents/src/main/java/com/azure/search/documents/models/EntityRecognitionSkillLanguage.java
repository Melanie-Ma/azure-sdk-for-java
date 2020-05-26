// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.search.documents.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/**
 * Defines values for EntityRecognitionSkillLanguage.
 */
public final class EntityRecognitionSkillLanguage extends ExpandableStringEnum<EntityRecognitionSkillLanguage> {
    /**
     * Static value ar for EntityRecognitionSkillLanguage.
     */
    public static final EntityRecognitionSkillLanguage AR = fromString("ar");

    /**
     * Static value cs for EntityRecognitionSkillLanguage.
     */
    public static final EntityRecognitionSkillLanguage CS = fromString("cs");

    /**
     * Static value zh-Hans for EntityRecognitionSkillLanguage.
     */
    public static final EntityRecognitionSkillLanguage ZH_HANS = fromString("zh-Hans");

    /**
     * Static value zh-Hant for EntityRecognitionSkillLanguage.
     */
    public static final EntityRecognitionSkillLanguage ZH_HANT = fromString("zh-Hant");

    /**
     * Static value da for EntityRecognitionSkillLanguage.
     */
    public static final EntityRecognitionSkillLanguage DA = fromString("da");

    /**
     * Static value nl for EntityRecognitionSkillLanguage.
     */
    public static final EntityRecognitionSkillLanguage NL = fromString("nl");

    /**
     * Static value en for EntityRecognitionSkillLanguage.
     */
    public static final EntityRecognitionSkillLanguage EN = fromString("en");

    /**
     * Static value fi for EntityRecognitionSkillLanguage.
     */
    public static final EntityRecognitionSkillLanguage FI = fromString("fi");

    /**
     * Static value fr for EntityRecognitionSkillLanguage.
     */
    public static final EntityRecognitionSkillLanguage FR = fromString("fr");

    /**
     * Static value de for EntityRecognitionSkillLanguage.
     */
    public static final EntityRecognitionSkillLanguage DE = fromString("de");

    /**
     * Static value el for EntityRecognitionSkillLanguage.
     */
    public static final EntityRecognitionSkillLanguage EL = fromString("el");

    /**
     * Static value hu for EntityRecognitionSkillLanguage.
     */
    public static final EntityRecognitionSkillLanguage HU = fromString("hu");

    /**
     * Static value it for EntityRecognitionSkillLanguage.
     */
    public static final EntityRecognitionSkillLanguage IT = fromString("it");

    /**
     * Static value ja for EntityRecognitionSkillLanguage.
     */
    public static final EntityRecognitionSkillLanguage JA = fromString("ja");

    /**
     * Static value ko for EntityRecognitionSkillLanguage.
     */
    public static final EntityRecognitionSkillLanguage KO = fromString("ko");

    /**
     * Static value no for EntityRecognitionSkillLanguage.
     */
    public static final EntityRecognitionSkillLanguage NO = fromString("no");

    /**
     * Static value pl for EntityRecognitionSkillLanguage.
     */
    public static final EntityRecognitionSkillLanguage PL = fromString("pl");

    /**
     * Static value pt-PT for EntityRecognitionSkillLanguage.
     */
    public static final EntityRecognitionSkillLanguage PT_PT = fromString("pt-PT");

    /**
     * Static value pt-BR for EntityRecognitionSkillLanguage.
     */
    public static final EntityRecognitionSkillLanguage PT_BR = fromString("pt-BR");

    /**
     * Static value ru for EntityRecognitionSkillLanguage.
     */
    public static final EntityRecognitionSkillLanguage RU = fromString("ru");

    /**
     * Static value es for EntityRecognitionSkillLanguage.
     */
    public static final EntityRecognitionSkillLanguage ES = fromString("es");

    /**
     * Static value sv for EntityRecognitionSkillLanguage.
     */
    public static final EntityRecognitionSkillLanguage SV = fromString("sv");

    /**
     * Static value tr for EntityRecognitionSkillLanguage.
     */
    public static final EntityRecognitionSkillLanguage TR = fromString("tr");

    /**
     * Creates or finds a EntityRecognitionSkillLanguage from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding EntityRecognitionSkillLanguage.
     */
    @JsonCreator
    public static EntityRecognitionSkillLanguage fromString(String name) {
        return fromString(name, EntityRecognitionSkillLanguage.class);
    }

    /**
     * @return known EntityRecognitionSkillLanguage values.
     */
    public static Collection<EntityRecognitionSkillLanguage> values() {
        return values(EntityRecognitionSkillLanguage.class);
    }
}
