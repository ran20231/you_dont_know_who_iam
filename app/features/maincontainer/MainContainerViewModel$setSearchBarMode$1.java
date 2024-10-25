package com.forsale.app.features.maincontainer;

import com.leanplum.internal.ResourceQualifiers;
import g00.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: MainContainerViewModel.kt */
@kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.features.maincontainer.MainContainerViewModel$setSearchBarMode$1", f = "MainContainerViewModel.kt", l = {ResourceQualifiers.Qualifier.AnonymousClass14.DENSITY_XXHIGH}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class MainContainerViewModel$setSearchBarMode$1 extends SuspendLambda implements p<CoroutineScope, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f31522a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ MainContainerViewModel f31523b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ boolean f31524c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MainContainerViewModel$setSearchBarMode$1(MainContainerViewModel mainContainerViewModel, boolean z11, zz.a<? super MainContainerViewModel$setSearchBarMode$1> aVar) {
        super(2, aVar);
        this.f31523b = mainContainerViewModel;
        this.f31524c = z11;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new MainContainerViewModel$setSearchBarMode$1(this.f31523b, this.f31524c, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        MutableStateFlow mutableStateFlow;
        f11 = kotlin.coroutines.intrinsics.b.f();
        int i11 = this.f31522a;
        if (i11 != 0) {
            if (i11 == 1) {
                kotlin.f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            kotlin.f.b(obj);
            mutableStateFlow = this.f31523b.f31450a1;
            Boolean a11 = kotlin.coroutines.jvm.internal.a.a(this.f31524c);
            this.f31522a = 1;
            if (mutableStateFlow.emit(a11, this) == f11) {
                return f11;
            }
        }
        return wz.p.f75480a;
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
        return ((MainContainerViewModel$setSearchBarMode$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
