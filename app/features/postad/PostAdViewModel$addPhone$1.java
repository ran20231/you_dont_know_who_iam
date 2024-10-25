package com.forsale.app.features.postad;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PostAdViewModel.kt */
@kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.features.postad.PostAdViewModel", f = "PostAdViewModel.kt", l = {1076}, m = "addPhone")
/* loaded from: classes2.dex */
public final class PostAdViewModel$addPhone$1 extends ContinuationImpl {

    /* renamed from: a  reason: collision with root package name */
    Object f33995a;

    /* renamed from: b  reason: collision with root package name */
    Object f33996b;

    /* renamed from: c  reason: collision with root package name */
    /* synthetic */ Object f33997c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ PostAdViewModel f33998d;

    /* renamed from: e  reason: collision with root package name */
    int f33999e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PostAdViewModel$addPhone$1(PostAdViewModel postAdViewModel, zz.a<? super PostAdViewModel$addPhone$1> aVar) {
        super(aVar);
        this.f33998d = postAdViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object x12;
        this.f33997c = obj;
        this.f33999e |= Integer.MIN_VALUE;
        x12 = this.f33998d.x1(null, null, this);
        return x12;
    }
}
