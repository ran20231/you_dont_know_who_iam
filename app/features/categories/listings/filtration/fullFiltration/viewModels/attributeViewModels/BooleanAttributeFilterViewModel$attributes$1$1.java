package com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.attributeViewModels;

import dc.c;
import g00.p;
import java.util.List;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.MutableStateFlow;
import zz.a;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: BooleanAttributeFilterViewModel.kt */
@d(c = "com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.attributeViewModels.BooleanAttributeFilterViewModel$attributes$1$1", f = "BooleanAttributeFilterViewModel.kt", l = {51, 51}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class BooleanAttributeFilterViewModel$attributes$1$1 extends SuspendLambda implements p<CoroutineScope, a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    Object f29254a;

    /* renamed from: b  reason: collision with root package name */
    int f29255b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ MutableStateFlow<List<c>> f29256c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ BooleanAttributeFilterViewModel f29257d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BooleanAttributeFilterViewModel$attributes$1$1(MutableStateFlow<List<c>> mutableStateFlow, BooleanAttributeFilterViewModel booleanAttributeFilterViewModel, a<? super BooleanAttributeFilterViewModel$attributes$1$1> aVar) {
        super(2, aVar);
        this.f29256c = mutableStateFlow;
        this.f29257d = booleanAttributeFilterViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final a<wz.p> create(Object obj, a<?> aVar) {
        return new BooleanAttributeFilterViewModel$attributes$1$1(this.f29256c, this.f29257d, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        FlowCollector flowCollector;
        f11 = b.f();
        int i11 = this.f29255b;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 == 2) {
                    f.b(obj);
                    return wz.p.f75480a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            flowCollector = (MutableStateFlow) this.f29254a;
            f.b(obj);
        } else {
            f.b(obj);
            flowCollector = this.f29256c;
            BooleanAttributeFilterViewModel booleanAttributeFilterViewModel = this.f29257d;
            this.f29254a = flowCollector;
            this.f29255b = 1;
            obj = booleanAttributeFilterViewModel.S(this);
            if (obj == f11) {
                return f11;
            }
        }
        this.f29254a = null;
        this.f29255b = 2;
        if (flowCollector.emit(obj, this) == f11) {
            return f11;
        }
        return wz.p.f75480a;
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, a<? super wz.p> aVar) {
        return ((BooleanAttributeFilterViewModel$attributes$1$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
