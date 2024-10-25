package com.forsale.app.utils.prefUtils.preferences;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.d;
import zz.a;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: UserPostsSharedPrefs.kt */
@d(c = "com.forsale.app.utils.prefUtils.preferences.UserPostsSharedPrefs", f = "UserPostsSharedPrefs.kt", l = {47, 48, 49, 50, 51, 52}, m = "clearAllUserPostsData")
/* loaded from: classes3.dex */
public final class UserPostsSharedPrefs$clearAllUserPostsData$1 extends ContinuationImpl {

    /* renamed from: a  reason: collision with root package name */
    Object f40508a;

    /* renamed from: b  reason: collision with root package name */
    /* synthetic */ Object f40509b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ UserPostsSharedPrefs f40510c;

    /* renamed from: d  reason: collision with root package name */
    int f40511d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UserPostsSharedPrefs$clearAllUserPostsData$1(UserPostsSharedPrefs userPostsSharedPrefs, a<? super UserPostsSharedPrefs$clearAllUserPostsData$1> aVar) {
        super(aVar);
        this.f40510c = userPostsSharedPrefs;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f40509b = obj;
        this.f40511d |= Integer.MIN_VALUE;
        return this.f40510c.a(this);
    }
}
