package com.forsale.app.utils;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.RepeatOnLifecycleKt;
import kotlin.KotlinNothingValueException;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.MutableSharedFlow;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: OneShotEventHandler.kt */
@kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.utils.OneShotEventHandler$observe$1", f = "OneShotEventHandler.kt", l = {58}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class OneShotEventHandler$observe$1 extends SuspendLambda implements g00.p<CoroutineScope, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f39629a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ androidx.lifecycle.s f39630b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ OneShotEventHandler<T> f39631c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ FlowCollector<T> f39632d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: OneShotEventHandler.kt */
    @kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.utils.OneShotEventHandler$observe$1$1", f = "OneShotEventHandler.kt", l = {59}, m = "invokeSuspend")
    /* renamed from: com.forsale.app.utils.OneShotEventHandler$observe$1$1  reason: invalid class name */
    /* loaded from: classes3.dex */
    public static final class AnonymousClass1 extends SuspendLambda implements g00.p<CoroutineScope, zz.a<? super wz.p>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f39633a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ OneShotEventHandler<T> f39634b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ FlowCollector<T> f39635c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(OneShotEventHandler<T> oneShotEventHandler, FlowCollector<? super T> flowCollector, zz.a<? super AnonymousClass1> aVar) {
            super(2, aVar);
            this.f39634b = oneShotEventHandler;
            this.f39635c = flowCollector;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
            return new AnonymousClass1(this.f39634b, this.f39635c, aVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object f11;
            MutableSharedFlow mutableSharedFlow;
            f11 = kotlin.coroutines.intrinsics.b.f();
            int i11 = this.f39633a;
            if (i11 != 0) {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.f.b(obj);
            } else {
                kotlin.f.b(obj);
                mutableSharedFlow = ((OneShotEventHandler) this.f39634b).f39624b;
                Object obj2 = this.f39635c;
                this.f39633a = 1;
                if (mutableSharedFlow.collect(obj2, this) == f11) {
                    return f11;
                }
            }
            throw new KotlinNothingValueException();
        }

        @Override // g00.p
        public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
            return ((AnonymousClass1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public OneShotEventHandler$observe$1(androidx.lifecycle.s sVar, OneShotEventHandler<T> oneShotEventHandler, FlowCollector<? super T> flowCollector, zz.a<? super OneShotEventHandler$observe$1> aVar) {
        super(2, aVar);
        this.f39630b = sVar;
        this.f39631c = oneShotEventHandler;
        this.f39632d = flowCollector;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new OneShotEventHandler$observe$1(this.f39630b, this.f39631c, this.f39632d, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        f11 = kotlin.coroutines.intrinsics.b.f();
        int i11 = this.f39629a;
        if (i11 != 0) {
            if (i11 == 1) {
                kotlin.f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            kotlin.f.b(obj);
            androidx.lifecycle.s sVar = this.f39630b;
            Lifecycle.State state = Lifecycle.State.STARTED;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f39631c, this.f39632d, null);
            this.f39629a = 1;
            if (RepeatOnLifecycleKt.b(sVar, state, anonymousClass1, this) == f11) {
                return f11;
            }
        }
        return wz.p.f75480a;
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
        return ((OneShotEventHandler$observe$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
