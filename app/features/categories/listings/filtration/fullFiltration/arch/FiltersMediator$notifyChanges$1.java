package com.forsale.app.features.categories.listings.filtration.fullFiltration.arch;

import com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.baseViewModel.FilterViewModel;
import g00.p;
import java.util.List;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlinx.coroutines.CoroutineScope;
import zz.a;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: FiltersMediator.kt */
@d(c = "com.forsale.app.features.categories.listings.filtration.fullFiltration.arch.FiltersMediator$notifyChanges$1", f = "FiltersMediator.kt", l = {121, 122, 124, 124}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class FiltersMediator$notifyChanges$1 extends SuspendLambda implements p<CoroutineScope, a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    Object f29115a;

    /* renamed from: b  reason: collision with root package name */
    Object f29116b;

    /* renamed from: c  reason: collision with root package name */
    Object f29117c;

    /* renamed from: d  reason: collision with root package name */
    int f29118d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ List<FilterViewModel<?, ?, ?>> f29119e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ FiltersMediator f29120f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public FiltersMediator$notifyChanges$1(List<? extends FilterViewModel<?, ?, ?>> list, FiltersMediator filtersMediator, a<? super FiltersMediator$notifyChanges$1> aVar) {
        super(2, aVar);
        this.f29119e = list;
        this.f29120f = filtersMediator;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final a<wz.p> create(Object obj, a<?> aVar) {
        return new FiltersMediator$notifyChanges$1(this.f29119e, this.f29120f, aVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x009a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a9 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00bd A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:44:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x00a7 -> B:21:0x006d). Please submit an issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            Method dump skipped, instructions count: 204
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.categories.listings.filtration.fullFiltration.arch.FiltersMediator$notifyChanges$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, a<? super wz.p> aVar) {
        return ((FiltersMediator$notifyChanges$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
