package com.forsale.app.utils;

import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineScope;
/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: Add missing generic type declarations: [R] */
/* compiled from: CoroutinesExtensions.kt */
@kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.utils.CoroutinesExtensionsKt$alsoOnMain$2", f = "CoroutinesExtensions.kt", l = {12}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class CoroutinesExtensionsKt$alsoOnMain$2<R> extends SuspendLambda implements g00.p<CoroutineScope, zz.a<? super R>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f39545a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ g00.p<T, zz.a<? super R>, Object> f39546b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ T f39547c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public CoroutinesExtensionsKt$alsoOnMain$2(g00.p<? super T, ? super zz.a<? super R>, ? extends Object> pVar, T t11, zz.a<? super CoroutinesExtensionsKt$alsoOnMain$2> aVar) {
        super(2, aVar);
        this.f39546b = pVar;
        this.f39547c = t11;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new CoroutinesExtensionsKt$alsoOnMain$2(this.f39546b, this.f39547c, aVar);
    }

    @Override // g00.p
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Object obj) {
        return invoke(coroutineScope, (zz.a) ((zz.a) obj));
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        f11 = kotlin.coroutines.intrinsics.b.f();
        int i11 = this.f39545a;
        if (i11 != 0) {
            if (i11 == 1) {
                kotlin.f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            kotlin.f.b(obj);
            g00.p<T, zz.a<? super R>, Object> pVar = this.f39546b;
            T t11 = this.f39547c;
            this.f39545a = 1;
            obj = pVar.invoke(t11, this);
            if (obj == f11) {
                return f11;
            }
        }
        return obj;
    }

    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super R> aVar) {
        return ((CoroutinesExtensionsKt$alsoOnMain$2) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
