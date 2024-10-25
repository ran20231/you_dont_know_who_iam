package com.forsale.app.features.categories.listings.items.dfp;

import g00.p;
import j0.k0;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;
import zz.a;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: GamCompose.kt */
@d(c = "com.forsale.app.features.categories.listings.items.dfp.GamComposeKt$GamComponent$2$1", f = "GamCompose.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class GamComposeKt$GamComponent$2$1 extends SuspendLambda implements p<CoroutineScope, a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f30614a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ k0<GamStates> f30615b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GamComposeKt$GamComponent$2$1(k0<GamStates> k0Var, a<? super GamComposeKt$GamComponent$2$1> aVar) {
        super(2, aVar);
        this.f30615b = k0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final a<wz.p> create(Object obj, a<?> aVar) {
        return new GamComposeKt$GamComponent$2$1(this.f30615b, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        b.f();
        if (this.f30614a == 0) {
            f.b(obj);
            GamComposeKt.d(this.f30615b, GamStates.IS_LOADING);
            return wz.p.f75480a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, a<? super wz.p> aVar) {
        return ((GamComposeKt$GamComponent$2$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
