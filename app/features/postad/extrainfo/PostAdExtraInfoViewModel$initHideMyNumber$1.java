package com.forsale.app.features.postad.extrainfo;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.d;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PostAdExtraInfoViewModel.kt */
@d(c = "com.forsale.app.features.postad.extrainfo.PostAdExtraInfoViewModel", f = "PostAdExtraInfoViewModel.kt", l = {167}, m = "initHideMyNumber")
/* loaded from: classes2.dex */
public final class PostAdExtraInfoViewModel$initHideMyNumber$1 extends ContinuationImpl {

    /* renamed from: a  reason: collision with root package name */
    Object f35537a;

    /* renamed from: b  reason: collision with root package name */
    /* synthetic */ Object f35538b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ PostAdExtraInfoViewModel f35539c;

    /* renamed from: d  reason: collision with root package name */
    int f35540d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PostAdExtraInfoViewModel$initHideMyNumber$1(PostAdExtraInfoViewModel postAdExtraInfoViewModel, zz.a<? super PostAdExtraInfoViewModel$initHideMyNumber$1> aVar) {
        super(aVar);
        this.f35539c = postAdExtraInfoViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f35538b = obj;
        this.f35540d |= Integer.MIN_VALUE;
        return this.f35539c.A1(this);
    }
}
