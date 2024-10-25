package com.forsale.app.datalayer.network.entities;

import kotlin.jvm.internal.o;
import up.c;
/* compiled from: BlockingReasonEntity.kt */
/* loaded from: classes2.dex */
public final class BlockingReasonEntity {
    public static final int $stable = 0;
    @c("block_reason")
    private final String blockReason;
    @c("block_type")
    private final String blockType;

    public BlockingReasonEntity(String str, String str2) {
        this.blockReason = str;
        this.blockType = str2;
    }

    public static /* synthetic */ BlockingReasonEntity copy$default(BlockingReasonEntity blockingReasonEntity, String str, String str2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = blockingReasonEntity.blockReason;
        }
        if ((i11 & 2) != 0) {
            str2 = blockingReasonEntity.blockType;
        }
        return blockingReasonEntity.copy(str, str2);
    }

    public final String component1() {
        return this.blockReason;
    }

    public final String component2() {
        return this.blockType;
    }

    public final BlockingReasonEntity copy(String str, String str2) {
        return new BlockingReasonEntity(str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BlockingReasonEntity)) {
            return false;
        }
        BlockingReasonEntity blockingReasonEntity = (BlockingReasonEntity) obj;
        if (o.d(this.blockReason, blockingReasonEntity.blockReason) && o.d(this.blockType, blockingReasonEntity.blockType)) {
            return true;
        }
        return false;
    }

    public final String getBlockReason() {
        return this.blockReason;
    }

    public final String getBlockType() {
        return this.blockType;
    }

    public int hashCode() {
        int hashCode;
        String str = this.blockReason;
        int i11 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i12 = hashCode * 31;
        String str2 = this.blockType;
        if (str2 != null) {
            i11 = str2.hashCode();
        }
        return i12 + i11;
    }

    public String toString() {
        String str = this.blockReason;
        String str2 = this.blockType;
        return "BlockingReasonEntity(blockReason=" + str + ", blockType=" + str2 + ")";
    }
}
