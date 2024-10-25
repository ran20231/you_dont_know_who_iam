package com.forsale.app.utils.popUpsPrioritizer;

import androidx.lifecycle.b0;
import g00.p;
import java.util.List;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlow;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Prioritizer.kt */
@d(c = "com.forsale.app.utils.popUpsPrioritizer.PrioritizerImpl$consume$2", f = "Prioritizer.kt", l = {61, 62}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class PrioritizerImpl$consume$2 extends SuspendLambda implements p<CoroutineScope, zz.a<? super ij.a>, Object> {

    /* renamed from: a  reason: collision with root package name */
    Object f40396a;

    /* renamed from: b  reason: collision with root package name */
    Object f40397b;

    /* renamed from: c  reason: collision with root package name */
    int f40398c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public PrioritizerImpl$consume$2(zz.a<? super PrioritizerImpl$consume$2> aVar) {
        super(2, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new PrioritizerImpl$consume$2(aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        List list;
        Object m02;
        ij.a aVar;
        b0 i11;
        ij.a aVar2;
        f11 = b.f();
        int i12 = this.f40398c;
        if (i12 != 0) {
            if (i12 != 1) {
                if (i12 == 2) {
                    ij.a aVar3 = (ij.a) this.f40396a;
                    f.b(obj);
                    return aVar3;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aVar = (ij.a) this.f40397b;
            aVar2 = (ij.a) this.f40396a;
            f.b(obj);
        } else {
            f.b(obj);
            PrioritizerImpl prioritizerImpl = PrioritizerImpl.f40390b;
            prioritizerImpl.g();
            list = PrioritizerImpl.f40392d;
            m02 = CollectionsKt___CollectionsKt.m0(list);
            aVar = (ij.a) m02;
            i11 = prioritizerImpl.i();
            i11.postValue(aVar);
            if (aVar == null) {
                return null;
            }
            MutableSharedFlow<wz.p> b11 = aVar.b();
            wz.p pVar = wz.p.f75480a;
            this.f40396a = aVar;
            this.f40397b = aVar;
            this.f40398c = 1;
            if (b11.emit(pVar, this) == f11) {
                return f11;
            }
            aVar2 = aVar;
        }
        SharedFlow<wz.p> a11 = aVar.a();
        PrioritizerImpl$consume$2$1$1 prioritizerImpl$consume$2$1$1 = new PrioritizerImpl$consume$2$1$1(null);
        this.f40396a = aVar2;
        this.f40397b = null;
        this.f40398c = 2;
        if (FlowKt.collectLatest(a11, prioritizerImpl$consume$2$1$1, this) == f11) {
            return f11;
        }
        return aVar2;
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super ij.a> aVar) {
        return ((PrioritizerImpl$consume$2) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
