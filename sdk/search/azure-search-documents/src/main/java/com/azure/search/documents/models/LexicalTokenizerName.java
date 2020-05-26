// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.search.documents.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/**
 * Defines values for LexicalTokenizerName.
 */
public final class LexicalTokenizerName extends ExpandableStringEnum<LexicalTokenizerName> {
    /**
     * Static value classic for LexicalTokenizerName.
     */
    public static final LexicalTokenizerName CLASSIC = fromString("classic");

    /**
     * Static value edgeNGram for LexicalTokenizerName.
     */
    public static final LexicalTokenizerName EDGE_NGRAM = fromString("edgeNGram");

    /**
     * Static value keyword_v2 for LexicalTokenizerName.
     */
    public static final LexicalTokenizerName KEYWORD = fromString("keyword_v2");

    /**
     * Static value letter for LexicalTokenizerName.
     */
    public static final LexicalTokenizerName LETTER = fromString("letter");

    /**
     * Static value lowercase for LexicalTokenizerName.
     */
    public static final LexicalTokenizerName LOWERCASE = fromString("lowercase");

    /**
     * Static value microsoft_language_tokenizer for LexicalTokenizerName.
     */
    public static final LexicalTokenizerName MICROSOFT_LANGUAGE_TOKENIZER = fromString("microsoft_language_tokenizer");

    /**
     * Static value microsoft_language_stemming_tokenizer for LexicalTokenizerName.
     */
    public static final LexicalTokenizerName MICROSOFT_LANGUAGE_STEMMING_TOKENIZER = fromString("microsoft_language_stemming_tokenizer");

    /**
     * Static value nGram for LexicalTokenizerName.
     */
    public static final LexicalTokenizerName NGRAM = fromString("nGram");

    /**
     * Static value path_hierarchy_v2 for LexicalTokenizerName.
     */
    public static final LexicalTokenizerName PATH_HIERARCHY = fromString("path_hierarchy_v2");

    /**
     * Static value pattern for LexicalTokenizerName.
     */
    public static final LexicalTokenizerName PATTERN = fromString("pattern");

    /**
     * Static value standard_v2 for LexicalTokenizerName.
     */
    public static final LexicalTokenizerName STANDARD = fromString("standard_v2");

    /**
     * Static value uax_url_email for LexicalTokenizerName.
     */
    public static final LexicalTokenizerName UAX_URL_EMAIL = fromString("uax_url_email");

    /**
     * Static value whitespace for LexicalTokenizerName.
     */
    public static final LexicalTokenizerName WHITESPACE = fromString("whitespace");

    /**
     * Creates or finds a LexicalTokenizerName from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding LexicalTokenizerName.
     */
    @JsonCreator
    public static LexicalTokenizerName fromString(String name) {
        return fromString(name, LexicalTokenizerName.class);
    }

    /**
     * @return known LexicalTokenizerName values.
     */
    public static Collection<LexicalTokenizerName> values() {
        return values(LexicalTokenizerName.class);
    }
}
