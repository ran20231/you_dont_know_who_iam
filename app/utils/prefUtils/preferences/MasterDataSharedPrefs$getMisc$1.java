package com.forsale.app.utils.prefUtils.preferences;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.d;
import zz.a;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: MasterDataSharedPrefs.kt */
@d(c = "com.forsale.app.utils.prefUtils.preferences.MasterDataSharedPrefs", f = "MasterDataSharedPrefs.kt", l = {90}, m = "getMisc")
/* loaded from: classes3.dex */
public final class MasterDataSharedPrefs$getMisc$1 extends ContinuationImpl {

    /* renamed from: a  reason: collision with root package name */
    Object f40493a;

    /* renamed from: b  reason: collision with root package name */
    /* synthetic */ Object f40494b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ MasterDataSharedPrefs f40495c;

    /* renamed from: d  reason: collision with root package name */
    int f40496d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MasterDataSharedPrefs$getMisc$1(MasterDataSharedPrefs masterDataSharedPrefs, a<? super MasterDataSharedPrefs$getMisc$1> aVar) {
        super(aVar);
        this.f40495c = masterDataSharedPrefs;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f40494b = obj;
        this.f40496d |= Integer.MIN_VALUE;
        return this.f40495c.l(this);
    }
}
