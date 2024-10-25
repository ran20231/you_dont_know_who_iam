package com.forsale.app.utils.languageutils;

import com.forsale.app.utils.languageutils.LanguageContextWrapper;
import com.google.android.gms.common.api.CommonStatusCodes;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.d;
import zz.a;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: LanguageContextWrapper.kt */
@d(c = "com.forsale.app.utils.languageutils.LanguageContextWrapper$Companion", f = "LanguageContextWrapper.kt", l = {CommonStatusCodes.RECONNECTION_TIMED_OUT_DURING_UPDATE}, m = "wrap")
/* loaded from: classes3.dex */
public final class LanguageContextWrapper$Companion$wrap$1 extends ContinuationImpl {

    /* renamed from: a  reason: collision with root package name */
    Object f40334a;

    /* renamed from: b  reason: collision with root package name */
    Object f40335b;

    /* renamed from: c  reason: collision with root package name */
    /* synthetic */ Object f40336c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ LanguageContextWrapper.Companion f40337d;

    /* renamed from: e  reason: collision with root package name */
    int f40338e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LanguageContextWrapper$Companion$wrap$1(LanguageContextWrapper.Companion companion, a<? super LanguageContextWrapper$Companion$wrap$1> aVar) {
        super(aVar);
        this.f40337d = companion;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f40336c = obj;
        this.f40338e |= Integer.MIN_VALUE;
        return this.f40337d.a(null, null, this);
    }
}
