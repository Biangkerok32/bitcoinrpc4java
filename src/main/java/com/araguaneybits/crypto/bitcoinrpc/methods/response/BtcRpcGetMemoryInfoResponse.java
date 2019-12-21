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
 * The Class BtcRpcGetMemoryInfoResponse.
 *
 * @author jestevez
 */
public class BtcRpcGetMemoryInfoResponse implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = -1799786476365286142L;

    /** The locked. */
    @JsonProperty("locked")
    private BtcRpcGetMemoryInfoLockedResponse locked;

    /**
     * Instantiates a new btc rpc get memory info response.
     */
    public BtcRpcGetMemoryInfoResponse() {
        super();
    }

    /**
     * Gets the locked.
     *
     * @return the locked
     */
    public BtcRpcGetMemoryInfoLockedResponse getLocked() {
        return locked;
    }

    /**
     * Sets the locked.
     *
     * @param locked the new locked
     */
    public void setLocked(BtcRpcGetMemoryInfoLockedResponse locked) {
        this.locked = locked;
    }

    /*
     * (non-Javadoc)
     * 
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return "BtcRpcGetMemoryInfoResponse [locked=" + locked + "]";
    }

}
