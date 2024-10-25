package com.forsale.app.utils.prefUtils.preferences;

import com.forsale.app.utils.TypeExtensionsKt;
import com.forsale.app.utils.prefUtils.DataStoreExtensionsKt;
import d3.c;
import h3.a;
import kotlin.coroutines.intrinsics.b;
import kotlin.d;
import kotlin.jvm.internal.o;
import wz.h;
import wz.p;
/* compiled from: FeatureFlagPrefs.kt */
/* loaded from: classes3.dex */
public final class FeatureFlagPrefs {

    /* renamed from: a  reason: collision with root package name */
    private final c<a> f40450a;

    /* renamed from: b  reason: collision with root package name */
    private final h f40451b;

    public FeatureFlagPrefs(c<a> dataStore) {
        h a11;
        o.i(dataStore, "dataStore");
        this.f40450a = dataStore;
        a11 = d.a(FeatureFlagPrefs$plfAsWebViewFeatureFlagPrefsKey$2.f40452a);
        this.f40451b = a11;
    }

    private final a.C0641a<Boolean> a() {
        return (a.C0641a) this.f40451b.getValue();
    }

    public final Object b(zz.a<? super Boolean> aVar) {
        return DataStoreExtensionsKt.a(this.f40450a, a(), kotlin.coroutines.jvm.internal.a.a(false), aVar);
    }

    public final Object c(int i11, zz.a<? super p> aVar) {
        Object f11;
        Object d11 = DataStoreExtensionsKt.d(this.f40450a, a(), kotlin.coroutines.jvm.internal.a.a(TypeExtensionsKt.h0(i11)), aVar);
        f11 = b.f();
        if (d11 == f11) {
            return d11;
        }
        return p.f75480a;
    }
}
