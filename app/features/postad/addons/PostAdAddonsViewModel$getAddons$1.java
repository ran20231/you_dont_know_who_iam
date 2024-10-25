package com.forsale.app.features.postad.addons;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.d;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PostAdAddonsViewModel.kt */
@d(c = "com.forsale.app.features.postad.addons.PostAdAddonsViewModel", f = "PostAdAddonsViewModel.kt", l = {228, 234, 235, 237, 238}, m = "getAddons")
/* loaded from: classes2.dex */
public final class PostAdAddonsViewModel$getAddons$1 extends ContinuationImpl {

    /* renamed from: a  reason: collision with root package name */
    Object f34342a;

    /* renamed from: b  reason: collision with root package name */
    Object f34343b;

    /* renamed from: c  reason: collision with root package name */
    /* synthetic */ Object f34344c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ PostAdAddonsViewModel f34345d;

    /* renamed from: e  reason: collision with root package name */
    int f34346e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PostAdAddonsViewModel$getAddons$1(PostAdAddonsViewModel postAdAddonsViewModel, zz.a<? super PostAdAddonsViewModel$getAddons$1> aVar) {
        super(aVar);
        this.f34345d = postAdAddonsViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object W0;
        this.f34344c = obj;
        this.f34346e |= Integer.MIN_VALUE;
        W0 = this.f34345d.W0(this);
        return W0;
    }
}
