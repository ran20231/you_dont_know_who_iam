package com.forsale.app.features.maincontainer;

import com.leanplum.internal.ResourceQualifiers;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: MainContainerViewModel.kt */
@kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.features.maincontainer.MainContainerViewModel", f = "MainContainerViewModel.kt", l = {177, 182, 188, ResourceQualifiers.Qualifier.AnonymousClass5.SCREENLAYOUT_LAYOUTDIR_MASK}, m = "updateUserStatus")
/* loaded from: classes2.dex */
public final class MainContainerViewModel$updateUserStatus$1 extends ContinuationImpl {

    /* renamed from: a  reason: collision with root package name */
    Object f31543a;

    /* renamed from: b  reason: collision with root package name */
    /* synthetic */ Object f31544b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ MainContainerViewModel f31545c;

    /* renamed from: d  reason: collision with root package name */
    int f31546d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MainContainerViewModel$updateUserStatus$1(MainContainerViewModel mainContainerViewModel, zz.a<? super MainContainerViewModel$updateUserStatus$1> aVar) {
        super(aVar);
        this.f31545c = mainContainerViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object U1;
        this.f31544b = obj;
        this.f31546d |= Integer.MIN_VALUE;
        U1 = this.f31545c.U1(null, this);
        return U1;
    }
}
