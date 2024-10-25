package com.forsale.app.datalayer.database;

import java.util.List;
/* compiled from: AreaWithBlocks.kt */
/* loaded from: classes2.dex */
public final class AreaWithBlocks {
    public static final int $stable = 8;
    private DistrictEntity area;
    private List<DistrictEntity> blocks;

    public final DistrictEntity getArea() {
        return this.area;
    }

    public final List<DistrictEntity> getBlocks() {
        return this.blocks;
    }

    public final void setArea(DistrictEntity districtEntity) {
        this.area = districtEntity;
    }

    public final void setBlocks(List<DistrictEntity> list) {
        this.blocks = list;
    }
}
