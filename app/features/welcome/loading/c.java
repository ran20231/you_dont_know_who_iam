package com.forsale.app.features.welcome.loading;

import com.forsale.app.features.welcome.loading.LoadingViewModel;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: LoadingViewModel.kt */
/* loaded from: classes2.dex */
public final class c implements LoadingViewModel.c {

    /* renamed from: a  reason: collision with root package name */
    private final boolean f37381a;

    public c() {
        this(false, 1, null);
    }

    public final boolean a() {
        return this.f37381a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof c) && this.f37381a == ((c) obj).f37381a) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        boolean z11 = this.f37381a;
        if (z11) {
            return 1;
        }
        return z11 ? 1 : 0;
    }

    public String toString() {
        boolean z11 = this.f37381a;
        return "NetworkConnectionFailed(isFreshInstall=" + z11 + ")";
    }

    public c(boolean z11) {
        this.f37381a = z11;
    }

    public /* synthetic */ c(boolean z11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? false : z11);
    }
}
