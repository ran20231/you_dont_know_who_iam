package com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.commonViewModelsHandlers;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.d;
import zz.a;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: SelectableHandler.kt */
@d(c = "com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.commonViewModelsHandlers.SelectableHandler", f = "SelectableHandler.kt", l = {76}, m = "updateFilterRange")
/* loaded from: classes2.dex */
public final class SelectableHandler$updateFilterRange$1 extends ContinuationImpl {

    /* renamed from: a  reason: collision with root package name */
    /* synthetic */ Object f29462a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ SelectableHandler f29463b;

    /* renamed from: c  reason: collision with root package name */
    int f29464c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SelectableHandler$updateFilterRange$1(SelectableHandler selectableHandler, a<? super SelectableHandler$updateFilterRange$1> aVar) {
        super(aVar);
        this.f29463b = selectableHandler;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f29462a = obj;
        this.f29464c |= Integer.MIN_VALUE;
        return this.f29463b.h(null, null, null, this);
    }
}
