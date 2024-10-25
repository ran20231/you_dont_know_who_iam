package com.forsale.app.features.categories.user.profile;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: SharedUserProfileViewModel.kt */
@kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.features.categories.user.profile.SharedUserProfileViewModel", f = "SharedUserProfileViewModel.kt", l = {27}, m = "isUserLogin")
/* loaded from: classes2.dex */
public final class SharedUserProfileViewModel$isUserLogin$1 extends ContinuationImpl {

    /* renamed from: a  reason: collision with root package name */
    /* synthetic */ Object f31135a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ SharedUserProfileViewModel f31136b;

    /* renamed from: c  reason: collision with root package name */
    int f31137c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SharedUserProfileViewModel$isUserLogin$1(SharedUserProfileViewModel sharedUserProfileViewModel, zz.a<? super SharedUserProfileViewModel$isUserLogin$1> aVar) {
        super(aVar);
        this.f31136b = sharedUserProfileViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f31135a = obj;
        this.f31137c |= Integer.MIN_VALUE;
        return this.f31136b.z0(this);
    }
}
