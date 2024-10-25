package com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.baseViewModel;

import fc.b;
import g00.q;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import wz.p;
import zz.a;
/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: Add missing generic type declarations: [FD] */
/* compiled from: FilterViewModel.kt */
@d(c = "com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.baseViewModel.FilterViewModel$filtrationOptions$1", f = "FilterViewModel.kt", l = {57}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class FilterViewModel$filtrationOptions$1<FD> extends SuspendLambda implements q<FD, Long, a<? super b>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f29445a;

    /* renamed from: b  reason: collision with root package name */
    /* synthetic */ Object f29446b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ FilterViewModel<FD, FR, E> f29447c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FilterViewModel$filtrationOptions$1(FilterViewModel<FD, FR, E> filterViewModel, a<? super FilterViewModel$filtrationOptions$1> aVar) {
        super(3, aVar);
        this.f29447c = filterViewModel;
    }

    public final Object b(FD fd2, long j11, a<? super b> aVar) {
        FilterViewModel$filtrationOptions$1 filterViewModel$filtrationOptions$1 = new FilterViewModel$filtrationOptions$1(this.f29447c, aVar);
        filterViewModel$filtrationOptions$1.f29446b = fd2;
        return filterViewModel$filtrationOptions$1.invokeSuspend(p.f75480a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // g00.q
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Long l11, a<? super b> aVar) {
        return b(obj, l11.longValue(), aVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        f11 = kotlin.coroutines.intrinsics.b.f();
        int i11 = this.f29445a;
        if (i11 != 0) {
            if (i11 == 1) {
                f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            f.b(obj);
            Object obj2 = this.f29446b;
            FilterViewModel<FD, FR, E> filterViewModel = this.f29447c;
            this.f29445a = 1;
            obj = filterViewModel.Y(obj2, this);
            if (obj == f11) {
                return f11;
            }
        }
        return obj;
    }
}
