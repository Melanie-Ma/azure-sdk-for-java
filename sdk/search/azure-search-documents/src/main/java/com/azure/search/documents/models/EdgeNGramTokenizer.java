// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.search.documents.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.List;

/**
 * Tokenizes the input from an edge into n-grams of the given size(s). This
 * tokenizer is implemented using Apache Lucene.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "@odata.type")
@JsonTypeName("#Microsoft.Azure.Search.EdgeNGramTokenizer")
@Fluent
public final class EdgeNGramTokenizer extends LexicalTokenizer {
    /*
     * The minimum n-gram length. Default is 1. Maximum is 300. Must be less
     * than the value of maxGram.
     */
    @JsonProperty(value = "minGram")
    private Integer minGram;

    /*
     * The maximum n-gram length. Default is 2. Maximum is 300.
     */
    @JsonProperty(value = "maxGram")
    private Integer maxGram;

    /*
     * Character classes to keep in the tokens.
     */
    @JsonProperty(value = "tokenChars")
    private List<TokenCharacterKind> tokenChars;

    /**
     * Get the minGram property: The minimum n-gram length. Default is 1.
     * Maximum is 300. Must be less than the value of maxGram.
     *
     * @return the minGram value.
     */
    public Integer getMinGram() {
        return this.minGram;
    }

    /**
     * Set the minGram property: The minimum n-gram length. Default is 1.
     * Maximum is 300. Must be less than the value of maxGram.
     *
     * @param minGram the minGram value to set.
     * @return the EdgeNGramTokenizer object itself.
     */
    public EdgeNGramTokenizer setMinGram(Integer minGram) {
        this.minGram = minGram;
        return this;
    }

    /**
     * Get the maxGram property: The maximum n-gram length. Default is 2.
     * Maximum is 300.
     *
     * @return the maxGram value.
     */
    public Integer getMaxGram() {
        return this.maxGram;
    }

    /**
     * Set the maxGram property: The maximum n-gram length. Default is 2.
     * Maximum is 300.
     *
     * @param maxGram the maxGram value to set.
     * @return the EdgeNGramTokenizer object itself.
     */
    public EdgeNGramTokenizer setMaxGram(Integer maxGram) {
        this.maxGram = maxGram;
        return this;
    }

    /**
     * Get the tokenChars property: Character classes to keep in the tokens.
     *
     * @return the tokenChars value.
     */
    public List<TokenCharacterKind> getTokenChars() {
        return this.tokenChars;
    }

    /**
     * Set the tokenChars property: Character classes to keep in the tokens.
     *
     * @param tokenChars the tokenChars value to set.
     * @return the EdgeNGramTokenizer object itself.
     */
    public EdgeNGramTokenizer setTokenChars(List<TokenCharacterKind> tokenChars) {
        this.tokenChars = tokenChars;
        return this;
    }
}
