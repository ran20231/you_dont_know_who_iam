package com.forsale.app.utils;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.RepeatOnLifecycleKt;
import com.google.android.gms.common.ConnectionResult;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineScope;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: LifeCycleUtils.kt */
@kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.utils.LifeCycleUtilsKt$activityScope$1", f = "LifeCycleUtils.kt", l = {ConnectionResult.API_DISABLED}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class LifeCycleUtilsKt$activityScope$1 extends SuspendLambda implements g00.p<CoroutineScope, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f39573a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ androidx.appcompat.app.d f39574b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ g00.l<zz.a<? super wz.p>, Object> f39575c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: LifeCycleUtils.kt */
    @kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.utils.LifeCycleUtilsKt$activityScope$1$1", f = "LifeCycleUtils.kt", l = {24}, m = "invokeSuspend")
    /* renamed from: com.forsale.app.utils.LifeCycleUtilsKt$activityScope$1$1  reason: invalid class name */
    /* loaded from: classes3.dex */
    public static final class AnonymousClass1 extends SuspendLambda implements g00.p<CoroutineScope, zz.a<? super wz.p>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f39576a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ g00.l<zz.a<? super wz.p>, Object> f39577b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(g00.l<? super zz.a<? super wz.p>, ? extends Object> lVar, zz.a<? super AnonymousClass1> aVar) {
            super(2, aVar);
            this.f39577b = lVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
            return new AnonymousClass1(this.f39577b, aVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object f11;
            f11 = kotlin.coroutines.intrinsics.b.f();
            int i11 = this.f39576a;
            if (i11 != 0) {
                if (i11 == 1) {
                    kotlin.f.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                kotlin.f.b(obj);
                g00.l<zz.a<? super wz.p>, Object> lVar = this.f39577b;
                this.f39576a = 1;
                if (lVar.invoke(this) == f11) {
                    return f11;
                }
            }
            return wz.p.f75480a;
        }

        @Override // g00.p
        public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
            return ((AnonymousClass1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public LifeCycleUtilsKt$activityScope$1(androidx.appcompat.app.d dVar, g00.l<? super zz.a<? super wz.p>, ? extends Object> lVar, zz.a<? super LifeCycleUtilsKt$activityScope$1> aVar) {
        super(2, aVar);
        this.f39574b = dVar;
        this.f39575c = lVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new LifeCycleUtilsKt$activityScope$1(this.f39574b, this.f39575c, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        f11 = kotlin.coroutines.intrinsics.b.f();
        int i11 = this.f39573a;
        if (i11 != 0) {
            if (i11 == 1) {
                kotlin.f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            kotlin.f.b(obj);
            androidx.appcompat.app.d dVar = this.f39574b;
            Lifecycle.State state = Lifecycle.State.STARTED;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f39575c, null);
            this.f39573a = 1;
            if (RepeatOnLifecycleKt.b(dVar, state, anonymousClass1, this) == f11) {
                return f11;
            }
        }
        return wz.p.f75480a;
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
        return ((LifeCycleUtilsKt$activityScope$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
