package com.forsale.app.utils.prefUtils.preferences;

import com.google.android.gms.common.ConnectionResult;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.d;
import zz.a;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ContinueBrowsingPrefs.kt */
@d(c = "com.forsale.app.utils.prefUtils.preferences.ContinueBrowsingPrefs", f = "ContinueBrowsingPrefs.kt", l = {ConnectionResult.API_DISABLED}, m = "getContinueBrowsingData")
/* loaded from: classes3.dex */
public final class ContinueBrowsingPrefs$getContinueBrowsingData$1 extends ContinuationImpl {

    /* renamed from: a  reason: collision with root package name */
    Object f40446a;

    /* renamed from: b  reason: collision with root package name */
    /* synthetic */ Object f40447b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ ContinueBrowsingPrefs f40448c;

    /* renamed from: d  reason: collision with root package name */
    int f40449d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ContinueBrowsingPrefs$getContinueBrowsingData$1(ContinueBrowsingPrefs continueBrowsingPrefs, a<? super ContinueBrowsingPrefs$getContinueBrowsingData$1> aVar) {
        super(aVar);
        this.f40448c = continueBrowsingPrefs;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f40447b = obj;
        this.f40449d |= Integer.MIN_VALUE;
        return this.f40448c.a(this);
    }
}
