package com.forsale.app.interactors;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.d;
import zz.a;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: SetupCalculator.kt */
@d(c = "com.forsale.app.interactors.SetupCalculator", f = "SetupCalculator.kt", l = {27, 47, 64}, m = "invoke")
/* loaded from: classes2.dex */
public final class SetupCalculator$invoke$1 extends ContinuationImpl {
    final /* synthetic */ SetupCalculator A;
    int B;

    /* renamed from: a  reason: collision with root package name */
    Object f37470a;

    /* renamed from: b  reason: collision with root package name */
    Object f37471b;

    /* renamed from: c  reason: collision with root package name */
    Object f37472c;

    /* renamed from: d  reason: collision with root package name */
    Object f37473d;

    /* renamed from: e  reason: collision with root package name */
    Object f37474e;

    /* renamed from: f  reason: collision with root package name */
    boolean f37475f;

    /* renamed from: g  reason: collision with root package name */
    float f37476g;

    /* renamed from: h  reason: collision with root package name */
    float f37477h;

    /* renamed from: i  reason: collision with root package name */
    float f37478i;

    /* renamed from: j  reason: collision with root package name */
    float f37479j;

    /* renamed from: x  reason: collision with root package name */
    int f37480x;

    /* renamed from: y  reason: collision with root package name */
    int f37481y;

    /* renamed from: z  reason: collision with root package name */
    /* synthetic */ Object f37482z;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SetupCalculator$invoke$1(SetupCalculator setupCalculator, a<? super SetupCalculator$invoke$1> aVar) {
        super(aVar);
        this.A = setupCalculator;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f37482z = obj;
        this.B |= Integer.MIN_VALUE;
        return this.A.b(null, null, null, null, this);
    }
}
