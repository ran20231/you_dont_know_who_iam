package com.forsale.app.features.more.user.profile;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: NewProfileViewModel.kt */
@kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.features.more.user.profile.NewProfileViewModel", f = "NewProfileViewModel.kt", l = {247, 246, 245}, m = "setUserLanguage")
/* loaded from: classes2.dex */
public final class NewProfileViewModel$setUserLanguage$1 extends ContinuationImpl {

    /* renamed from: a  reason: collision with root package name */
    Object f33648a;

    /* renamed from: b  reason: collision with root package name */
    Object f33649b;

    /* renamed from: c  reason: collision with root package name */
    Object f33650c;

    /* renamed from: d  reason: collision with root package name */
    /* synthetic */ Object f33651d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ NewProfileViewModel f33652e;

    /* renamed from: f  reason: collision with root package name */
    int f33653f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NewProfileViewModel$setUserLanguage$1(NewProfileViewModel newProfileViewModel, zz.a<? super NewProfileViewModel$setUserLanguage$1> aVar) {
        super(aVar);
        this.f33652e = newProfileViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object p02;
        this.f33651d = obj;
        this.f33653f |= Integer.MIN_VALUE;
        p02 = this.f33652e.p0(null, this);
        return p02;
    }
}
