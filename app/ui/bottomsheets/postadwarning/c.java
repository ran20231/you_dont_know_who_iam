package com.forsale.app.ui.bottomsheets.postadwarning;

import androidx.lifecycle.q0;
import com.forsale.app.datalayer.repositories.ApplicationResourcesRepository;
import com.forsale.app.utils.OneShotEventHandler;
import kotlin.jvm.internal.o;
import t9.y0;
import wz.p;
/* compiled from: PostAdWarningViewModel.kt */
/* loaded from: classes3.dex */
public final class c extends q0 {

    /* renamed from: a  reason: collision with root package name */
    private final ApplicationResourcesRepository f39080a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f39081b;

    /* renamed from: c  reason: collision with root package name */
    private final String f39082c;

    /* renamed from: d  reason: collision with root package name */
    private final OneShotEventHandler<p> f39083d;

    /* renamed from: e  reason: collision with root package name */
    private final OneShotEventHandler<p> f39084e;

    /* compiled from: PostAdWarningViewModel.kt */
    /* loaded from: classes3.dex */
    public interface a {
        c a(int i11, boolean z11);
    }

    public c(ApplicationResourcesRepository resourcesRepository, int i11, boolean z11) {
        o.i(resourcesRepository, "resourcesRepository");
        this.f39080a = resourcesRepository;
        this.f39081b = z11;
        this.f39082c = f(i11);
        this.f39083d = new OneShotEventHandler<>(null, 0, 3, null);
        this.f39084e = new OneShotEventHandler<>(null, 0, 3, null);
    }

    private final String f(int i11) {
        switch (i11) {
            case 13:
                return this.f39080a.getString(y0.f70484h5, new Object[0]);
            case 14:
            default:
                return "";
            case 15:
                return this.f39080a.getString(y0.L4, new Object[0]);
            case 16:
                return this.f39080a.getString(y0.Zb, new Object[0]);
            case 17:
                return this.f39080a.getString(y0.Vb, new Object[0]);
        }
    }

    public final String e() {
        return this.f39082c;
    }

    public final OneShotEventHandler<p> g() {
        return this.f39083d;
    }

    public final OneShotEventHandler<p> h() {
        return this.f39084e;
    }

    public final boolean j() {
        return this.f39081b;
    }

    public final void k() {
        OneShotEventHandler.d(this.f39083d, null, 1, null);
    }

    public final void l() {
        OneShotEventHandler.d(this.f39084e, null, 1, null);
    }
}
