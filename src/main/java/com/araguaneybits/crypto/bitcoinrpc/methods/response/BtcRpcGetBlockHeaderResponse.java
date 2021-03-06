/*
 * Copyright 2019 AraguaneyBits.com
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.araguaneybits.crypto.bitcoinrpc.methods.response;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The Class BtcRpcGetBlockHeaderResponse.
 *
 * @author jestevez
 */
public class BtcRpcGetBlockHeaderResponse implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 592959046742824701L;

    /** The hash. */
    @JsonProperty("hash")
    private String hash;

    /** The confirmations. */
    @JsonProperty("confirmations")
    private Long confirmations;

    /** The height. */
    @JsonProperty("height")
    private Long height;

    /** The version. */
    @JsonProperty("version")
    private Long version;

    /** The version hex. */
    @JsonProperty("versionHex")
    private String versionHex;

    /** The merkleroot. */
    @JsonProperty("merkleroot")
    private String merkleroot;

    /** The time. */
    @JsonProperty("time")
    private Long time;

    /** The mediantime. */
    @JsonProperty("mediantime")
    private Long mediantime;

    /** The nonce. */
    @JsonProperty("nonce")
    private Long nonce;

    /** The bits. */
    @JsonProperty("bits")
    private String bits;

    /** The difficulty. */
    @JsonProperty("difficulty")
    private Double difficulty;

    /** The chainwork. */
    @JsonProperty("chainwork")
    private String chainwork;

    /** The n tx. */
    @JsonProperty("nTx")
    private Long nTx;

    /** The nextblockhash. */
    @JsonProperty("nextblockhash")
    private String nextblockhash;

    /**
     * Instantiates a new btc rpc get block header response.
     */
    public BtcRpcGetBlockHeaderResponse() {
        super();
    }

    /**
     * Gets the hash.
     *
     * @return the hash
     */
    public String getHash() {
        return hash;
    }

    /**
     * Sets the hash.
     *
     * @param hash the new hash
     */
    public void setHash(String hash) {
        this.hash = hash;
    }

    /**
     * Gets the confirmations.
     *
     * @return the confirmations
     */
    public Long getConfirmations() {
        return confirmations;
    }

    /**
     * Sets the confirmations.
     *
     * @param confirmations the new confirmations
     */
    public void setConfirmations(Long confirmations) {
        this.confirmations = confirmations;
    }

    /**
     * Gets the height.
     *
     * @return the height
     */
    public Long getHeight() {
        return height;
    }

    /**
     * Sets the height.
     *
     * @param height the new height
     */
    public void setHeight(Long height) {
        this.height = height;
    }

    /**
     * Gets the version.
     *
     * @return the version
     */
    public Long getVersion() {
        return version;
    }

    /**
     * Sets the version.
     *
     * @param version the new version
     */
    public void setVersion(Long version) {
        this.version = version;
    }

    /**
     * Gets the version hex.
     *
     * @return the version hex
     */
    public String getVersionHex() {
        return versionHex;
    }

    /**
     * Sets the version hex.
     *
     * @param versionHex the new version hex
     */
    public void setVersionHex(String versionHex) {
        this.versionHex = versionHex;
    }

    /**
     * Gets the merkleroot.
     *
     * @return the merkleroot
     */
    public String getMerkleroot() {
        return merkleroot;
    }

    /**
     * Sets the merkleroot.
     *
     * @param merkleroot the new merkleroot
     */
    public void setMerkleroot(String merkleroot) {
        this.merkleroot = merkleroot;
    }

    /**
     * Gets the time.
     *
     * @return the time
     */
    public Long getTime() {
        return time;
    }

    /**
     * Sets the time.
     *
     * @param time the new time
     */
    public void setTime(Long time) {
        this.time = time;
    }

    /**
     * Gets the mediantime.
     *
     * @return the mediantime
     */
    public Long getMediantime() {
        return mediantime;
    }

    /**
     * Sets the mediantime.
     *
     * @param mediantime the new mediantime
     */
    public void setMediantime(Long mediantime) {
        this.mediantime = mediantime;
    }

    /**
     * Gets the nonce.
     *
     * @return the nonce
     */
    public Long getNonce() {
        return nonce;
    }

    /**
     * Sets the nonce.
     *
     * @param nonce the new nonce
     */
    public void setNonce(Long nonce) {
        this.nonce = nonce;
    }

    /**
     * Gets the bits.
     *
     * @return the bits
     */
    public String getBits() {
        return bits;
    }

    /**
     * Sets the bits.
     *
     * @param bits the new bits
     */
    public void setBits(String bits) {
        this.bits = bits;
    }

    /**
     * Gets the difficulty.
     *
     * @return the difficulty
     */
    public Double getDifficulty() {
        return difficulty;
    }

    /**
     * Sets the difficulty.
     *
     * @param difficulty the new difficulty
     */
    public void setDifficulty(Double difficulty) {
        this.difficulty = difficulty;
    }

    /**
     * Gets the chainwork.
     *
     * @return the chainwork
     */
    public String getChainwork() {
        return chainwork;
    }

    /**
     * Sets the chainwork.
     *
     * @param chainwork the new chainwork
     */
    public void setChainwork(String chainwork) {
        this.chainwork = chainwork;
    }

    /**
     * Gets the n tx.
     *
     * @return the n tx
     */
    public Long getnTx() {
        return nTx;
    }

    /**
     * Sets the n tx.
     *
     * @param nTx the new n tx
     */
    public void setnTx(Long nTx) {
        this.nTx = nTx;
    }

    /**
     * Gets the nextblockhash.
     *
     * @return the nextblockhash
     */
    public String getNextblockhash() {
        return nextblockhash;
    }

    /**
     * Sets the nextblockhash.
     *
     * @param nextblockhash the new nextblockhash
     */
    public void setNextblockhash(String nextblockhash) {
        this.nextblockhash = nextblockhash;
    }

}
