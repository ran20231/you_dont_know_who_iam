package com.forsale.app.features.postad;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PostAdViewModel.kt */
@kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.features.postad.PostAdViewModel", f = "PostAdViewModel.kt", l = {1049, 1054}, m = "updateContactNumbers")
/* loaded from: classes2.dex */
public final class PostAdViewModel$updateContactNumbers$1 extends ContinuationImpl {

    /* renamed from: a  reason: collision with root package name */
    Object f34177a;

    /* renamed from: b  reason: collision with root package name */
    Object f34178b;

    /* renamed from: c  reason: collision with root package name */
    /* synthetic */ Object f34179c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ PostAdViewModel f34180d;

    /* renamed from: e  reason: collision with root package name */
    int f34181e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PostAdViewModel$updateContactNumbers$1(PostAdViewModel postAdViewModel, zz.a<? super PostAdViewModel$updateContactNumbers$1> aVar) {
        super(aVar);
        this.f34180d = postAdViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object K4;
        this.f34179c = obj;
        this.f34181e |= Integer.MIN_VALUE;
        K4 = this.f34180d.K4(null, this);
        return K4;
    }
}
