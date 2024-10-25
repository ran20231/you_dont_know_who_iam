package com.forsale.app.features.postad;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PostAdViewModel.kt */
@kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.features.postad.PostAdViewModel", f = "PostAdViewModel.kt", l = {394, 396, 397, 399}, m = "checkUserState")
/* loaded from: classes2.dex */
public final class PostAdViewModel$checkUserState$1 extends ContinuationImpl {

    /* renamed from: a  reason: collision with root package name */
    Object f34010a;

    /* renamed from: b  reason: collision with root package name */
    Object f34011b;

    /* renamed from: c  reason: collision with root package name */
    Object f34012c;

    /* renamed from: d  reason: collision with root package name */
    /* synthetic */ Object f34013d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ PostAdViewModel f34014e;

    /* renamed from: f  reason: collision with root package name */
    int f34015f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PostAdViewModel$checkUserState$1(PostAdViewModel postAdViewModel, zz.a<? super PostAdViewModel$checkUserState$1> aVar) {
        super(aVar);
        this.f34014e = postAdViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f34013d = obj;
        this.f34015f |= Integer.MIN_VALUE;
        return this.f34014e.C1(null, null, this);
    }
}
