package com.forsale.app.features.maincontainer;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: MainContainerActivity.kt */
@kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.features.maincontainer.MainContainerActivity", f = "MainContainerActivity.kt", l = {1184}, m = "checkUserLoggedInThen")
/* loaded from: classes2.dex */
public final class MainContainerActivity$checkUserLoggedInThen$2 extends ContinuationImpl {

    /* renamed from: a  reason: collision with root package name */
    Object f31342a;

    /* renamed from: b  reason: collision with root package name */
    Object f31343b;

    /* renamed from: c  reason: collision with root package name */
    Object f31344c;

    /* renamed from: d  reason: collision with root package name */
    /* synthetic */ Object f31345d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ MainContainerActivity f31346e;

    /* renamed from: f  reason: collision with root package name */
    int f31347f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MainContainerActivity$checkUserLoggedInThen$2(MainContainerActivity mainContainerActivity, zz.a<? super MainContainerActivity$checkUserLoggedInThen$2> aVar) {
        super(aVar);
        this.f31346e = mainContainerActivity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f12;
        this.f31345d = obj;
        this.f31347f |= Integer.MIN_VALUE;
        f12 = this.f31346e.f1(null, null, this);
        return f12;
    }
}
