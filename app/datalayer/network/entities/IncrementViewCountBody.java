package com.forsale.app.datalayer.network.entities;
/* compiled from: IncrementViewCountBody.kt */
/* loaded from: classes2.dex */
public final class IncrementViewCountBody {
    public static final int $stable = 0;

    /* renamed from: id  reason: collision with root package name */
    private final int f22331id;

    public IncrementViewCountBody(int i11) {
        this.f22331id = i11;
    }

    public static /* synthetic */ IncrementViewCountBody copy$default(IncrementViewCountBody incrementViewCountBody, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i11 = incrementViewCountBody.f22331id;
        }
        return incrementViewCountBody.copy(i11);
    }

    public final int component1() {
        return this.f22331id;
    }

    public final IncrementViewCountBody copy(int i11) {
        return new IncrementViewCountBody(i11);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof IncrementViewCountBody) && this.f22331id == ((IncrementViewCountBody) obj).f22331id) {
            return true;
        }
        return false;
    }

    public final int getId() {
        return this.f22331id;
    }

    public int hashCode() {
        return Integer.hashCode(this.f22331id);
    }

    public String toString() {
        int i11 = this.f22331id;
        return "IncrementViewCountBody(id=" + i11 + ")";
    }
}
