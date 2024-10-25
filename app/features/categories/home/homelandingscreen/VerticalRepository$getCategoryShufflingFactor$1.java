package com.forsale.app.features.categories.home.homelandingscreen;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.d;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: VerticalRepository.kt */
@d(c = "com.forsale.app.features.categories.home.homelandingscreen.VerticalRepository", f = "VerticalRepository.kt", l = {67}, m = "getCategoryShufflingFactor")
/* loaded from: classes2.dex */
public final class VerticalRepository$getCategoryShufflingFactor$1 extends ContinuationImpl {

    /* renamed from: a  reason: collision with root package name */
    /* synthetic */ Object f23934a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ VerticalRepository f23935b;

    /* renamed from: c  reason: collision with root package name */
    int f23936c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VerticalRepository$getCategoryShufflingFactor$1(VerticalRepository verticalRepository, zz.a<? super VerticalRepository$getCategoryShufflingFactor$1> aVar) {
        super(aVar);
        this.f23935b = verticalRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f23934a = obj;
        this.f23936c |= Integer.MIN_VALUE;
        return this.f23935b.a(0, this);
    }
}
