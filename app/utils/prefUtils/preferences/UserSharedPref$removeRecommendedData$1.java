package com.forsale.app.utils.prefUtils.preferences;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.d;
import zz.a;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: UserSharedPref.kt */
@d(c = "com.forsale.app.utils.prefUtils.preferences.UserSharedPref", f = "UserSharedPref.kt", l = {51, 52}, m = "removeRecommendedData")
/* loaded from: classes3.dex */
public final class UserSharedPref$removeRecommendedData$1 extends ContinuationImpl {

    /* renamed from: a  reason: collision with root package name */
    Object f40525a;

    /* renamed from: b  reason: collision with root package name */
    /* synthetic */ Object f40526b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ UserSharedPref f40527c;

    /* renamed from: d  reason: collision with root package name */
    int f40528d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UserSharedPref$removeRecommendedData$1(UserSharedPref userSharedPref, a<? super UserSharedPref$removeRecommendedData$1> aVar) {
        super(aVar);
        this.f40527c = userSharedPref;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f40526b = obj;
        this.f40528d |= Integer.MIN_VALUE;
        return this.f40527c.e(this);
    }
}
