package com.forsale.app.features.postad.location;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.d;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PostAdLocationViewModel.kt */
@d(c = "com.forsale.app.features.postad.location.PostAdLocationViewModel", f = "PostAdLocationViewModel.kt", l = {443, 454, 459}, m = "setLocationEntity")
/* loaded from: classes2.dex */
public final class PostAdLocationViewModel$setLocationEntity$1 extends ContinuationImpl {

    /* renamed from: a  reason: collision with root package name */
    Object f35770a;

    /* renamed from: b  reason: collision with root package name */
    Object f35771b;

    /* renamed from: c  reason: collision with root package name */
    /* synthetic */ Object f35772c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ PostAdLocationViewModel f35773d;

    /* renamed from: e  reason: collision with root package name */
    int f35774e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PostAdLocationViewModel$setLocationEntity$1(PostAdLocationViewModel postAdLocationViewModel, zz.a<? super PostAdLocationViewModel$setLocationEntity$1> aVar) {
        super(aVar);
        this.f35773d = postAdLocationViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object K2;
        this.f35772c = obj;
        this.f35774e |= Integer.MIN_VALUE;
        K2 = this.f35773d.K2(null, false, this);
        return K2;
    }
}
