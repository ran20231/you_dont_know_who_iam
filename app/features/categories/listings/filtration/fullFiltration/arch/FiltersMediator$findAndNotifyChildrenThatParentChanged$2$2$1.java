package com.forsale.app.features.categories.listings.filtration.fullFiltration.arch;

import com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.baseViewModel.FilterViewModel;
import g00.p;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;
import zz.a;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: FiltersMediator.kt */
@d(c = "com.forsale.app.features.categories.listings.filtration.fullFiltration.arch.FiltersMediator$findAndNotifyChildrenThatParentChanged$2$2$1", f = "FiltersMediator.kt", l = {161}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class FiltersMediator$findAndNotifyChildrenThatParentChanged$2$2$1 extends SuspendLambda implements p<CoroutineScope, a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f29104a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ FilterViewModel<?, ?, ?> f29105b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ FilterViewModel<?, ?, ?> f29106c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FiltersMediator$findAndNotifyChildrenThatParentChanged$2$2$1(FilterViewModel<?, ?, ?> filterViewModel, FilterViewModel<?, ?, ?> filterViewModel2, a<? super FiltersMediator$findAndNotifyChildrenThatParentChanged$2$2$1> aVar) {
        super(2, aVar);
        this.f29105b = filterViewModel;
        this.f29106c = filterViewModel2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final a<wz.p> create(Object obj, a<?> aVar) {
        return new FiltersMediator$findAndNotifyChildrenThatParentChanged$2$2$1(this.f29105b, this.f29106c, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        f11 = b.f();
        int i11 = this.f29104a;
        if (i11 != 0) {
            if (i11 == 1) {
                f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            f.b(obj);
            FilterViewModel<?, ?, ?> filterViewModel = this.f29105b;
            FilterViewModel<?, ?, ?> filterViewModel2 = this.f29106c;
            this.f29104a = 1;
            if (filterViewModel.L(filterViewModel2, this) == f11) {
                return f11;
            }
        }
        return wz.p.f75480a;
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, a<? super wz.p> aVar) {
        return ((FiltersMediator$findAndNotifyChildrenThatParentChanged$2$2$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
