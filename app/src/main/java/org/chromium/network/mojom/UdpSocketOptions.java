
// Copyright 2014 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     services/network/public/mojom/udp_socket.mojom
//

package org.chromium.network.mojom;

import org.chromium.mojo.bindings.DeserializationException;


public final class UdpSocketOptions extends org.chromium.mojo.bindings.Struct {

    private static final int STRUCT_SIZE = 32;
    private static final org.chromium.mojo.bindings.DataHeader[] VERSION_ARRAY = new org.chromium.mojo.bindings.DataHeader[] {new org.chromium.mojo.bindings.DataHeader(32, 0)};
    private static final org.chromium.mojo.bindings.DataHeader DEFAULT_STRUCT_INFO = VERSION_ARRAY[0];
    public boolean allowAddressReuse;
    public int multicastInterface;
    public int multicastTimeToLive;
    public boolean multicastLoopbackMode;
    public int sendBufferSize;
    public int receiveBufferSize;

    private UdpSocketOptions(int version) {
        super(STRUCT_SIZE, version);
        this.allowAddressReuse = (boolean) false;
        this.multicastInterface = (int) 0L;
        this.multicastTimeToLive = (int) 1L;
        this.multicastLoopbackMode = (boolean) true;
        this.sendBufferSize = (int) 0L;
        this.receiveBufferSize = (int) 0L;
    }

    public UdpSocketOptions() {
        this(0);
    }

    public static UdpSocketOptions deserialize(org.chromium.mojo.bindings.Message message) {
        return decode(new org.chromium.mojo.bindings.Decoder(message));
    }

    /**
     * Similar to the method above, but deserializes from a |ByteBuffer| instance.
     *
     * @throws org.chromium.mojo.bindings.DeserializationException on deserialization failure.
     */
    public static UdpSocketOptions deserialize(java.nio.ByteBuffer data) {
        if (data == null)
            return null;

        return deserialize(new org.chromium.mojo.bindings.Message(
                data, new java.util.ArrayList<org.chromium.mojo.system.Handle>()));
    }

    @SuppressWarnings("unchecked")
    public static UdpSocketOptions decode(org.chromium.mojo.bindings.Decoder decoder0) {
        if (decoder0 == null) {
            return null;
        }
        decoder0.increaseStackDepth();
        UdpSocketOptions result;
        try {
            org.chromium.mojo.bindings.DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
            result = new UdpSocketOptions(mainDataHeader.elementsOrVersion);
            if (mainDataHeader.elementsOrVersion >= 0) {
                
                result.allowAddressReuse = decoder0.readBoolean(8, 0);
            }
            if (mainDataHeader.elementsOrVersion >= 0) {
                
                result.multicastLoopbackMode = decoder0.readBoolean(8, 1);
            }
            if (mainDataHeader.elementsOrVersion >= 0) {
                
                result.multicastInterface = decoder0.readInt(12);
            }
            if (mainDataHeader.elementsOrVersion >= 0) {
                
                result.multicastTimeToLive = decoder0.readInt(16);
            }
            if (mainDataHeader.elementsOrVersion >= 0) {
                
                result.sendBufferSize = decoder0.readInt(20);
            }
            if (mainDataHeader.elementsOrVersion >= 0) {
                
                result.receiveBufferSize = decoder0.readInt(24);
            }
        } finally {
            decoder0.decreaseStackDepth();
        }
        return result;
    }

    @SuppressWarnings("unchecked")
    @Override
    protected final void encode(org.chromium.mojo.bindings.Encoder encoder) {
        org.chromium.mojo.bindings.Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
        
        encoder0.encode(this.allowAddressReuse, 8, 0);
        
        encoder0.encode(this.multicastLoopbackMode, 8, 1);
        
        encoder0.encode(this.multicastInterface, 12);
        
        encoder0.encode(this.multicastTimeToLive, 16);
        
        encoder0.encode(this.sendBufferSize, 20);
        
        encoder0.encode(this.receiveBufferSize, 24);
    }

    /**
     * @see Object#equals(Object)
     */
    @Override
    public boolean equals(Object object) {
        if (object == this)
            return true;
        if (object == null)
            return false;
        if (getClass() != object.getClass())
            return false;
        UdpSocketOptions other = (UdpSocketOptions) object;
        if (this.allowAddressReuse!= other.allowAddressReuse)
            return false;
        if (this.multicastInterface!= other.multicastInterface)
            return false;
        if (this.multicastTimeToLive!= other.multicastTimeToLive)
            return false;
        if (this.multicastLoopbackMode!= other.multicastLoopbackMode)
            return false;
        if (this.sendBufferSize!= other.sendBufferSize)
            return false;
        if (this.receiveBufferSize!= other.receiveBufferSize)
            return false;
        return true;
    }

    /**
     * @see Object#hashCode()
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = prime + getClass().hashCode();
        result = prime * result + org.chromium.mojo.bindings.BindingsHelper.hashCode(this.allowAddressReuse);
        result = prime * result + org.chromium.mojo.bindings.BindingsHelper.hashCode(this.multicastInterface);
        result = prime * result + org.chromium.mojo.bindings.BindingsHelper.hashCode(this.multicastTimeToLive);
        result = prime * result + org.chromium.mojo.bindings.BindingsHelper.hashCode(this.multicastLoopbackMode);
        result = prime * result + org.chromium.mojo.bindings.BindingsHelper.hashCode(this.sendBufferSize);
        result = prime * result + org.chromium.mojo.bindings.BindingsHelper.hashCode(this.receiveBufferSize);
        return result;
    }
}