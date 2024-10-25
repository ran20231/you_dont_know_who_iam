package com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.baseViewModel;

import g00.p;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;
import zz.a;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: FilterViewModel.kt */
@d(c = "com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.baseViewModel.FilterViewModel$isVisibleState$2$2$1", f = "FilterViewModel.kt", l = {86}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class FilterViewModel$isVisibleState$2$2$1 extends SuspendLambda implements p<CoroutineScope, a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    Object f29453a;

    /* renamed from: b  reason: collision with root package name */
    int f29454b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ MutableStateFlow<Boolean> f29455c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ FilterViewModel<FD, FR, E> f29456d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FilterViewModel$isVisibleState$2$2$1(MutableStateFlow<Boolean> mutableStateFlow, FilterViewModel<FD, FR, E> filterViewModel, a<? super FilterViewModel$isVisibleState$2$2$1> aVar) {
        super(2, aVar);
        this.f29455c = mutableStateFlow;
        this.f29456d = filterViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final a<wz.p> create(Object obj, a<?> aVar) {
        return new FilterViewModel$isVisibleState$2$2$1(this.f29455c, this.f29456d, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        MutableStateFlow<Boolean> mutableStateFlow;
        boolean D;
        Object z11;
        MutableStateFlow<Boolean> mutableStateFlow2;
        f11 = b.f();
        int i11 = this.f29454b;
        boolean z12 = true;
        if (i11 != 0) {
            if (i11 == 1) {
                mutableStateFlow2 = (MutableStateFlow) this.f29453a;
                f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            f.b(obj);
            mutableStateFlow = this.f29455c;
            D = this.f29456d.D();
            if (D) {
                FilterViewModel<FD, FR, E> filterViewModel = this.f29456d;
                this.f29453a = mutableStateFlow;
                this.f29454b = 1;
                z11 = filterViewModel.z(this);
                if (z11 == f11) {
                    return f11;
                }
                mutableStateFlow2 = mutableStateFlow;
                obj = z11;
            }
            z12 = false;
            mutableStateFlow2 = mutableStateFlow;
            mutableStateFlow2.setValue(kotlin.coroutines.jvm.internal.a.a(z12));
            return wz.p.f75480a;
        }
        if (!((Boolean) obj).booleanValue()) {
            mutableStateFlow = mutableStateFlow2;
            z12 = false;
            mutableStateFlow2 = mutableStateFlow;
        }
        mutableStateFlow2.setValue(kotlin.coroutines.jvm.internal.a.a(z12));
        return wz.p.f75480a;
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, a<? super wz.p> aVar) {
        return ((FilterViewModel$isVisibleState$2$2$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
