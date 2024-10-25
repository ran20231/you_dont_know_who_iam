package com.forsale.app.features.postad;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PostAdViewModel.kt */
@kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.features.postad.PostAdViewModel", f = "PostAdViewModel.kt", l = {1130, 1138}, m = "registerWorkRequest")
/* loaded from: classes2.dex */
public final class PostAdViewModel$registerWorkRequest$1 extends ContinuationImpl {

    /* renamed from: a  reason: collision with root package name */
    Object f34119a;

    /* renamed from: b  reason: collision with root package name */
    Object f34120b;

    /* renamed from: c  reason: collision with root package name */
    Object f34121c;

    /* renamed from: d  reason: collision with root package name */
    Object f34122d;

    /* renamed from: e  reason: collision with root package name */
    boolean f34123e;

    /* renamed from: f  reason: collision with root package name */
    boolean f34124f;

    /* renamed from: g  reason: collision with root package name */
    /* synthetic */ Object f34125g;

    /* renamed from: h  reason: collision with root package name */
    final /* synthetic */ PostAdViewModel f34126h;

    /* renamed from: i  reason: collision with root package name */
    int f34127i;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PostAdViewModel$registerWorkRequest$1(PostAdViewModel postAdViewModel, zz.a<? super PostAdViewModel$registerWorkRequest$1> aVar) {
        super(aVar);
        this.f34126h = postAdViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f34125g = obj;
        this.f34127i |= Integer.MIN_VALUE;
        return this.f34126h.k4(null, false, false, this);
    }
}
