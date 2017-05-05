/*
 * Copyright 2012 The Netty Project
 *
 * The Netty Project licenses this file to you under the Apache License,
 * version 2.0 (the "License"); you may not use this file except in compliance
 * with the License. You may obtain a copy of the License at:
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations
 * under the License.
 */
package io.netty.example.securechat;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.ByteBufAllocator;
import io.netty.buffer.CompositeByteBuf;

import java.nio.ByteOrder;

class LittleEndianByteBufAllocator implements ByteBufAllocator {

    @Override
    public ByteBuf buffer() {
        return DEFAULT.buffer()
            .order(ByteOrder.LITTLE_ENDIAN);
    }

    @Override
    public ByteBuf buffer(int initialCapacity) {
        return DEFAULT.buffer(initialCapacity)
            .order(ByteOrder.LITTLE_ENDIAN);
    }

    @Override
    public ByteBuf buffer(int initialCapacity, int maxCapacity) {
        return DEFAULT.buffer(initialCapacity, maxCapacity)
            .order(ByteOrder.LITTLE_ENDIAN);
    }

    @Override
    public ByteBuf ioBuffer() {
        return DEFAULT.ioBuffer()
            .order(ByteOrder.LITTLE_ENDIAN);
    }

    @Override
    public ByteBuf ioBuffer(int initialCapacity) {
        return DEFAULT.ioBuffer(initialCapacity)
            .order(ByteOrder.LITTLE_ENDIAN);
    }

    @Override
    public ByteBuf ioBuffer(int initialCapacity, int maxCapacity) {
        return DEFAULT.ioBuffer(initialCapacity, maxCapacity)
            .order(ByteOrder.LITTLE_ENDIAN);
    }

    @Override
    public ByteBuf heapBuffer() {
        return DEFAULT.heapBuffer()
            .order(ByteOrder.LITTLE_ENDIAN);
    }

    @Override
    public ByteBuf heapBuffer(int initialCapacity) {
        return DEFAULT.heapBuffer(initialCapacity)
            .order(ByteOrder.LITTLE_ENDIAN);
    }

    @Override
    public ByteBuf heapBuffer(int initialCapacity, int maxCapacity) {
        return DEFAULT.heapBuffer(initialCapacity, maxCapacity)
            .order(ByteOrder.LITTLE_ENDIAN);
    }

    @Override
    public ByteBuf directBuffer() {
        return DEFAULT.directBuffer()
            .order(ByteOrder.LITTLE_ENDIAN);
    }

    @Override
    public ByteBuf directBuffer(int initialCapacity) {
        return DEFAULT.directBuffer(initialCapacity)
            .order(ByteOrder.LITTLE_ENDIAN);
    }

    @Override
    public ByteBuf directBuffer(int initialCapacity, int maxCapacity) {
        return DEFAULT.directBuffer(initialCapacity, maxCapacity)
            .order(ByteOrder.LITTLE_ENDIAN);
    }

    @Override
    public CompositeByteBuf compositeBuffer() {
        // unused
        return DEFAULT.compositeBuffer();
    }

    @Override
    public CompositeByteBuf compositeBuffer(int maxNumComponents) {
        // unused
        return DEFAULT.compositeBuffer(maxNumComponents);
    }

    @Override
    public CompositeByteBuf compositeHeapBuffer() {
        // unused
        return DEFAULT.compositeHeapBuffer();
    }

    @Override
    public CompositeByteBuf compositeHeapBuffer(int maxNumComponents) {
        // unused
        return DEFAULT.compositeHeapBuffer(maxNumComponents);
    }

    @Override
    public CompositeByteBuf compositeDirectBuffer() {
        // unused
        return DEFAULT.compositeDirectBuffer();
    }

    @Override
    public CompositeByteBuf compositeDirectBuffer(int maxNumComponents) {
        // unused
        return DEFAULT.compositeDirectBuffer(maxNumComponents);
    }

    @Override
    public boolean isDirectBufferPooled() {
        return DEFAULT.isDirectBufferPooled();
    }

    @Override
    public int calculateNewCapacity(int minNewCapacity, int maxCapacity) {
        return DEFAULT.calculateNewCapacity(minNewCapacity, maxCapacity);
    }
}
