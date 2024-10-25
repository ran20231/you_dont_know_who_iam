package com.forsale.app.features.more.user.profile;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: NewProfileViewModel.kt */
@kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.features.more.user.profile.NewProfileViewModel", f = "NewProfileViewModel.kt", l = {90}, m = "isPmEnabled")
/* loaded from: classes2.dex */
public final class NewProfileViewModel$isPmEnabled$1 extends ContinuationImpl {

    /* renamed from: a  reason: collision with root package name */
    /* synthetic */ Object f33580a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ NewProfileViewModel f33581b;

    /* renamed from: c  reason: collision with root package name */
    int f33582c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NewProfileViewModel$isPmEnabled$1(NewProfileViewModel newProfileViewModel, zz.a<? super NewProfileViewModel$isPmEnabled$1> aVar) {
        super(aVar);
        this.f33581b = newProfileViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object K;
        this.f33580a = obj;
        this.f33582c |= Integer.MIN_VALUE;
        K = this.f33581b.K(this);
        return K;
    }
}
