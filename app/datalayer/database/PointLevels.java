package com.forsale.app.datalayer.database;

import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;
import up.c;
/* compiled from: PointLevels.kt */
/* loaded from: classes2.dex */
public final class PointLevels {
    public static final String LEVELS = "levels";
    @c(LEVELS)
    private final List<PointLevel> levels;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: PointLevels.kt */
    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public PointLevels(List<PointLevel> list) {
        this.levels = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PointLevels copy$default(PointLevels pointLevels, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = pointLevels.levels;
        }
        return pointLevels.copy(list);
    }

    public final List<PointLevel> component1() {
        return this.levels;
    }

    public final PointLevels copy(List<PointLevel> list) {
        return new PointLevels(list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof PointLevels) && o.d(this.levels, ((PointLevels) obj).levels)) {
            return true;
        }
        return false;
    }

    public final List<PointLevel> getLevels() {
        return this.levels;
    }

    public int hashCode() {
        List<PointLevel> list = this.levels;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public String toString() {
        List<PointLevel> list = this.levels;
        return "PointLevels(levels=" + list + ")";
    }
}
