package com.forsale.app.utils.prefUtils.preferences;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.d;
import zz.a;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: MasterDataSharedPrefs.kt */
@d(c = "com.forsale.app.utils.prefUtils.preferences.MasterDataSharedPrefs", f = "MasterDataSharedPrefs.kt", l = {99, 100}, m = "clearUpdatesTracker")
/* loaded from: classes3.dex */
public final class MasterDataSharedPrefs$clearUpdatesTracker$1 extends ContinuationImpl {

    /* renamed from: a  reason: collision with root package name */
    Object f40489a;

    /* renamed from: b  reason: collision with root package name */
    /* synthetic */ Object f40490b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ MasterDataSharedPrefs f40491c;

    /* renamed from: d  reason: collision with root package name */
    int f40492d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MasterDataSharedPrefs$clearUpdatesTracker$1(MasterDataSharedPrefs masterDataSharedPrefs, a<? super MasterDataSharedPrefs$clearUpdatesTracker$1> aVar) {
        super(aVar);
        this.f40491c = masterDataSharedPrefs;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f40490b = obj;
        this.f40492d |= Integer.MIN_VALUE;
        return this.f40491c.a(this);
    }
}
