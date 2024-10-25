package com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.generalViewModels;

import com.forsale.app.features.categories.listings.filtration.fullFiltration.arch.FiltersMediator;
import g00.p;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;
import zz.a;
/* compiled from: ResetAllViewModel.kt */
@d(c = "com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.generalViewModels.ResetAllViewModel$onFilterClicked$1", f = "ResetAllViewModel.kt", l = {33}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class ResetAllViewModel$onFilterClicked$1 extends SuspendLambda implements p<CoroutineScope, a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f29575a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ ResetAllViewModel f29576b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ResetAllViewModel$onFilterClicked$1(ResetAllViewModel resetAllViewModel, a<? super ResetAllViewModel$onFilterClicked$1> aVar) {
        super(2, aVar);
        this.f29576b = resetAllViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final a<wz.p> create(Object obj, a<?> aVar) {
        return new ResetAllViewModel$onFilterClicked$1(this.f29576b, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        FiltersMediator s11;
        f11 = b.f();
        int i11 = this.f29575a;
        if (i11 != 0) {
            if (i11 == 1) {
                f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            f.b(obj);
            s11 = this.f29576b.s();
            this.f29575a = 1;
            if (s11.t(this) == f11) {
                return f11;
            }
        }
        return wz.p.f75480a;
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, a<? super wz.p> aVar) {
        return ((ResetAllViewModel$onFilterClicked$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
