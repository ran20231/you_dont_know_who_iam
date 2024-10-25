package com.forsale.app.features.categories.listings.filtration.fullFiltration.arch;

import com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.baseViewModel.FilterViewModel;
import g00.p;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.s;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import kotlin.jvm.internal.o;
import kotlinx.coroutines.AwaitKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Deferred;
import zz.a;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: FiltersMediator.kt */
@d(c = "com.forsale.app.features.categories.listings.filtration.fullFiltration.arch.FiltersMediator$findAndNotifyChildrenThatParentChanged$2", f = "FiltersMediator.kt", l = {164}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class FiltersMediator$findAndNotifyChildrenThatParentChanged$2 extends SuspendLambda implements p<CoroutineScope, a<? super List<? extends wz.p>>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f29100a;

    /* renamed from: b  reason: collision with root package name */
    private /* synthetic */ Object f29101b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ List<FilterViewModel<?, ?, ?>> f29102c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ FilterViewModel<?, ?, ?> f29103d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public FiltersMediator$findAndNotifyChildrenThatParentChanged$2(List<? extends FilterViewModel<?, ?, ?>> list, FilterViewModel<?, ?, ?> filterViewModel, a<? super FiltersMediator$findAndNotifyChildrenThatParentChanged$2> aVar) {
        super(2, aVar);
        this.f29102c = list;
        this.f29103d = filterViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final a<wz.p> create(Object obj, a<?> aVar) {
        FiltersMediator$findAndNotifyChildrenThatParentChanged$2 filtersMediator$findAndNotifyChildrenThatParentChanged$2 = new FiltersMediator$findAndNotifyChildrenThatParentChanged$2(this.f29102c, this.f29103d, aVar);
        filtersMediator$findAndNotifyChildrenThatParentChanged$2.f29101b = obj;
        return filtersMediator$findAndNotifyChildrenThatParentChanged$2;
    }

    @Override // g00.p
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, a<? super List<? extends wz.p>> aVar) {
        return invoke2(coroutineScope, (a<? super List<wz.p>>) aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        int y11;
        Deferred async$default;
        f11 = b.f();
        int i11 = this.f29100a;
        if (i11 != 0) {
            if (i11 == 1) {
                f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            f.b(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.f29101b;
            FilterViewModel<?, ?, ?> filterViewModel = this.f29103d;
            ArrayList<FilterViewModel> arrayList = new ArrayList();
            for (Object obj2 : this.f29102c) {
                if (o.d(((FilterViewModel) obj2).w().getParentId(), filterViewModel.w().getId())) {
                    arrayList.add(obj2);
                }
            }
            FilterViewModel<?, ?, ?> filterViewModel2 = this.f29103d;
            y11 = s.y(arrayList, 10);
            ArrayList arrayList2 = new ArrayList(y11);
            for (FilterViewModel filterViewModel3 : arrayList) {
                async$default = BuildersKt__Builders_commonKt.async$default(coroutineScope, null, null, new FiltersMediator$findAndNotifyChildrenThatParentChanged$2$2$1(filterViewModel3, filterViewModel2, null), 3, null);
                arrayList2.add(async$default);
            }
            this.f29100a = 1;
            obj = AwaitKt.awaitAll(arrayList2, this);
            if (obj == f11) {
                return f11;
            }
        }
        return obj;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, a<? super List<wz.p>> aVar) {
        return ((FiltersMediator$findAndNotifyChildrenThatParentChanged$2) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
