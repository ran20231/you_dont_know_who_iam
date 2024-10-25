package com.forsale.app.utils.prefUtils.preferences;

import com.google.android.gms.common.ConnectionResult;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.d;
import zz.a;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: LocalizationSharedPrefs.kt */
@d(c = "com.forsale.app.utils.prefUtils.preferences.LocalizationSharedPrefs", f = "LocalizationSharedPrefs.kt", l = {ConnectionResult.API_DISABLED}, m = "getTranslation")
/* loaded from: classes3.dex */
public final class LocalizationSharedPrefs$getTranslation$1 extends ContinuationImpl {

    /* renamed from: a  reason: collision with root package name */
    Object f40465a;

    /* renamed from: b  reason: collision with root package name */
    /* synthetic */ Object f40466b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ LocalizationSharedPrefs f40467c;

    /* renamed from: d  reason: collision with root package name */
    int f40468d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LocalizationSharedPrefs$getTranslation$1(LocalizationSharedPrefs localizationSharedPrefs, a<? super LocalizationSharedPrefs$getTranslation$1> aVar) {
        super(aVar);
        this.f40467c = localizationSharedPrefs;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f40466b = obj;
        this.f40468d |= Integer.MIN_VALUE;
        return this.f40467c.c(this);
    }
}
