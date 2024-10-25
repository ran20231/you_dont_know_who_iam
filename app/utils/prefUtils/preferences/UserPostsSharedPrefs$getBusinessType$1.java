package com.forsale.app.utils.prefUtils.preferences;

import com.google.android.gms.maps.model.PinConfig;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.d;
import zz.a;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: UserPostsSharedPrefs.kt */
@d(c = "com.forsale.app.utils.prefUtils.preferences.UserPostsSharedPrefs", f = "UserPostsSharedPrefs.kt", l = {PinConfig.BITMAP_LENGTH_DP}, m = "getBusinessType")
/* loaded from: classes3.dex */
public final class UserPostsSharedPrefs$getBusinessType$1 extends ContinuationImpl {

    /* renamed from: a  reason: collision with root package name */
    /* synthetic */ Object f40512a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ UserPostsSharedPrefs f40513b;

    /* renamed from: c  reason: collision with root package name */
    int f40514c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UserPostsSharedPrefs$getBusinessType$1(UserPostsSharedPrefs userPostsSharedPrefs, a<? super UserPostsSharedPrefs$getBusinessType$1> aVar) {
        super(aVar);
        this.f40513b = userPostsSharedPrefs;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f40512a = obj;
        this.f40514c |= Integer.MIN_VALUE;
        return this.f40513b.d(this);
    }
}
