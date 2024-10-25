package com.forsale.app.features.postad;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PostAdViewModel.kt */
@kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.features.postad.PostAdViewModel", f = "PostAdViewModel.kt", l = {1428, 1424}, m = "logChooseCategoryVisitedEvent")
/* loaded from: classes2.dex */
public final class PostAdViewModel$logChooseCategoryVisitedEvent$1 extends ContinuationImpl {

    /* renamed from: a  reason: collision with root package name */
    Object f34083a;

    /* renamed from: b  reason: collision with root package name */
    Object f34084b;

    /* renamed from: c  reason: collision with root package name */
    Object f34085c;

    /* renamed from: d  reason: collision with root package name */
    Object f34086d;

    /* renamed from: e  reason: collision with root package name */
    Object f34087e;

    /* renamed from: f  reason: collision with root package name */
    /* synthetic */ Object f34088f;

    /* renamed from: g  reason: collision with root package name */
    final /* synthetic */ PostAdViewModel f34089g;

    /* renamed from: h  reason: collision with root package name */
    int f34090h;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PostAdViewModel$logChooseCategoryVisitedEvent$1(PostAdViewModel postAdViewModel, zz.a<? super PostAdViewModel$logChooseCategoryVisitedEvent$1> aVar) {
        super(aVar);
        this.f34089g = postAdViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f34088f = obj;
        this.f34090h |= Integer.MIN_VALUE;
        return this.f34089g.M3(null, null, this);
    }
}
