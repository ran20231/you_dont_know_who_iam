package com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.attributeViewModels;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.d;
import okhttp3.internal.ws.WebSocketProtocol;
import zz.a;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: DropDownAttributeFilterViewModel.kt */
@d(c = "com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.attributeViewModels.DropDownAttributeFilterViewModel", f = "DropDownAttributeFilterViewModel.kt", l = {WebSocketProtocol.PAYLOAD_SHORT, 127}, m = "createSelectableDataOptions")
/* loaded from: classes2.dex */
public final class DropDownAttributeFilterViewModel$createSelectableDataOptions$1 extends ContinuationImpl {

    /* renamed from: a  reason: collision with root package name */
    Object f29281a;

    /* renamed from: b  reason: collision with root package name */
    Object f29282b;

    /* renamed from: c  reason: collision with root package name */
    boolean f29283c;

    /* renamed from: d  reason: collision with root package name */
    /* synthetic */ Object f29284d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ DropDownAttributeFilterViewModel f29285e;

    /* renamed from: f  reason: collision with root package name */
    int f29286f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DropDownAttributeFilterViewModel$createSelectableDataOptions$1(DropDownAttributeFilterViewModel dropDownAttributeFilterViewModel, a<? super DropDownAttributeFilterViewModel$createSelectableDataOptions$1> aVar) {
        super(aVar);
        this.f29285e = dropDownAttributeFilterViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object c02;
        this.f29284d = obj;
        this.f29286f |= Integer.MIN_VALUE;
        c02 = this.f29285e.c0(null, false, this);
        return c02;
    }
}
