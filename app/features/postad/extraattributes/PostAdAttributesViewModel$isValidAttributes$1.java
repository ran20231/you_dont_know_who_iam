package com.forsale.app.features.postad.extraattributes;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.d;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PostAdAttributesViewModel.kt */
@d(c = "com.forsale.app.features.postad.extraattributes.PostAdAttributesViewModel", f = "PostAdAttributesViewModel.kt", l = {193}, m = "isValidAttributes")
/* loaded from: classes2.dex */
public final class PostAdAttributesViewModel$isValidAttributes$1 extends ContinuationImpl {

    /* renamed from: a  reason: collision with root package name */
    Object f35155a;

    /* renamed from: b  reason: collision with root package name */
    /* synthetic */ Object f35156b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ PostAdAttributesViewModel f35157c;

    /* renamed from: d  reason: collision with root package name */
    int f35158d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PostAdAttributesViewModel$isValidAttributes$1(PostAdAttributesViewModel postAdAttributesViewModel, zz.a<? super PostAdAttributesViewModel$isValidAttributes$1> aVar) {
        super(aVar);
        this.f35157c = postAdAttributesViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object T0;
        this.f35156b = obj;
        this.f35158d |= Integer.MIN_VALUE;
        T0 = this.f35157c.T0(this);
        return T0;
    }
}
