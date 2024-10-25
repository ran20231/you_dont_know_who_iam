package com.forsale.app.features.postad;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PostAdViewModel.kt */
@kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.features.postad.PostAdViewModel", f = "PostAdViewModel.kt", l = {1095}, m = "getAlternativeNumbersAsString")
/* loaded from: classes2.dex */
public final class PostAdViewModel$getAlternativeNumbersAsString$1 extends ContinuationImpl {

    /* renamed from: a  reason: collision with root package name */
    /* synthetic */ Object f34036a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ PostAdViewModel f34037b;

    /* renamed from: c  reason: collision with root package name */
    int f34038c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PostAdViewModel$getAlternativeNumbersAsString$1(PostAdViewModel postAdViewModel, zz.a<? super PostAdViewModel$getAlternativeNumbersAsString$1> aVar) {
        super(aVar);
        this.f34037b = postAdViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object V1;
        this.f34036a = obj;
        this.f34038c |= Integer.MIN_VALUE;
        V1 = this.f34037b.V1(this);
        return V1;
    }
}
