package com.forsale.app.features.postad;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PostAdViewModel.kt */
@kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.features.postad.PostAdViewModel", f = "PostAdViewModel.kt", l = {1089}, m = "getMaxNumberAllowed")
/* loaded from: classes2.dex */
public final class PostAdViewModel$getMaxNumberAllowed$1 extends ContinuationImpl {

    /* renamed from: a  reason: collision with root package name */
    /* synthetic */ Object f34040a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ PostAdViewModel f34041b;

    /* renamed from: c  reason: collision with root package name */
    int f34042c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PostAdViewModel$getMaxNumberAllowed$1(PostAdViewModel postAdViewModel, zz.a<? super PostAdViewModel$getMaxNumberAllowed$1> aVar) {
        super(aVar);
        this.f34041b = postAdViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object r22;
        this.f34040a = obj;
        this.f34042c |= Integer.MIN_VALUE;
        r22 = this.f34041b.r2(this);
        return r22;
    }
}
