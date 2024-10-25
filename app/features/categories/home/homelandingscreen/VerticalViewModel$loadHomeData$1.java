package com.forsale.app.features.categories.home.homelandingscreen;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.d;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: VerticalViewModel.kt */
@d(c = "com.forsale.app.features.categories.home.homelandingscreen.VerticalViewModel", f = "VerticalViewModel.kt", l = {313, 321, 323, 331}, m = "loadHomeData")
/* loaded from: classes2.dex */
public final class VerticalViewModel$loadHomeData$1 extends ContinuationImpl {

    /* renamed from: a  reason: collision with root package name */
    Object f23988a;

    /* renamed from: b  reason: collision with root package name */
    Object f23989b;

    /* renamed from: c  reason: collision with root package name */
    /* synthetic */ Object f23990c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ VerticalViewModel f23991d;

    /* renamed from: e  reason: collision with root package name */
    int f23992e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VerticalViewModel$loadHomeData$1(VerticalViewModel verticalViewModel, zz.a<? super VerticalViewModel$loadHomeData$1> aVar) {
        super(aVar);
        this.f23991d = verticalViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object G1;
        this.f23990c = obj;
        this.f23992e |= Integer.MIN_VALUE;
        G1 = this.f23991d.G1(null, false, this);
        return G1;
    }
}
