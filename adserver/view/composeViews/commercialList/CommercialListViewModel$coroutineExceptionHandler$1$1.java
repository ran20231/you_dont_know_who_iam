package com.forsale.adserver.view.composeViews.commercialList;

import com.forsale.adserver.view.composeViews.commercialList.CommercialListViewModel;
import g00.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableSharedFlow;
/* compiled from: CommercialListViewModel.kt */
@d(c = "com.forsale.adserver.view.composeViews.commercialList.CommercialListViewModel$coroutineExceptionHandler$1$1", f = "CommercialListViewModel.kt", l = {29}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class CommercialListViewModel$coroutineExceptionHandler$1$1 extends SuspendLambda implements p<CoroutineScope, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f21015a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ CommercialListViewModel f21016b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CommercialListViewModel$coroutineExceptionHandler$1$1(CommercialListViewModel commercialListViewModel, zz.a<? super CommercialListViewModel$coroutineExceptionHandler$1$1> aVar) {
        super(2, aVar);
        this.f21016b = commercialListViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new CommercialListViewModel$coroutineExceptionHandler$1$1(this.f21016b, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        f11 = kotlin.coroutines.intrinsics.b.f();
        int i11 = this.f21015a;
        if (i11 != 0) {
            if (i11 == 1) {
                f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            f.b(obj);
            if (this.f21016b.h().isEmpty()) {
                MutableSharedFlow<CommercialListViewModel.a> j11 = this.f21016b.j();
                CommercialListViewModel.a.d dVar = CommercialListViewModel.a.d.f21011a;
                this.f21015a = 1;
                if (j11.emit(dVar, this) == f11) {
                    return f11;
                }
            }
        }
        return wz.p.f75480a;
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
        return ((CommercialListViewModel$coroutineExceptionHandler$1$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
