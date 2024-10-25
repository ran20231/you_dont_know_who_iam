package com.forsale.app.features.categories.home.allverticals;

import com.google.logging.type.LogSeverity;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: AllVerticalsViewModel.kt */
@kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.features.categories.home.allverticals.AllVerticalsViewModel", f = "AllVerticalsViewModel.kt", l = {196, 197, 198, 199, LogSeverity.INFO_VALUE, 201, 202, 203}, m = "fetchSectionData")
/* loaded from: classes2.dex */
public final class AllVerticalsViewModel$fetchSectionData$1 extends ContinuationImpl {

    /* renamed from: a  reason: collision with root package name */
    Object f23451a;

    /* renamed from: b  reason: collision with root package name */
    Object f23452b;

    /* renamed from: c  reason: collision with root package name */
    /* synthetic */ Object f23453c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ AllVerticalsViewModel f23454d;

    /* renamed from: e  reason: collision with root package name */
    int f23455e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AllVerticalsViewModel$fetchSectionData$1(AllVerticalsViewModel allVerticalsViewModel, zz.a<? super AllVerticalsViewModel$fetchSectionData$1> aVar) {
        super(aVar);
        this.f23454d = allVerticalsViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f23453c = obj;
        this.f23455e |= Integer.MIN_VALUE;
        return this.f23454d.I(this);
    }
}
