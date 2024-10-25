package com.forsale.app.features.postad.extrainfo;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.d;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PostAdExtraInfoViewModel.kt */
@d(c = "com.forsale.app.features.postad.extrainfo.PostAdExtraInfoViewModel", f = "PostAdExtraInfoViewModel.kt", l = {181}, m = "findInitialBusinessType")
/* loaded from: classes2.dex */
public final class PostAdExtraInfoViewModel$findInitialBusinessType$1 extends ContinuationImpl {

    /* renamed from: a  reason: collision with root package name */
    Object f35521a;

    /* renamed from: b  reason: collision with root package name */
    /* synthetic */ Object f35522b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ PostAdExtraInfoViewModel f35523c;

    /* renamed from: d  reason: collision with root package name */
    int f35524d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PostAdExtraInfoViewModel$findInitialBusinessType$1(PostAdExtraInfoViewModel postAdExtraInfoViewModel, zz.a<? super PostAdExtraInfoViewModel$findInitialBusinessType$1> aVar) {
        super(aVar);
        this.f35523c = postAdExtraInfoViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f35522b = obj;
        this.f35524d |= Integer.MIN_VALUE;
        return this.f35523c.Y0(this);
    }
}
