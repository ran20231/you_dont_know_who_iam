package com.forsale.adserver.view.viewmodel;

import g00.l;
import g00.p;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import zz.a;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: BaseViewModel.kt */
@d(c = "com.forsale.adserver.view.viewmodel.BaseViewModel$launchBg$1", f = "BaseViewModel.kt", l = {29}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class BaseViewModel$launchBg$1 extends SuspendLambda implements p<CoroutineScope, a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f21650a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ l<a<? super wz.p>, Object> f21651b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: BaseViewModel.kt */
    @d(c = "com.forsale.adserver.view.viewmodel.BaseViewModel$launchBg$1$1", f = "BaseViewModel.kt", l = {30}, m = "invokeSuspend")
    /* renamed from: com.forsale.adserver.view.viewmodel.BaseViewModel$launchBg$1$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    public static final class AnonymousClass1 extends SuspendLambda implements p<CoroutineScope, a<? super wz.p>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f21652a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ l<a<? super wz.p>, Object> f21653b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(l<? super a<? super wz.p>, ? extends Object> lVar, a<? super AnonymousClass1> aVar) {
            super(2, aVar);
            this.f21653b = lVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final a<wz.p> create(Object obj, a<?> aVar) {
            return new AnonymousClass1(this.f21653b, aVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object f11;
            f11 = b.f();
            int i11 = this.f21652a;
            if (i11 != 0) {
                if (i11 == 1) {
                    f.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                f.b(obj);
                l<a<? super wz.p>, Object> lVar = this.f21653b;
                this.f21652a = 1;
                if (lVar.invoke(this) == f11) {
                    return f11;
                }
            }
            return wz.p.f75480a;
        }

        @Override // g00.p
        public final Object invoke(CoroutineScope coroutineScope, a<? super wz.p> aVar) {
            return ((AnonymousClass1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public BaseViewModel$launchBg$1(l<? super a<? super wz.p>, ? extends Object> lVar, a<? super BaseViewModel$launchBg$1> aVar) {
        super(2, aVar);
        this.f21651b = lVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final a<wz.p> create(Object obj, a<?> aVar) {
        return new BaseViewModel$launchBg$1(this.f21651b, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        f11 = b.f();
        int i11 = this.f21650a;
        if (i11 != 0) {
            if (i11 == 1) {
                f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            f.b(obj);
            CoroutineDispatcher io2 = Dispatchers.getIO();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f21651b, null);
            this.f21650a = 1;
            if (BuildersKt.withContext(io2, anonymousClass1, this) == f11) {
                return f11;
            }
        }
        return wz.p.f75480a;
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, a<? super wz.p> aVar) {
        return ((BaseViewModel$launchBg$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
